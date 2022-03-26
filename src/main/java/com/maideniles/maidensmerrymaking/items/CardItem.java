package com.maideniles.maidensmerrymaking.items;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;


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

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {

        if(!Screen.hasShiftDown()) {
            tooltip.add(new TranslationTextComponent("tooltip.maidensmerrymaking.easter_card_shift"));
        } else {
            tooltip.add(new TranslationTextComponent("tooltip.maidensmerrymaking.easter_card"));
        }
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

}
