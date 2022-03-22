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

public class ChocolateBunnyItem extends Item {
    public int EAT_COUNT;



    public ChocolateBunnyItem(Item.Properties builder) {
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

            EAT_COUNT++;


        }

        if (!worldIn.isRemote) {
            if (EAT_COUNT >= 1 && EAT_COUNT <5) {
                entityLiving.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 400, 0));
                entityLiving.addPotionEffect(new EffectInstance(Effects.SPEED, 400, 0));
            }


            if (EAT_COUNT == 5) {

               entityLiving.removePotionEffect(Effects.JUMP_BOOST);
                entityLiving.removePotionEffect(Effects.SPEED);
                entityLiving.addPotionEffect(new EffectInstance(Effects.NAUSEA, 3600, 0));




                if (EAT_COUNT > 10) {
                    EAT_COUNT = 0;
                }
            }

        }

        return stack;

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
        return UseAction.EAT;
    }



    /**
     * Called to trigger the item's "innate" right click behavior. To handle when this item is used on a Block, see

     */

}
