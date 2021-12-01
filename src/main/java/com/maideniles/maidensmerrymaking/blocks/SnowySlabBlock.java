package com.maideniles.maidensmerrymaking.blocks;

import com.maideniles.maidensmerrymaking.init.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class SnowySlabBlock extends SlabBlock {
    public SnowySlabBlock(Properties p_56359_) {
        super(p_56359_);
    }



    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit){
        ItemStack snow = player.getHeldItem(handIn);
        BlockState blockstate = worldIn.getBlockState(pos);

        if (!worldIn.isRemote()) {

            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.ACACIA_ROOF_SLAB.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                worldIn.setBlockState(pos, ModBlocks.ACACIA_SNOWY_SLAB.get().getDefaultState().with(TYPE, state.get(TYPE)),3);
                snow.shrink(1);
            }

            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.BIRCH_ROOF_SLAB.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                worldIn.setBlockState(pos, ModBlocks.BIRCH_SNOWY_SLAB.get().getDefaultState().with(TYPE, state.get(TYPE)),3);
                snow.shrink(1);
            }

            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.DARK_OAK_ROOF_SLAB.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                worldIn.setBlockState(pos, ModBlocks.DARK_OAK_SNOWY_SLAB.get().getDefaultState().with(TYPE, state.get(TYPE)),3);
                snow.shrink(1);
            }

            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.JUNGLE_ROOF_SLAB.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                worldIn.setBlockState(pos, ModBlocks.JUNGLE_SNOWY_SLAB.get().getDefaultState().with(TYPE, state.get(TYPE)),3);
                snow.shrink(1);
            }

            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.OAK_ROOF_SLAB.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                worldIn.setBlockState(pos, ModBlocks.OAK_SNOWY_SLAB.get().getDefaultState().with(TYPE, state.get(TYPE)),3);
                snow.shrink(1);
            }

            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.SPRUCE_ROOF_SLAB.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                worldIn.setBlockState(pos, ModBlocks.SPRUCE_SNOWY_SLAB.get().getDefaultState().with(TYPE, state.get(TYPE)),3);
                snow.shrink(1);
            }

            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.WARPED_ROOF_SLAB.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                worldIn.setBlockState(pos, ModBlocks.WARPED_SNOWY_SLAB.get().getDefaultState().with(TYPE, state.get(TYPE)),3);
                snow.shrink(1);
            }

            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.CRIMSON_ROOF_SLAB.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                worldIn.setBlockState(pos, ModBlocks.CRIMSON_SNOWY_SLAB.get().getDefaultState().with(TYPE, state.get(TYPE)),3);
                snow.shrink(1);
            }

            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.POLISHED_BLACKSTONE_BRICK_ROOF_SLAB.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                worldIn.setBlockState(pos, ModBlocks.POLISHED_BLACKSTONE_BRICK_SNOWY_SLAB.get().getDefaultState().with(TYPE, state.get(TYPE)),3);
                snow.shrink(1);
            }



            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.STONE_BRICK_ROOF_SLAB.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                worldIn.setBlockState(pos, ModBlocks.STONE_BRICK_SNOWY_SLAB.get().getDefaultState().with(TYPE, state.get(TYPE)),3);
                snow.shrink(1);
            }
        }
        return ActionResultType.FAIL;
    }
}
