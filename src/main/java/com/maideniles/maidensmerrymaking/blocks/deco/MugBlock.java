package com.maideniles.maidensmerrymaking.blocks.deco;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class MugBlock extends HorizontalDecoBlock {

    protected static final VoxelShape WEST_AABB = Block.makeCuboidShape(5.5D, 0.0D, 3.5D, 10.5D, 8.0D, 10.5D);
    protected static final VoxelShape EAST_AABB = Block.makeCuboidShape(5.5D, 0.0D, 5.5D, 10.5D, 8.0D, 12.5D);
    protected static final VoxelShape NORTH_AABB = Block.makeCuboidShape(5.0D, 0.0D, 5.5D, 12.5D, 8.0D, 10.5D);
    protected static final VoxelShape SOUTH_AABB = Block.makeCuboidShape(3.5D, 0.0D, 5.5D, 10.5D, 8.0D, 10.5D);

    public MugBlock(Properties p_49795_) {
        super(p_49795_);
    }

    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context){

        switch(state.get(DIRECTION)) {
            case SOUTH:
                return SOUTH_AABB;
            case NORTH:
            default:
                return NORTH_AABB;
            case WEST:
                return WEST_AABB;
            case EAST:
                return EAST_AABB;
        }
    }
}

