package com.maideniles.maidensmerrymaking.blocks.fireplace.mantel.base;

import com.maideniles.maidensmerrymaking.blocks.deco.MantelDecoBlock;
import com.maideniles.maidensmerrymaking.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class MantelTopCenterStocking extends MantelDecoBlock {


    protected static final VoxelShape MANTEL_WEST_AABB = Block.makeCuboidShape(0.0D, 8.0D, 0.0D, 9.0D, 16.0D, 16.0D);
    protected static final VoxelShape MANTEL_EAST_AABB = Block.makeCuboidShape(7.0D, 8.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    protected static final VoxelShape MANTEL_NORTH_AABB = Block.makeCuboidShape(0.0D, 8.0D, 0.0D, 16.0D, 16.0D, 9.0D);
    protected static final VoxelShape MANTEL_SOUTH_AABB = Block.makeCuboidShape(0.0D, 8.0D, 7.0D, 16.0D, 16.0D, 16.0D);

    public static final BooleanProperty STOCKING = BooleanProperty.create("stocking");

    public MantelTopCenterStocking(Properties properties) {
        super(properties);


    }

    public VoxelShape getShape(BlockState state, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {

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

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return super.getStateForPlacement(context).with(DIRECTION, context.getPlacementHorizontalFacing().getOpposite());

    }


    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit){


        ItemStack stocking = player.getHeldItem(handIn);

        if (!worldIn.isRemote()) {


            if (stocking.isEmpty()) {
                worldIn.setBlockState(pos, this.getDefaultState().with(FACING, state.get(FACING)).with(STOCKING, Boolean.FALSE), 3);


                player.setHeldItem(handIn,new ItemStack(ModItems.STOCKING.get()));
                return ActionResultType.PASS;
            }

            if (stocking.getItem() == ModItems.STOCKING.get()) {

                System.out.println("THE STOCKINGS WERE HUNG");
                worldIn.setBlockState(pos, this.getDefaultState().with(FACING, state.get(FACING)).with(STOCKING, Boolean.TRUE), 3);


                stocking.shrink(1);

            }


        }

        return ActionResultType.SUCCESS;
    }









    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {

        Boolean top_left = Boolean.TRUE;
        Boolean top_middle = Boolean.TRUE;
        Boolean top_right = Boolean.TRUE;

        if (state.get(MantelTopCenterStocking.FACING) == Direction.NORTH) {

            if ( top_middle == worldIn.getBlockState(pos).get(MantelTopCenterStocking.STOCKING)) {
                 worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP RIGHT");
            }

            if (top_left == worldIn.getBlockState(pos.west()).get(MantelTopLeftStocking.STOCKING)) {
                 worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP MIDDLE");
            }

            if (top_right == worldIn.getBlockState(pos.east()).get(MantelTopRightStocking.STOCKING)) {
                 worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP LEFT");
            }

            //destroy block to left//
            worldIn.setBlockState(pos.west(), Blocks.AIR.getDefaultState(), 35);
            //destroy block  to right//
            worldIn.setBlockState(pos.east(), Blocks.AIR.getDefaultState(), 35);
            //destroy block 1 block down and 1 to right//
            worldIn.setBlockState(pos.down().east(), Blocks.AIR.getDefaultState(), 35);
            //destroy block 1 blocks down and 1 to left//
            worldIn.setBlockState(pos.down().west(), Blocks.AIR.getDefaultState(), 35);
        }

        if (state.get(MantelTopCenterStocking.FACING) == Direction.SOUTH) {

            if ( top_middle == worldIn.getBlockState(pos).get(MantelTopCenterStocking.STOCKING)) {
                 worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP RIGHT");
            }

            if (top_left == worldIn.getBlockState(pos.east()).get(MantelTopLeftStocking.STOCKING)) {
                 worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP MIDDLE");
            }

            if (top_right == worldIn.getBlockState(pos.west()).get(MantelTopRightStocking.STOCKING)) {
                 worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP LEFT");
            }

            //destroy block to left//
            worldIn.setBlockState(pos.east(), Blocks.AIR.getDefaultState(), 35);
            //destroy block  to right//
            worldIn.setBlockState(pos.west(), Blocks.AIR.getDefaultState(), 35);
            //destroy block 1 block down and 1 to right//
            worldIn.setBlockState(pos.down().west(), Blocks.AIR.getDefaultState(), 35);
            //destroy block 1 blocks down and 1 to left//
            worldIn.setBlockState(pos.down().east(), Blocks.AIR.getDefaultState(), 35);
        }

        if (state.get(MantelTopCenterStocking.FACING) == Direction.EAST) {

            if ( top_middle == worldIn.getBlockState(pos).get(MantelTopCenterStocking.STOCKING)) {
                 worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP RIGHT");
            }

            if (top_left == worldIn.getBlockState(pos.north()).get(MantelTopLeftStocking.STOCKING)) {
                 worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP MIDDLE");
            }

            if (top_right == worldIn.getBlockState(pos.south()).get(MantelTopRightStocking.STOCKING)) {
                 worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP LEFT");
            }

            //destroy block to left//
            worldIn.setBlockState(pos.north(), Blocks.AIR.getDefaultState(), 35);
            //destroy block  to right//
            worldIn.setBlockState(pos.south(), Blocks.AIR.getDefaultState(), 35);
            //destroy block 1 block down and 1 to right//
            worldIn.setBlockState(pos.down().south(), Blocks.AIR.getDefaultState(), 35);
            //destroy block 1 blocks down and 1 to left//
            worldIn.setBlockState(pos.down().north(), Blocks.AIR.getDefaultState(), 35);
        }

        if (state.get(MantelTopCenterStocking.FACING) == Direction.WEST) {

            if ( top_middle == worldIn.getBlockState(pos).get(MantelTopCenterStocking.STOCKING)) {
                 worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP RIGHT");
            }

            if (top_left == worldIn.getBlockState(pos.south()).get(MantelTopLeftStocking.STOCKING)) {
                 worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP MIDDLE");
            }

            if (top_right == worldIn.getBlockState(pos.north()).get(MantelTopRightStocking.STOCKING)) {
                 worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP LEFT");
            }

            //destroy block to left//
            worldIn.setBlockState(pos.south(), Blocks.AIR.getDefaultState(), 35);
            //destroy block  to right//
            worldIn.setBlockState(pos.north(), Blocks.AIR.getDefaultState(), 35);
            //destroy block 1 block down and 1 to right//
            worldIn.setBlockState(pos.down().south(), Blocks.AIR.getDefaultState(), 35);
            //destroy block 1 blocks down and 1 to left//
            worldIn.setBlockState(pos.down().north(), Blocks.AIR.getDefaultState(), 35);
        }
        super.onBlockHarvested(worldIn, pos, state, player);
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
        super.fillStateContainer(builder);
        builder.add(STOCKING);

    }

}





