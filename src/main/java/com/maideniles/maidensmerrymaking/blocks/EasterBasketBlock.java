package com.maideniles.maidensmerrymaking.blocks;

import com.maideniles.maidensmerrymaking.entity.custom.ColoredBunnyEntity;
import com.maideniles.maidensmerrymaking.init.ModBlocks;
import com.maideniles.maidensmerrymaking.init.ModEntityTypes;
import com.maideniles.maidensmerrymaking.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class EasterBasketBlock extends Block {



    protected static final VoxelShape SHAPE = Block.makeCuboidShape(3.0D, 0.0D, 3.0D, 13.0D, 8.0D, 13.0D);


    public EasterBasketBlock(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        return SHAPE;
    }

    @Override
    public void onBlockHarvested(World world, BlockPos pos, BlockState state, PlayerEntity player){
        Random rand = new Random();
        Integer gift_id = rand.nextInt(15);
        Integer bunny_chance = rand.nextInt(40);
        Integer gift_count = inclusiveBoundedRandom(rand,1,5);
        Integer egg_id = inclusiveBoundedRandom(rand, 0, 4);


       if(egg_id == 0){
        world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.PINK_EGG.get(),gift_count)));}
       if(egg_id== 1){
        world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.PURPLE_EGG.get(),gift_count)));}
       if(egg_id ==2){
        world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.BLUE_EGG.get(),gift_count)));}
       if(egg_id == 3){
        world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.YELLOW_EGG.get(),gift_count)));}

        world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.CHOCOLATE_BUNNY.get(),1)));
        world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.ANGORA_WOOL.get(),1)));
        world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModBlocks.RAINBOW_ZIGZAG_EASTER_EGG_BLOCK.get(),1)));



        if(gift_id == 0)
        if (world instanceof ServerWorld) {
            this.spawnPinkBunny((ServerWorld)world, pos);
        }

        if(gift_id == 1)
            if (world instanceof ServerWorld) {
                this.spawnPurpleBunny((ServerWorld)world, pos);
            }


        if(gift_id == 2)
            if (world instanceof ServerWorld) {
                this.spawnBlueBunny((ServerWorld)world, pos);
            }


        if(gift_id == 3)
            if (world instanceof ServerWorld) {
                this.spawnCyanBunny((ServerWorld)world, pos);
            }


        if(gift_id == 4)
            if (world instanceof ServerWorld) {
                this.spawnYellowBunny((ServerWorld)world, pos);
            }

        if(gift_id == 5){
            world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(),  new ItemStack(Items.DIAMOND,gift_count)));
        }

        if(gift_id == 6){
            world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(),  new ItemStack(Items.NETHERITE_INGOT,1)));
        }

        if(gift_id == 7){
            world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(),  new ItemStack(Items.NETHER_STAR,1)));
        }

        if(gift_id == 8){
            world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(),  new ItemStack(Items.HEART_OF_THE_SEA,1)));
        }
        if(gift_id == 9){
            world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(),  new ItemStack(Items.LODESTONE,gift_count)));
        }
        if(gift_id == 10){
            world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(),  new ItemStack(Items.DIAMOND_BLOCK,1)));
        }

        if(gift_id == 11){
            world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(),  new ItemStack(Items.EMERALD_BLOCK,gift_count)));
        }

        if(gift_id == 12){
            world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(),  new ItemStack(Items.BEACON,gift_count)));
        }

        if(gift_id == 13){
            world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(),  new ItemStack(ModItems.EASTER_CARD.get(),gift_count)));
        }

        if(gift_id == 14){
            world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(),  new ItemStack(Items.MUSIC_DISC_PIGSTEP,gift_count)));
        }



        super.onBlockHarvested(world, pos, state, player);
    }

    private static void spawnPinkBunny(ServerWorld world, BlockPos pos) {
        ColoredBunnyEntity pinkBunnyEntity = ModEntityTypes.PINK_BUNNY.get().create(world);

        pinkBunnyEntity.setLocationAndAngles((double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, 0.0F, 0.0F);
        pinkBunnyEntity.setBunnySize(getRandomSize(),true);
        world.addEntity(pinkBunnyEntity);

        pinkBunnyEntity.spawnExplosionParticle();

    }

    private static void spawnPurpleBunny(ServerWorld world, BlockPos pos) {
        ColoredBunnyEntity pinkBunnyEntity = ModEntityTypes.PURPLE_BUNNY.get().create(world);

        pinkBunnyEntity.setLocationAndAngles((double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, 0.0F, 0.0F);
        pinkBunnyEntity.setBunnySize(getRandomSize(),true);
        world.addEntity(pinkBunnyEntity);

        pinkBunnyEntity.spawnExplosionParticle();

    }

    private static void spawnBlueBunny(ServerWorld world, BlockPos pos) {
        ColoredBunnyEntity pinkBunnyEntity = ModEntityTypes.BLUE_BUNNY.get().create(world);

        pinkBunnyEntity.setLocationAndAngles((double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, 0.0F, 0.0F);
        pinkBunnyEntity.setBunnySize(getRandomSize(),true);
        world.addEntity(pinkBunnyEntity);

        pinkBunnyEntity.spawnExplosionParticle();

    }

    private static void spawnCyanBunny(ServerWorld world, BlockPos pos) {
        ColoredBunnyEntity pinkBunnyEntity = ModEntityTypes.CYAN_BUNNY.get().create(world);

        pinkBunnyEntity.setLocationAndAngles((double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, 0.0F, 0.0F);
        pinkBunnyEntity.setBunnySize(getRandomSize(),true);
        world.addEntity(pinkBunnyEntity);

        pinkBunnyEntity.spawnExplosionParticle();

    }

    private static void spawnYellowBunny(ServerWorld world, BlockPos pos) {
        ColoredBunnyEntity pinkBunnyEntity = ModEntityTypes.YELLOW_BUNNY.get().create(world);

        pinkBunnyEntity.setLocationAndAngles((double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, 0.0F, 0.0F);
        pinkBunnyEntity.setBunnySize(getRandomSize(),true);
        world.addEntity(pinkBunnyEntity);

        pinkBunnyEntity.spawnExplosionParticle();

    }

    public static int getRandomSize(){
        Integer bunnySize = inclusiveBoundedRandom(new Random(), 1, 3);
            System.out.println("NEXT BUNNY SIZE IS : " + bunnySize);
            return bunnySize;
    }

    private static int inclusiveBoundedRandom(Random random, int min, int max) {
        return min + random.nextInt(max-min);
    }
}
