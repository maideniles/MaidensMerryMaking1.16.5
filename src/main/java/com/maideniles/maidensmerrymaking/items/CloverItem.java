package com.maideniles.maidensmerrymaking.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class CloverItem extends Item {




    public CloverItem(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }



 /*   @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slotID, boolean p_77663_5_) {


        if(slotID == 45 && entity instanceof LivingEntity){


                if (world.getGameTime() % 5 == 0) {

                    ((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HUNGER, 20, 0));
                    System.out.println("GAVE POTION EFFECT TO PLAYER");
                }
             //   if (world.getGameTime() % 12 == 0){
              //      stack.getItem().setDamage(stack, 1);   }
          //  }

        super.inventoryTick(stack, world, entity, slotID, p_77663_5_);
        }


    }*/

    @Override
    public ActionResult<ItemStack> onItemRightClick(World p_77659_1_, PlayerEntity entity, Hand hand) {
        ItemStack stack = entity.getHeldItem(hand);

    entity.addPotionEffect(new EffectInstance(Effects.LUCK, 2600, 0));
        System.out.println("GAVE LUCK POTION EFFECT TO PLAYER");
        stack.getItem().setDamage(stack, 1);

        return ActionResult.resultPass(entity.getHeldItem(hand));
    }


}