package com.maideniles.maidensmerrymaking.items;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class AngoraWoolItem extends Item {
    public AngoraWoolItem(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {

        if(!Screen.hasShiftDown()) {
            tooltip.add(new TranslationTextComponent("tooltip.maidensmerrymaking.angora_wool_shift"));
        } else {
            tooltip.add(new TranslationTextComponent("tooltip.maidensmerrymaking.angora_wool"));
        }
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
