package com.maideniles.maidensmerrymaking.blocks.fireplace.mantel.woods;

import com.maideniles.maidensmerrymaking.blocks.fireplace.mantel.base.HorizontalMantelBase;
import com.maideniles.maidensmerrymaking.blocks.fireplace.mantel.base.MantelTopCenterStocking;
import com.maideniles.maidensmerrymaking.blocks.fireplace.mantel.base.MantelTopLeftStocking;
import com.maideniles.maidensmerrymaking.blocks.fireplace.mantel.base.MantelTopRightStocking;
import com.maideniles.maidensmerrymaking.init.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.property.Properties;

import javax.annotation.Nullable;

public class MantelBlockWarped extends HorizontalMantelBase {


    public MantelBlockWarped(Properties properties) {
        super(properties);
    }


    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {



        if (state.get(this.FACING) == Direction.SOUTH) {


            worldIn.setBlockState(pos.up(), ModBlocks.MANTEL_WARPED_TOP_MIDDLE.get().getDefaultState().with(DIRECTION, placer.getHorizontalFacing()).with(MantelTopCenterStocking.STOCKING, Boolean.FALSE));

            worldIn.setBlockState(pos.add(-1, 1, 0), ModBlocks.MANTEL_WARPED_TOP_LEFT_STOCKING.get().getDefaultState().with(DIRECTION, placer.getHorizontalFacing()).with(MantelTopLeftStocking.STOCKING, Boolean.FALSE));

            worldIn.setBlockState(pos.add(1, 1, 0), ModBlocks.MANTEL_WARPED_TOP_RIGHT_STOCKING.get().getDefaultState().with(DIRECTION, placer.getHorizontalFacing()).with(MantelTopRightStocking.STOCKING, Boolean.FALSE));

            worldIn.setBlockState(pos.add(-1, 0, 0), ModBlocks.MANTEL_WARPED_LEG_LEFT.get().getDefaultState().with(DIRECTION, placer.getHorizontalFacing()));

            worldIn.setBlockState(pos.add(1, 0, 0), ModBlocks.MANTEL_WARPED_LEG_RIGHT.get().getDefaultState().with(DIRECTION, placer.getHorizontalFacing()));

            worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());
        }

        if (state.get(this.FACING) == Direction.NORTH) {


            worldIn.setBlockState(pos.up(), ModBlocks.MANTEL_WARPED_TOP_MIDDLE.get().getDefaultState().with(DIRECTION, placer.getHorizontalFacing()).with(MantelTopCenterStocking.STOCKING, Boolean.FALSE));

            worldIn.setBlockState(pos.add(1, 1, 0), ModBlocks.MANTEL_WARPED_TOP_LEFT_STOCKING.get().getDefaultState().with(DIRECTION, placer.getHorizontalFacing()).with(MantelTopLeftStocking.STOCKING, Boolean.FALSE));

            worldIn.setBlockState(pos.add(-1, 1, 0), ModBlocks.MANTEL_WARPED_TOP_RIGHT_STOCKING.get().getDefaultState().with(DIRECTION, placer.getHorizontalFacing()).with(MantelTopRightStocking.STOCKING, Boolean.FALSE));

            worldIn.setBlockState(pos.add(1, 0, 0), ModBlocks.MANTEL_WARPED_LEG_LEFT.get().getDefaultState().with(DIRECTION, placer.getHorizontalFacing()));

            worldIn.setBlockState(pos.add(-1, 0, 0), ModBlocks.MANTEL_WARPED_LEG_RIGHT.get().getDefaultState().with(DIRECTION, placer.getHorizontalFacing()));

            worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());
        }

        if (state.get(this.FACING) == Direction.EAST) {


            worldIn.setBlockState(pos.up(), ModBlocks.MANTEL_WARPED_TOP_MIDDLE.get().getDefaultState().with(DIRECTION, placer.getHorizontalFacing()).with(MantelTopCenterStocking.STOCKING, Boolean.FALSE));

            worldIn.setBlockState(pos.add(0, 1, 1), ModBlocks.MANTEL_WARPED_TOP_LEFT_STOCKING.get().getDefaultState().with(DIRECTION, placer.getHorizontalFacing()).with(MantelTopLeftStocking.STOCKING, Boolean.FALSE));

            worldIn.setBlockState(pos.add(0, 1, -1), ModBlocks.MANTEL_WARPED_TOP_RIGHT_STOCKING.get().getDefaultState().with(DIRECTION, placer.getHorizontalFacing()).with(MantelTopRightStocking.STOCKING, Boolean.FALSE));

            worldIn.setBlockState(pos.add(0, 0, 1), ModBlocks.MANTEL_WARPED_LEG_LEFT.get().getDefaultState().with(DIRECTION, placer.getHorizontalFacing()));

            worldIn.setBlockState(pos.add(0, 0, -1), ModBlocks.MANTEL_WARPED_LEG_RIGHT.get().getDefaultState().with(DIRECTION, placer.getHorizontalFacing()));

            worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());
        }

        if (state.get(this.FACING) == Direction.WEST) {


            worldIn.setBlockState(pos.up(), ModBlocks.MANTEL_WARPED_TOP_MIDDLE.get().getDefaultState().with(DIRECTION, placer.getHorizontalFacing()).with(MantelTopCenterStocking.STOCKING, Boolean.FALSE));

            worldIn.setBlockState(pos.add(0, 1, -1), ModBlocks.MANTEL_WARPED_TOP_LEFT_STOCKING.get().getDefaultState().with(DIRECTION, placer.getHorizontalFacing()).with(MantelTopLeftStocking.STOCKING, Boolean.FALSE));

            worldIn.setBlockState(pos.add(0, 1, 1), ModBlocks.MANTEL_WARPED_TOP_RIGHT_STOCKING.get().getDefaultState().with(DIRECTION, placer.getHorizontalFacing()).with(MantelTopRightStocking.STOCKING, Boolean.FALSE));

            worldIn.setBlockState(pos.add(0, 0, -1), ModBlocks.MANTEL_WARPED_LEG_LEFT.get().getDefaultState().with(DIRECTION, placer.getHorizontalFacing()));

            worldIn.setBlockState(pos.add(0, 0, 1), ModBlocks.MANTEL_WARPED_LEG_RIGHT.get().getDefaultState().with(DIRECTION, placer.getHorizontalFacing()));

            worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());
        }

    }




}
