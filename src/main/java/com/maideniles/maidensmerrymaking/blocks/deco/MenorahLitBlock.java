package com.maideniles.maidensmerrymaking.blocks.deco;

import com.maideniles.maidensmerrymaking.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class MenorahLitBlock extends HorizontalDecoBlock{

    protected static final VoxelShape WEST_AABB = Block.makeCuboidShape(5.5D, 0.0D, 0.0D, 11.5D, 21.0D, 16.0D);
    protected static final VoxelShape EAST_AABB = Block.makeCuboidShape(5.5D, 0.0D, 0.0D, 11.5D, 21.0D, 16.0D);
    protected static final VoxelShape NORTH_AABB = Block.makeCuboidShape(0.0D, 0.0D, 5.5D, 16.0D, 21.0D, 11.5D);
    protected static final VoxelShape SOUTH_AABB = Block.makeCuboidShape(0.0D, 0.0D, 5.5D, 16.0D, 21.0D, 11.5D);



    public MenorahLitBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return super.getStateForPlacement(context).with(DIRECTION, context.getPlacementHorizontalFacing().getOpposite());

    }

    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {

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





    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {

        worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(),  new ItemStack(ModItems.CANDLES.get(),8)));

        System.out.println("DROPPED_CANDLES");
        super.onBlockHarvested(worldIn, pos, state, player);
    }
}
