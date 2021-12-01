package com.maideniles.maidensmerrymaking.blocks.deco;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class TopperBlock extends Block {

    protected static final VoxelShape TOPPER_AABB = Block.makeCuboidShape(0.0D, -3.0D, 0.0D, 16.0D, 8.0D, 16.0D);
    public TopperBlock(Properties properties) {
        super(properties);
    }

    public VoxelShape getShape(BlockState state, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {

        return TOPPER_AABB;
    }


}
