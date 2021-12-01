package com.maideniles.maidensmerrymaking.blocks.fireplace.mantel.base;

import com.maideniles.maidensmerrymaking.blocks.deco.HorizontalDecoBlock;
import com.maideniles.maidensmerrymaking.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class MantelLegRight extends HorizontalDecoBlock {

    public static final DirectionProperty DIRECTION = BlockStateProperties.HORIZONTAL_FACING;

    private static final VoxelShape MANTEL_WEST_AABB = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 8.0D, 16.0D, 9.0D);
    private static final VoxelShape MANTEL_EAST_AABB = Block.makeCuboidShape(7.0D, 0.0D, 8.0D, 16.0D, 16.0D, 16.0D);
    private static final VoxelShape MANTEL_NORTH_AABB = Block.makeCuboidShape(7.0D, 0.0D, 0.0D, 15.0D, 16.0D, 8.0D);
    private static final VoxelShape MANTEL_SOUTH_AABB = Block.makeCuboidShape(1.0D, 0.0D, 8.0D, 9.0D, 16.0D, 16.0D);


    public MantelLegRight(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {

        switch(state.get(DIRECTION)) {

            default:
            case NORTH:
                return MANTEL_NORTH_AABB;
            case SOUTH:
                return MANTEL_SOUTH_AABB;
            case WEST:
                return MANTEL_WEST_AABB;
            case EAST:

                return MANTEL_EAST_AABB;
        }
    }

    @Override
    public void onPlayerDestroy(IWorld worldIn, BlockPos pos, BlockState state){

        Boolean top_left = Boolean.TRUE;
        Boolean top_middle = Boolean.TRUE;
        Boolean top_right = Boolean.TRUE;



        if (state.get(MantelLegRight.FACING) == Direction.NORTH) {

            if ( top_right == worldIn.getBlockState(pos.up()).get(MantelTopRightStocking.STOCKING)) {
                worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP RIGHT");
            }

            if (top_middle == worldIn.getBlockState(pos.up().west()).get(MantelTopCenterStocking.STOCKING)) {
                worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP MIDDLE");
            }

            if (top_left == worldIn.getBlockState(pos.up().west(2)).get(MantelTopLeftStocking.STOCKING)) {
                worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP LEFT");
            }

            //destroy block up//
            worldIn.setBlockState(pos.up(), Blocks.AIR.getDefaultState(), 35);
            //destroy block 1 block up and to left//
            worldIn.setBlockState(pos.up().west(), Blocks.AIR.getDefaultState(), 35);
            //destroy block 1 block up and 2 blocks to left//
            worldIn.setBlockState(pos.up().west(2), Blocks.AIR.getDefaultState(), 35);
            //destroy block 2 blocks to left//
            worldIn.setBlockState(pos.west(2), Blocks.AIR.getDefaultState(), 35);
        }

        if (state.get(MantelLegRight.FACING) == Direction.SOUTH) {

            if ( top_left == worldIn.getBlockState(pos.up()).get(MantelTopLeftStocking.STOCKING)) {
                worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP LEFT");
            }

            if (top_middle == worldIn.getBlockState(pos.up().east()).get(MantelTopCenterStocking.STOCKING)) {
                worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP MIDDLE");
            }

            if (top_right == worldIn.getBlockState(pos.up().east(2)).get(MantelTopRightStocking.STOCKING)) {
                worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP RIGHT");
            }

            //destroy block up//
            worldIn.setBlockState(pos.up(), Blocks.AIR.getDefaultState(), 35);
            //destroy block 1 block up and to left//
            worldIn.setBlockState(pos.up().east(), Blocks.AIR.getDefaultState(), 35);
            //destroy block 1 block up and 2 blocks to left//
            worldIn.setBlockState(pos.up().east(2), Blocks.AIR.getDefaultState(), 35);
            //destroy block 2 blocks to left//
            worldIn.setBlockState(pos.east(2), Blocks.AIR.getDefaultState(), 35);
        }

        if (state.get(MantelLegRight.FACING) == Direction.EAST) {

            if ( top_left == worldIn.getBlockState(pos.up()).get(MantelTopLeftStocking.STOCKING)) {
                worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP LEFT");
            }

            if (top_middle == worldIn.getBlockState(pos.up().north()).get(MantelTopCenterStocking.STOCKING)) {
                worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP MIDDLE");
            }

            if (top_right == worldIn.getBlockState(pos.up().north(2)).get(MantelTopRightStocking.STOCKING)) {
                worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP RIGHT");
            }

            //destroy block up//
            worldIn.setBlockState(pos.up(), Blocks.AIR.getDefaultState(), 35);
            //destroy block 1 block up and to left//
            worldIn.setBlockState(pos.up().north(), Blocks.AIR.getDefaultState(), 35);
            //destroy block 1 block up and 2 blocks to left//
            worldIn.setBlockState(pos.up().north(2), Blocks.AIR.getDefaultState(), 35);
            //destroy block 2 blocks to left//
            worldIn.setBlockState(pos.north(2), Blocks.AIR.getDefaultState(), 35);
        }

        if (state.get(MantelLegRight.FACING) == Direction.WEST) {

            if ( top_left == worldIn.getBlockState(pos.up()).get(MantelTopLeftStocking.STOCKING)) {
                worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP LEFT");
            }

            if (top_middle == worldIn.getBlockState(pos.up().south()).get(MantelTopCenterStocking.STOCKING)) {
                worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP MIDDLE");
            }

            if (top_right == worldIn.getBlockState(pos.up().south(2)).get(MantelTopRightStocking.STOCKING)) {
                worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP RIGHT");
            }

            //destroy block up//
            worldIn.setBlockState(pos.up(), Blocks.AIR.getDefaultState(), 35);
            //destroy block 1 block up and to left//
            worldIn.setBlockState(pos.up().south(), Blocks.AIR.getDefaultState(), 35);
            //destroy block 1 block up and 2 blocks to left//
            worldIn.setBlockState(pos.up().south(2), Blocks.AIR.getDefaultState(), 35);
            //destroy block 2 blocks to left//
            worldIn.setBlockState(pos.south(2), Blocks.AIR.getDefaultState(), 35);
        }


    }


}
