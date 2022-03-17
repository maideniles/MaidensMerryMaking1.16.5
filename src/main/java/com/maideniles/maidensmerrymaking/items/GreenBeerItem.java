package com.maideniles.maidensmerrymaking.items;

import com.maideniles.maidensmerrymaking.init.ModAdvancements;
import com.maideniles.maidensmerrymaking.init.ModBlocks;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DrinkHelper;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class GreenBeerItem extends Item {
    public int DRINK_COUNT;



    public GreenBeerItem(Item.Properties builder) {
        super(builder);

    }

    /**
     * Called when the player finishes using this Item (E.g. finishes eating.). Not called when the player stops using
     * the Item before the action is complete.
     */
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        super.onItemUseFinish(stack, worldIn, entityLiving);
        if (entityLiving instanceof ServerPlayerEntity) {
            ServerPlayerEntity serverplayerentity = (ServerPlayerEntity)entityLiving;
            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayerentity, stack);
            serverplayerentity.addStat(Stats.ITEM_USED.get(this));
            stack.shrink(1);

            DRINK_COUNT++;


        }

        if (!worldIn.isRemote) {
            if (DRINK_COUNT == 1) {
                entityLiving.addPotionEffect(new EffectInstance(Effects.LUCK, 1800, 0));

            }

            if (DRINK_COUNT == 2) {
                entityLiving.addPotionEffect(new EffectInstance(Effects.STRENGTH, 1800, 0));
                entityLiving.addPotionEffect(new EffectInstance(Effects.LUCK, 1800, 0));

            }

            if (DRINK_COUNT == 3) {
                entityLiving.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 1800, 0));
                entityLiving.addPotionEffect(new EffectInstance(Effects.STRENGTH, 1800, 0));
                entityLiving.addPotionEffect(new EffectInstance(Effects.LUCK, 1800, 0));

            }

            if (DRINK_COUNT == 4) {

                entityLiving.addPotionEffect(new EffectInstance(Effects.LUCK, 3600, 0));
                entityLiving.addPotionEffect(new EffectInstance(Effects.STRENGTH, 3600, 0));
                entityLiving.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 3600, 0));
                entityLiving.addPotionEffect(new EffectInstance(Effects.ABSORPTION, 3600, 0));

            }
            if (DRINK_COUNT >= 5 && DRINK_COUNT <=10) {

                entityLiving.addPotionEffect(new EffectInstance(Effects.LUCK, 3600, 0));
                entityLiving.addPotionEffect(new EffectInstance(Effects.WEAKNESS, 3600, 0));
                entityLiving.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 3600, 0));
                entityLiving.addPotionEffect(new EffectInstance(Effects.HUNGER, 3600, 0));

            }

            if (DRINK_COUNT == 10) {

                entityLiving.addPotionEffect(new EffectInstance(Effects.UNLUCK, 3600, 0));
                entityLiving.addPotionEffect(new EffectInstance(Effects.WEAKNESS, 3600, 0));
                entityLiving.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 3600, 0));
                entityLiving.addPotionEffect(new EffectInstance(Effects.POISON, 3600, 0));
                entityLiving.addPotionEffect(new EffectInstance(Effects.NAUSEA, 3600, 0));
                entityLiving.addPotionEffect(new EffectInstance(Effects.BLINDNESS, 3600, 0));

                if (entityLiving instanceof ServerPlayerEntity) {
                    ModAdvancements.DRUNK_ON_GREEN_BEER.trigger((ServerPlayerEntity) entityLiving);
                }

                if (DRINK_COUNT > 10) {
                    DRINK_COUNT = 0;
                }
            }

        }

        if (stack.isEmpty()) {
            return new ItemStack(ModBlocks.GLASS_MUG.get());
        } else {
            if (entityLiving instanceof PlayerEntity && !((PlayerEntity)entityLiving).abilities.isCreativeMode) {
                ItemStack itemstack = new ItemStack(ModBlocks.GLASS_MUG.get());
                PlayerEntity playerentity = (PlayerEntity)entityLiving;
                if (!playerentity.inventory.addItemStackToInventory(itemstack)) {
                    playerentity.dropItem(itemstack, false);
                }
            }

            return stack;
        }

    }

    /**
     * How long it takes to use or consume an item
     */
    public int getUseDuration(ItemStack stack) {
        return 40;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

    public SoundEvent getDrinkSound() {
        return SoundEvents.ITEM_HONEY_BOTTLE_DRINK;
    }

    public SoundEvent getEatSound() {
        return SoundEvents.ITEM_HONEY_BOTTLE_DRINK;
    }

    /**
     * Called to trigger the item's "innate" right click behavior. To handle when this item is used on a Block, see
     * {@link #onItemUse}.
     */
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        return DrinkHelper.startDrinking(worldIn, playerIn, handIn);
    }
}