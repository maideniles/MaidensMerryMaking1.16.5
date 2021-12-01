package com.maideniles.maidensmerrymaking.blocks.fireplace.mantel.base;

import com.maideniles.maidensmerrymaking.blocks.deco.HorizontalDecoBlock;
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
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class MantelTopLeftStocking extends HorizontalDecoBlock {
    protected static final VoxelShape WEST_AABB = Block.makeCuboidShape(0.0D, 8.0D, 0.0D, 9.0D, 16.0D, 16.0D);
    protected static final VoxelShape EAST_AABB = Block.makeCuboidShape(7.0D, 8.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    protected static final VoxelShape NORTH_AABB = Block.makeCuboidShape(0.0D, 8.0D, 0.0D, 16.0D, 16.0D, 9.0D);
    protected static final VoxelShape SOUTH_AABB = Block.makeCuboidShape(0.0D, 8.0D, 7.0D, 16.0D, 16.0D, 16.0D);



    private static final VoxelShape LEG_WEST_AABB = Block.makeCuboidShape(0.0D, 0.0D, 8.0D, 8.0D, 8.0D, 14.0D);
    private static final VoxelShape LEG_EAST_AABB = Block.makeCuboidShape(8.0D, 0.0D, 2.0D, 16.0D, 8.0D, 8.0D);
    private static final VoxelShape LEG_NORTH_AABB = Block.makeCuboidShape(2.0D, 0.0D, 0.0D, 7.5D, 8.0D, 8.0D);
    private static final VoxelShape LEG_SOUTH_AABB = Block.makeCuboidShape(8.0D, 0.0D, 8.0D, 14.0D, 8.0D, 16.0D);

    public static VoxelShape WITH_LEG_WEST;
    public static VoxelShape WITH_LEG_EAST;
    public static VoxelShape WITH_LEG_NORTH;
    public static VoxelShape WITH_LEG_SOUTH;

    public static final BooleanProperty STOCKING = BooleanProperty.create("stocking");

    public MantelTopLeftStocking(Properties properties) {
        super(properties);

        WITH_LEG_WEST = VoxelShapes.combine(LEG_WEST_AABB, WEST_AABB, IBooleanFunction.OR);
        WITH_LEG_EAST = VoxelShapes.combine(LEG_EAST_AABB, EAST_AABB, IBooleanFunction.OR);
        WITH_LEG_NORTH = VoxelShapes.combine(LEG_NORTH_AABB, NORTH_AABB, IBooleanFunction.OR);
        WITH_LEG_SOUTH = VoxelShapes.combine(LEG_SOUTH_AABB, SOUTH_AABB, IBooleanFunction.OR);


    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite()).with(STOCKING,Boolean.TRUE);
    }

    public VoxelShape getShape(BlockState state, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        switch((Direction)state.get(FACING)) {
            case SOUTH:
                return WITH_LEG_SOUTH;
            case NORTH:
            default:
                return WITH_LEG_NORTH;
            case WEST:
                return WITH_LEG_WEST;
            case EAST:
                return WITH_LEG_EAST;
        }


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
    public void onPlayerDestroy(IWorld worldIn, BlockPos pos, BlockState state) {

        Boolean top_left = Boolean.TRUE;
        Boolean top_middle = Boolean.TRUE;
        Boolean top_right = Boolean.TRUE;


        if (state.get(MantelTopLeftStocking.FACING) == Direction.NORTH) {

            if ( top_left == worldIn.getBlockState(pos).get(MantelTopLeftStocking.STOCKING)) {
                worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP LEFT");
            }

            if (top_middle == worldIn.getBlockState(pos.east()).get(MantelTopCenterStocking.STOCKING)) {
                worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP MIDDLE");
            }

            if (top_right == worldIn.getBlockState(pos.east(2)).get(MantelTopRightStocking.STOCKING)) {
                worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP RIGHT");
            }

            //destroy LEG block below//
            worldIn.setBlockState(pos.down(), Blocks.AIR.getDefaultState(), 35);
            //destroy 1 block to the right//
            worldIn.setBlockState(pos.east(), Blocks.AIR.getDefaultState(), 35);
            //destroy 2 blocks to right//
            worldIn.setBlockState(pos.east(2), Blocks.AIR.getDefaultState(), 35);
            //destroy LEG block below and 2 blocks to right//
            worldIn.setBlockState(pos.down().east(2), Blocks.AIR.getDefaultState(), 35);

        }

        if (state.get(MantelTopLeftStocking.FACING) == Direction.SOUTH) {

           if ( top_left == worldIn.getBlockState(pos).get(MantelTopLeftStocking.STOCKING)) {
                worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP LEFT");
            }

            if (top_middle == worldIn.getBlockState(pos.west()).get(MantelTopCenterStocking.STOCKING)) {
                worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP MIDDLE");
            }

            if (top_right == worldIn.getBlockState(pos.west(2)).get(MantelTopRightStocking.STOCKING)) {
                worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP RIGHT");
            }


            //destroy block below//
            worldIn.setBlockState(pos.down(), Blocks.AIR.getDefaultState(), 35);
            //destroy block 1 block to right//
            worldIn.setBlockState(pos.west(), Blocks.AIR.getDefaultState(), 35);
            //destroy block 2 blocks to right//
            worldIn.setBlockState(pos.west(2), Blocks.AIR.getDefaultState(), 35);
            //destroy block 1 block below and 2 blocks to right//
            worldIn.setBlockState(pos.down().west(2), Blocks.AIR.getDefaultState(), 35);

        }

        if (state.get(MantelTopLeftStocking.FACING) == Direction.EAST) {

           if ( top_left == worldIn.getBlockState(pos).get(MantelTopLeftStocking.STOCKING)) {
                worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP LEFT");
            }

            if (top_middle == worldIn.getBlockState(pos.south()).get(MantelTopCenterStocking.STOCKING)) {
                worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP MIDDLE");
            }

            if (top_right == worldIn.getBlockState(pos.south(2)).get(MantelTopRightStocking.STOCKING)) {
                worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP RIGHT");
            }

            //destroy block below//
            worldIn.setBlockState(pos.down(), Blocks.AIR.getDefaultState(), 35);
            //destroy block 1 block below  right//
            worldIn.setBlockState(pos.south(), Blocks.AIR.getDefaultState(), 35);
            //destroy block 2 blocks to right//
            worldIn.setBlockState(pos.south(2), Blocks.AIR.getDefaultState(), 35);
            //destroy block 1 block below and 2 blocks to right//
            worldIn.setBlockState(pos.down().south(2), Blocks.AIR.getDefaultState(), 35);

        }

        if (state.get(MantelTopLeftStocking.FACING) == Direction.WEST) {

            if ( top_left == worldIn.getBlockState(pos).get(MantelTopLeftStocking.STOCKING)) {
                worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP LEFT");
            }

            if (top_middle == worldIn.getBlockState(pos.north()).get(MantelTopCenterStocking.STOCKING)) {
                worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP MIDDLE");
            }

            if (top_right == worldIn.getBlockState(pos.north(2)).get(MantelTopRightStocking.STOCKING)) {
                worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.STOCKING.get())));
                System.out.println("DROPPED STOCKING FROM TOP RIGHT");
            }


            //destroy block below//
            worldIn.setBlockState(pos.down(), Blocks.AIR.getDefaultState(), 35);
            //destroy block 1 block to  right//
            worldIn.setBlockState(pos.north(), Blocks.AIR.getDefaultState(), 35);
            //destroy block 2 blocks to right//
            worldIn.setBlockState(pos.north(2), Blocks.AIR.getDefaultState(), 35);
            //destroy block 1 block below and 2 blocks to right//
            worldIn.setBlockState(pos.down().north(2), Blocks.AIR.getDefaultState(), 35);

        }


    }

    @Override
    public boolean canDropFromExplosion(BlockState state, IBlockReader world, BlockPos pos, Explosion explosion) {
        return true;
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
        super.fillStateContainer(builder);
        builder.add(STOCKING);

    }




}


