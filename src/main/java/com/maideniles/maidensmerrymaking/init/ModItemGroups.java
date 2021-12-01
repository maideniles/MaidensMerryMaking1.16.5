package com.maideniles.maidensmerrymaking.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;


public class ModItemGroups {

    public static final ItemGroup MAIDENS_BLOCKS_GROUP = new ItemGroup("maidens_blocks_group") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.CHRISTMAS_WREATH_MULTI_LIGHTS.get());
        }
    };

    public static final ItemGroup MAIDENS_ITEMS_GROUP = new ItemGroup("maidens_items_group") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.MINI_LIGHTS_MULTI.get());
        }
    };

}
