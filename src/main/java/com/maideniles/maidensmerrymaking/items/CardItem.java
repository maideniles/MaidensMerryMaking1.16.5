package com.maideniles.maidensmerrymaking.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;


public class CardItem extends Item {
    public CardItem(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }


    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
        ItemStack itemstack = new ItemStack(Items.DIAMOND);

        if (!entity.inventory.addItemStackToInventory(itemstack)) {
            entity.dropItem(itemstack, false);
        }
        entity.sendMessage(new StringTextComponent("Happy Easter! Don't spend it all in one place! Love, Grandma"), entity.getUniqueID());

        itemstack.shrink(1);

        return super.onItemRightClick(world, entity, hand);
    }


}
