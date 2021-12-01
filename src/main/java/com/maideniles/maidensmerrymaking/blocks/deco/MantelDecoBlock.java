package com.maideniles.maidensmerrymaking.blocks.deco;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class MantelDecoBlock extends HorizontalDecoBlock {

    protected static final VoxelShape MANTEL_WEST_AABB = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 9.0D, 12.0D, 16.0D);
    protected static final VoxelShape MANTEL_EAST_AABB = Block.makeCuboidShape(7.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D);
    protected static final VoxelShape MANTEL_NORTH_AABB = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 9.0D);
    protected static final VoxelShape MANTEL_SOUTH_AABB = Block.makeCuboidShape(0.0D, 0.0D, 7.0D, 16.0D, 12.0D, 16.0D);

    public MantelDecoBlock(Properties properties) {
        super(properties);
    }

    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context){

        switch(state.get(DIRECTION)) {
            case SOUTH:
                return MANTEL_SOUTH_AABB;
            case NORTH:
            default:
                return MANTEL_NORTH_AABB;
            case WEST:
                return MANTEL_WEST_AABB;
            case EAST:
                return MANTEL_EAST_AABB;
        }
    }
}
