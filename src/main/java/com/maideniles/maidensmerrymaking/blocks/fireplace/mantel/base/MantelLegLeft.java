package com.maideniles.maidensmerrymaking.blocks.fireplace.mantel.base;

import com.maideniles.maidensmerrymaking.blocks.deco.HorizontalDecoBlock;
import com.maideniles.maidensmerrymaking.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class MantelLegLeft extends HorizontalDecoBlock {

    private static final VoxelShape WEST_AABB = Block.makeCuboidShape(0.0D, 0.0D, 7.0D, 8.0D, 16.0D, 16.0D);
    private static final VoxelShape EAST_AABB = Block.makeCuboidShape(8.0D, 0.0D, 0.0D, 16.0D, 16.0D, 9.0D);
    private static final VoxelShape NORTH_AABB = Block.makeCuboidShape(1.0D, 0.0D, 0.0D, 9.0D, 16.0D, 8.0D);
    private static final VoxelShape SOUTH_AABB = Block.makeCuboidShape(7.0D, 0.0D, 8.0D, 15.0D, 16.0D, 16.0D);



    public MantelLegLeft(Properties properties) {
        super(properties);
    }

    public VoxelShape getShape(BlockState state, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {

        switch((Direction)state.get(DIRECTION)) {
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

    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {



        Boolean top_left = Boolean.TRUE;
        Boolean top_middle = Boolean.TRUE;
        Boolean top_right = Boolean.TRUE;

        if (state.get(MantelLegLeft.FACING) == Direction.NORTH) {

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


            // destroy block above//
            worldIn.setBlockState(pos.up(), Blocks.AIR.getDefaultState(), 35);
            //destroy block 1 block above and to right//
            worldIn.setBlockState(pos.up().east(), Blocks.AIR.getDefaultState(), 35);
            //destroy block 1 block above and 2 blocks to right//
            worldIn.setBlockState(pos.up().east(2), Blocks.AIR.getDefaultState(), 35);
            //destroy LEG block 2 blocks to right//
            worldIn.setBlockState(pos.east(2), Blocks.AIR.getDefaultState(), 35);
        } //END NORTH FACING//

        if(state.get(MantelLegLeft.FACING) == Direction.SOUTH){

            if ( top_left == worldIn.getBlockState(pos.up()).get(MantelTopLeftStocking.STOCKING)) {
                worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP LEFT");
            }

            if (top_middle == worldIn.getBlockState(pos.up().west()).get(MantelTopCenterStocking.STOCKING)) {
                worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP MIDDLE");
            }

            if (top_right == worldIn.getBlockState(pos.up().west(2)).get(MantelTopRightStocking.STOCKING)) {
                worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP RIGHT");
           }

            // destroy block above//
            worldIn.setBlockState(pos.up(), Blocks.AIR.getDefaultState(), 35);
            //destroy block 1 block above and to right//
            worldIn.setBlockState(pos.up().west(), Blocks.AIR.getDefaultState(), 35);
            //destroy block 1 block above and 2 blocks to right//
            worldIn.setBlockState(pos.up().west(2), Blocks.AIR.getDefaultState(), 35);
            //destroy LEG block 2 blocks to right//
            worldIn.setBlockState(pos.west(2), Blocks.AIR.getDefaultState(), 35);
        }  //END SOUTH FACING//



            if (state.get(MantelLegLeft.FACING) == Direction.EAST) {

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
                //destroy block above//
                worldIn.setBlockState(pos.up(), Blocks.AIR.getDefaultState(), 35);
                //destroy block 1 block above and to right//
                worldIn.setBlockState(pos.up().south(), Blocks.AIR.getDefaultState(), 35);
                //destroy block 1 block above and 2 blocks to right//
                worldIn.setBlockState(pos.up().south(2), Blocks.AIR.getDefaultState(), 35);
                //destroy block 2 blocks to right//
                worldIn.setBlockState(pos.south(2), Blocks.AIR.getDefaultState(), 35);
            } //END EAST FACING//

            if (state.get(MantelLegLeft.FACING) == Direction.WEST) {

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
                } //END WEST FACING//

                //destroy block above//
                worldIn.setBlockState(pos.up(), Blocks.AIR.getDefaultState(), 35);
                //destroy block 1 block above and to right//
                worldIn.setBlockState(pos.up().north(), Blocks.AIR.getDefaultState(), 35);
                //destroy block 1 block above and 2 blocks to right//
                worldIn.setBlockState(pos.up().north(2), Blocks.AIR.getDefaultState(), 35);
                //destroy block 2 blocks to right//
                worldIn.setBlockState(pos.north(2), Blocks.AIR.getDefaultState(), 35);
            }
        super.onBlockHarvested(worldIn, pos, state, player);

    }

}
