package com.maideniles.maidensmerrymaking.entity.custom;

import com.maideniles.maidensmerrymaking.init.ModEntityTypes;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CarrotBlock;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.controller.JumpController;
import net.minecraft.entity.ai.controller.MovementController;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.pathfinding.Path;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.scoreboard.Team;
import net.minecraft.server.management.PreYggdrasilConverter;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.*;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

public class ColoredBunnyEntity extends TameableEntity {

    private static final Item TAME_ITEMS = Items.CARROT;
    private static final Item DEADLY_ITEM = Items.COOKIE;
    protected static final DataParameter<Byte> TAMED = EntityDataManager.createKey(TameableEntity.class, DataSerializers.BYTE);
    protected static final DataParameter<Optional<UUID>> OWNER_UNIQUE_ID = EntityDataManager.createKey(TameableEntity.class, DataSerializers.OPTIONAL_UNIQUE_ID);
    private boolean sitting;

  //  private static final ResourceLocation KILLER_BUNNY = new ResourceLocation("killer_bunny");
    private int jumpTicks;
    private int jumpDuration;
    private boolean wasOnGround;
    private int currentMoveTypeDuration;
    private int carrotTicks;

    public ColoredBunnyEntity(EntityType<? extends TameableEntity> p_i50247_1_, World p_i50247_2_) {
        super(p_i50247_1_, p_i50247_2_);
        this.jumpController = new JumpHelperController(this);
        this.moveController = new MoveHelperController(this);
        this.setupTamedAI();

    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH,3.0D)
                .createMutableAttribute(Attributes.FLYING_SPEED, 1.3D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED,1.6D);

    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new SwimGoal(this));
        this.goalSelector.addGoal(2, new BreedGoal(this, 0.8D));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1.0D, Ingredient.fromItems(Items.CARROT, Items.GOLDEN_CARROT, Blocks.DANDELION), false));
        this.goalSelector.addGoal(6, new WaterAvoidingRandomWalkingGoal(this, 0.6D));
        this.goalSelector.addGoal(11, new LookAtGoal(this, PlayerEntity.class, 10.0F));
        this.goalSelector.addGoal(6, new FollowOwnerGoal(this, 0.25D, 1.0F, 1.50F, false));
    }

    public class JumpHelperController extends JumpController {
        private final ColoredBunnyEntity bunny;
        private boolean canJump;

        public JumpHelperController(ColoredBunnyEntity bunny) {
            super(bunny);
            this.bunny = bunny;
        }

        public boolean getIsJumping() {
            return this.isJumping;
        }

        public boolean canJump() {
            return this.canJump;
        }

        public void setCanJump(boolean canJumpIn) {
            this.canJump = canJumpIn;
        }

        /**
         * Called to actually make the entity jump if isJumping is true.
         */
        public void tick() {
            if (this.isJumping) {
                this.bunny.startJumping();
                this.isJumping = false;
            }

        }
    }

    public void startJumping() {
        this.setJumping(true);
        this.jumpDuration = 10;
        this.jumpTicks = 0;
    }

    protected float getJumpUpwardsMotion() {
        if (!this.collidedHorizontally && (!this.moveController.isUpdating() || !(this.moveController.getY() > this.getPosY() + 0.5D))) {
            Path path = this.navigator.getPath();
            if (path != null && !path.isFinished()) {
                Vector3d vector3d = path.getPosition(this);
                if (vector3d.y > this.getPosY() + 0.5D) {
                    return 0.5F;
                }
            }

            return this.moveController.getSpeed() <= 0.6D ? 0.2F : 0.3F;
        } else {
            return 0.5F;
        }
    }

    protected void jump() {
        super.jump();
        double d0 = this.moveController.getSpeed();
        if (d0 > 0.0D) {
            double d1 = horizontalMag(this.getMotion());
            if (d1 < 0.01D) {
                this.moveRelative(0.1F, new Vector3d(0.0D, 0.0D, 1.0D));
            }
        }

        if (!this.world.isRemote) {
            this.world.setEntityState(this, (byte)1);
        }

    }

    @OnlyIn(Dist.CLIENT)
    public float getJumpCompletion(float p_175521_1_) {
        return this.jumpDuration == 0 ? 0.0F : ((float)this.jumpTicks + p_175521_1_) / (float)this.jumpDuration;
    }

    public void setMovementSpeed(double newSpeed) {
        this.getNavigator().setSpeed(newSpeed);
        this.moveController.setMoveTo(this.moveController.getX(), this.moveController.getY(), this.moveController.getZ(), newSpeed);
    }

    public void setJumping(boolean jumping) {
        super.setJumping(jumping);
        if (jumping) {
            this.playSound(this.getJumpSound(), this.getSoundVolume(), ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F) * 0.8F);
        }

    }

    public boolean shouldSpawnRunningEffects() {
        return false;
    }

    private void calculateRotationYaw(double x, double z) {
        this.rotationYaw = (float)(MathHelper.atan2(z - this.getPosZ(), x - this.getPosX()) * (double)(180F / (float)Math.PI)) - 90.0F;
    }

    private void enableJumpControl() {
        ((JumpHelperController)this.jumpController).setCanJump(true);
    }

    private void disableJumpControl() {
        ((JumpHelperController)this.jumpController).setCanJump(false);
    }

    private void updateMoveTypeDuration() {
        if (this.moveController.getSpeed() < 2.2D) {
            this.currentMoveTypeDuration = 10;
        } else {
            this.currentMoveTypeDuration = 1;
        }

    }

    private void checkLandingDelay() {
        this.updateMoveTypeDuration();
        this.disableJumpControl();
    }





    protected void registerData() {
        super.registerData();
        this.dataManager.register(TAMED, (byte)0);
        this.dataManager.register(OWNER_UNIQUE_ID, Optional.empty());
    }



    public void livingTick() {
        super.livingTick();
        if (this.jumpTicks != this.jumpDuration) {
            ++this.jumpTicks;
        } else if (this.jumpDuration != 0) {
            this.jumpTicks = 0;
            this.jumpDuration = 0;
            this.setJumping(false);
        }

    }

    public static AttributeModifierMap.MutableAttribute func_234224_eJ_() {
        return MobEntity.func_233666_p_().createMutableAttribute(Attributes.MAX_HEALTH, 3.0D).createMutableAttribute(Attributes.MOVEMENT_SPEED, (double)0.3F);
    }




    public void readAdditional(CompoundNBT compound) {
        super.readAdditional(compound);

        this.carrotTicks = compound.getInt("MoreCarrotTicks");
        UUID uuid;
        if (compound.hasUniqueId("Owner")) {
            uuid = compound.getUniqueId("Owner");
        } else {
            String s = compound.getString("Owner");
            uuid = PreYggdrasilConverter.convertMobOwnerIfNeeded(this.getServer(), s);
        }

        if (uuid != null) {
            try {
                this.setOwnerId(uuid);
                this.setTamed(true);
            } catch (Throwable throwable) {
                this.setTamed(false);
            }
        }

        this.sitting = compound.getBoolean("Sitting");
        this.setQueuedToSit(this.sitting);
    }

    public void writeAdditional(CompoundNBT compound) {
        super.writeAdditional(compound);

        this.carrotTicks = compound.getInt("MoreCarrotTicks");
        if (this.getOwnerId() != null) {
            compound.putUniqueId("Owner", this.getOwnerId());
        }

        compound.putBoolean("Sitting", this.sitting);
    }

    protected SoundEvent getJumpSound() {
        return SoundEvents.ENTITY_RABBIT_JUMP;
    }

    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_RABBIT_AMBIENT;
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundEvents.ENTITY_RABBIT_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_RABBIT_DEATH;
    }


    public boolean canBeLeashedTo(PlayerEntity player) {
        return !this.getLeashed();
    }



    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource source, float amount) {
        return this.isInvulnerableTo(source) ? false : super.attackEntityFrom(source, amount);
    }

    private boolean isColoredBunnyBreedingItem(Item itemIn) {
        return itemIn == Items.CARROT || itemIn == Items.GOLDEN_CARROT || itemIn == Blocks.DANDELION.asItem();
    }

    public ColoredBunnyEntity createChild(ServerWorld world, AgeableEntity mate) {
        ColoredBunnyEntity bunnyentity = ModEntityTypes.COLORED_BUNNY.get().create(world);

        return bunnyentity;
    }

    /**
     * Checks if the parameter is an item which this animal can be fed to breed it (wheat, carrots or seeds depending on
     * the animal type)
     */
    public boolean isBreedingItem(ItemStack stack) {
        return this.isColoredBunnyBreedingItem(stack.getItem());
    }








    public static boolean func_223321_c(EntityType<ColoredBunnyEntity> p_223321_0_, IWorld p_223321_1_, SpawnReason reason, BlockPos p_223321_3_, Random p_223321_4_) {
        BlockState blockstate = p_223321_1_.getBlockState(p_223321_3_.down());
        return (blockstate.matchesBlock(Blocks.GRASS_BLOCK) || blockstate.matchesBlock(Blocks.SNOW) || blockstate.matchesBlock(Blocks.SAND)) && p_223321_1_.getLightSubtracted(p_223321_3_, 0) > 8;
    }

    /**

     */
    private boolean isCarrotEaten() {
        return this.carrotTicks == 0;
    }

    /**
     * Handler for {@link World#setEntityState}
     */


    @OnlyIn(Dist.CLIENT)
    public Vector3d getLeashStartPosition() {
        return new Vector3d(0.0D, (double)(0.6F * this.getEyeHeight()), (double)(this.getWidth() * 0.4F));
    }

    static class AvoidEntityGoal<T extends LivingEntity> extends net.minecraft.entity.ai.goal.AvoidEntityGoal<T> {
        private final ColoredBunnyEntity bunny;

        public AvoidEntityGoal(ColoredBunnyEntity bunny, Class<T> p_i46403_2_, float p_i46403_3_, double p_i46403_4_, double p_i46403_6_) {
            super(bunny, p_i46403_2_, p_i46403_3_, p_i46403_4_, p_i46403_6_);
            this.bunny = bunny;
        }

        /**
         * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
         * method as well.
         */

    }

    static class EvilAttackGoal extends MeleeAttackGoal {
        public EvilAttackGoal(ColoredBunnyEntity bunny) {
            super(bunny, 1.4D, true);
        }

        protected double getAttackReachSqr(LivingEntity attackTarget) {
            return (double)(4.0F + attackTarget.getWidth());
        }
    }



    static class MoveHelperController extends MovementController {
        private final ColoredBunnyEntity bunny;
        private double nextJumpSpeed;

        public MoveHelperController(ColoredBunnyEntity bunny) {
            super(bunny);
            this.bunny = bunny;
        }

        public void tick() {
            if (this.bunny.onGround && !this.bunny.isJumping && !((JumpHelperController)this.bunny.jumpController).getIsJumping()) {
                this.bunny.setMovementSpeed(0.0D);
            } else if (this.isUpdating()) {
                this.bunny.setMovementSpeed(this.nextJumpSpeed);
            }

            super.tick();
        }

        /**
         * Sets the speed and location to move to
         */
        public void setMoveTo(double x, double y, double z, double speedIn) {
            if (this.bunny.isInWater()) {
                speedIn = 1.5D;
            }

            super.setMoveTo(x, y, z, speedIn);
            if (speedIn > 0.0D) {
                this.nextJumpSpeed = speedIn;
            }

        }
    }

    static class PanicGoal extends net.minecraft.entity.ai.goal.PanicGoal {
        private final ColoredBunnyEntity bunny;

        public PanicGoal(ColoredBunnyEntity bunny, double speedIn) {
            super(bunny, speedIn);
            this.bunny = bunny;
        }

        /**
         * Keep ticking a continuous task that has already been started
         */
        public void tick() {
            super.tick();
            this.bunny.setMovementSpeed(this.speed);
        }
    }

    public static class ColoredBunnyData extends AgeableData {
        public final int typeData;

        public ColoredBunnyData(int type) {
            super(1.0F);
            this.typeData = type;
        }
    }

    static class RaidFarmGoal extends MoveToBlockGoal {
        private final ColoredBunnyEntity bunny;
        private boolean wantsToRaid;
        private boolean canRaid;

        public RaidFarmGoal(ColoredBunnyEntity bunnyIn) {
            super(bunnyIn, (double)0.7F, 16);
            this.bunny = bunnyIn;
        }

        /**
         * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
         * method as well.
         */
        public boolean shouldExecute() {
            if (this.runDelay <= 0) {
                if (!net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(this.bunny.world, this.bunny)) {
                    return false;
                }

                this.canRaid = false;
                this.wantsToRaid = this.bunny.isCarrotEaten();
                this.wantsToRaid = true;
            }

            return super.shouldExecute();
        }

        /**
         * Returns whether an in-progress EntityAIBase should continue executing
         */
        public boolean shouldContinueExecuting() {
            return this.canRaid && super.shouldContinueExecuting();
        }

        /**
         * Keep ticking a continuous task that has already been started
         */
        public void tick() {
            super.tick();
            this.bunny.getLookController().setLookPosition((double)this.destinationBlock.getX() + 0.5D, (double)(this.destinationBlock.getY() + 1), (double)this.destinationBlock.getZ() + 0.5D, 10.0F, (float)this.bunny.getVerticalFaceSpeed());
            if (this.getIsAboveDestination()) {
                World world = this.bunny.world;
                BlockPos blockpos = this.destinationBlock.up();
                BlockState blockstate = world.getBlockState(blockpos);
                Block block = blockstate.getBlock();
                if (this.canRaid && block instanceof CarrotBlock) {
                    Integer integer = blockstate.get(CarrotBlock.AGE);
                    if (integer == 0) {
                        world.setBlockState(blockpos, Blocks.AIR.getDefaultState(), 2);
                        world.destroyBlock(blockpos, true, this.bunny);
                    } else {
                        world.setBlockState(blockpos, blockstate.with(CarrotBlock.AGE, Integer.valueOf(integer - 1)), 2);
                        world.playEvent(2001, blockpos, Block.getStateId(blockstate));
                    }

                    this.bunny.carrotTicks = 40;
                }

                this.canRaid = false;
                this.runDelay = 10;
            }

        }

        /**
         * Return true to set given position as destination
         */
        protected boolean shouldMoveTo(IWorldReader worldIn, BlockPos pos) {
            Block block = worldIn.getBlockState(pos).getBlock();
            if (block == Blocks.FARMLAND && this.wantsToRaid && !this.canRaid) {
                pos = pos.up();
                BlockState blockstate = worldIn.getBlockState(pos);
                block = blockstate.getBlock();
                if (block instanceof CarrotBlock && ((CarrotBlock)block).isMaxAge(blockstate)) {
                    this.canRaid = true;
                    return true;
                }
            }

            return true;
        }
    }





    @OnlyIn(Dist.CLIENT)
    protected void playTameEffect(boolean play) {
        IParticleData iparticledata = ParticleTypes.HEART;
        if (!play) {
            iparticledata = ParticleTypes.SMOKE;
        }

        for(int i = 0; i < 7; ++i) {
            double d0 = this.rand.nextGaussian() * 0.02D;
            double d1 = this.rand.nextGaussian() * 0.02D;
            double d2 = this.rand.nextGaussian() * 0.02D;
            this.world.addParticle(iparticledata, this.getPosXRandom(1.0D), this.getPosYRandom() + 0.5D, this.getPosZRandom(1.0D), d0, d1, d2);
        }

    }

    /**
     * Handler for {@link World#setEntityState}
     */
    @OnlyIn(Dist.CLIENT)
    public void handleStatusUpdate(byte id) {
        if (id == 7) {
            this.playTameEffect(true);
        } else if (id == 6) {
            this.playTameEffect(false);
        } else {
            super.handleStatusUpdate(id);
        }

    }

    public boolean isTamed() {
        return (this.dataManager.get(TAMED) & 4) != 0;
    }

    public void setTamed(boolean tamed) {
        byte b0 = this.dataManager.get(TAMED);
        if (tamed) {
            this.dataManager.set(TAMED, (byte)(b0 | 4));
        } else {
            this.dataManager.set(TAMED, (byte)(b0 & -5));
        }

        this.setupTamedAI();
    }

    protected void setupTamedAI() {
    }

    public boolean isEntitySleeping() {
        return (this.dataManager.get(TAMED) & 1) != 0;
    }

    public void setQueuedToSit(boolean p_233686_1_) {
        byte b0 = this.dataManager.get(TAMED);
        if (p_233686_1_) {
            this.dataManager.set(TAMED, (byte)(b0 | 1));
        } else {
            this.dataManager.set(TAMED, (byte)(b0 & -2));
        }

    }

    @Nullable
    public UUID getOwnerId() {
        return this.dataManager.get(OWNER_UNIQUE_ID).orElse((UUID)null);
    }

    public void setOwnerId(@Nullable UUID p_184754_1_) {
        this.dataManager.set(OWNER_UNIQUE_ID, Optional.ofNullable(p_184754_1_));
    }

    public void setTamedBy(PlayerEntity player) {
        this.setTamed(true);
        this.setOwnerId(player.getUniqueID());
        if (player instanceof ServerPlayerEntity) {
            CriteriaTriggers.TAME_ANIMAL.trigger((ServerPlayerEntity)player, this);
        }

    }

    @Nullable
    public LivingEntity getOwner() {
        try {
            UUID uuid = this.getOwnerId();
            return uuid == null ? null : this.world.getPlayerByUuid(uuid);
        } catch (IllegalArgumentException illegalargumentexception) {
            return null;
        }
    }

    public boolean canAttack(LivingEntity target) {
        return false;
    }

    public boolean isOwner(LivingEntity entityIn) {
        return entityIn == this.getOwner();
    }

    public boolean shouldAttackEntity(LivingEntity target, LivingEntity owner) {
        return false;
    }

    public Team getTeam() {
        if (this.isTamed()) {
            LivingEntity livingentity = this.getOwner();
            if (livingentity != null) {
                return livingentity.getTeam();
            }
        }

        return super.getTeam();
    }

    /**
     * Returns whether this Entity is on the same team as the given Entity.
     */
    public boolean isOnSameTeam(Entity entityIn) {
        if (this.isTamed()) {
            LivingEntity livingentity = this.getOwner();
            if (entityIn == livingentity) {
                return true;
            }

            if (livingentity != null) {
                return livingentity.isOnSameTeam(entityIn);
            }
        }

        return super.isOnSameTeam(entityIn);
    }

    /**
     * Called when the mob's health reaches 0.
     */
    public void onDeath(DamageSource cause) {
        if (!this.world.isRemote && this.world.getGameRules().getBoolean(GameRules.SHOW_DEATH_MESSAGES) && this.getOwner() instanceof ServerPlayerEntity) {
            this.getOwner().sendMessage(this.getCombatTracker().getDeathMessage(), Util.DUMMY_UUID);
        }

        super.onDeath(cause);
    }

    public boolean isQueuedToSit() {
        return this.sitting;
    }

    public void setSitting(boolean p_233687_1_) {
        this.sitting = p_233687_1_;
    }


   /* public ActionResultType getEntityInteractionResult(PlayerEntity playerIn, Hand hand) {
        ItemStack itemstack = playerIn.getHeldItem(hand);
        if (!this.isTamed() && TAME_ITEMS==(itemstack.getItem())) {
            if (!playerIn.abilities.isCreativeMode) {
                itemstack.shrink(1);
            }

            if (!this.isSilent()) {
                this.world.playSound((PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), SoundEvents.ENTITY_PARROT_EAT, this.getSoundCategory(), 1.0F, 1.0F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F);
            }

            if (!this.world.isRemote) {
                if (this.rand.nextInt(10) == 0 && !net.minecraftforge.event.ForgeEventFactory.onAnimalTame(this, playerIn)) {
                    this.setTamedBy(playerIn);
                    this.world.setEntityState(this, (byte)7);
                } else {
                    this.world.setEntityState(this, (byte)6);
                }
            }

            return ActionResultType.func_233537_a_(this.world.isRemote);
        } else if (itemstack.getItem() == DEADLY_ITEM) {
            if (!playerIn.abilities.isCreativeMode) {
                itemstack.shrink(1);
            }

            this.addPotionEffect(new EffectInstance(Effects.POISON, 900));
            if (playerIn.isCreative() || !this.isInvulnerable()) {
                this.attackEntityFrom(DamageSource.causePlayerDamage(playerIn), Float.MAX_VALUE);
            }

            return ActionResultType.func_233537_a_(this.world.isRemote);
        } else if (this.isTamed() && this.isOwner(playerIn)) {
            if (!this.world.isRemote) {
                this.setSitting(!this.isQueuedToSit());
            }

            return ActionResultType.func_233537_a_(this.world.isRemote);
        } else {
            return super.getEntityInteractionResult(playerIn, hand);
        }
    }
*/


}

