package com.maideniles.maidensmerrymaking.blocks.deco;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class GarlandVerticalCornerRightBlock extends HorizontalDecoBlock{

    protected static final VoxelShape EAST_AABB = Block.makeCuboidShape(10.0D, 0.0D, 8.0D, 16.0D, 16.0D, 16.0D);
    protected static final VoxelShape WEST_AABB = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 6.0D, 16.0D, 8.0D);
    protected static final VoxelShape SOUTH_AABB = Block.makeCuboidShape(0.0D, 0.0D, 10.0D, 8.0D, 16.0D, 16.0D);
    protected static final VoxelShape NORTH_AABB = Block.makeCuboidShape(8.0D, 0.0D, 0.0D, 16.0D, 16.0D, 6.0D);

    protected static final VoxelShape NORTH_TOP_AABB = Block.makeCuboidShape(0, 8, 0, 16, 16, 6);
    protected static final VoxelShape SOUTH_TOP_AABB = Block.makeCuboidShape(0, 8, 10, 16, 16, 16);
    protected static final VoxelShape WEST_TOP_AABB = Block.makeCuboidShape(0, 8, 0, 6, 16, 16);
    protected static final VoxelShape EAST_TOP_AABB = Block.makeCuboidShape(10, 8, 0, 16, 16, 16);

    public static VoxelShape WITH_TOP_WEST;
    public static VoxelShape WITH_TOP_EAST;
    public static VoxelShape WITH_TOP_NORTH;
    public static VoxelShape WITH_TOP_SOUTH;

    public GarlandVerticalCornerRightBlock(Properties properties) {
        super(properties);

        WITH_TOP_WEST = VoxelShapes.combine( WEST_AABB, WEST_TOP_AABB, IBooleanFunction.OR);
        WITH_TOP_EAST = VoxelShapes.combine( EAST_AABB, EAST_TOP_AABB, IBooleanFunction.OR);
        WITH_TOP_NORTH = VoxelShapes.combine( NORTH_AABB, NORTH_TOP_AABB, IBooleanFunction.OR);
        WITH_TOP_SOUTH = VoxelShapes.combine( SOUTH_AABB, SOUTH_TOP_AABB, IBooleanFunction.OR);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context){

        switch(state.get(DIRECTION)) {
            case SOUTH:
                return WITH_TOP_SOUTH;
            case NORTH:
            default:
                return WITH_TOP_NORTH;
            case WEST:
                return WITH_TOP_WEST;
            case EAST:
                return WITH_TOP_EAST;
        }
    }






}
