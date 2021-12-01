package com.maideniles.maidensmerrymaking.blocks.tree.decorated;


import com.maideniles.maidensmerrymaking.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;


public class DecoratedTreeBottomBlock extends Block {

    protected static final VoxelShape SHAPE = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 16.0D, 14.0D);

    public DecoratedTreeBottomBlock(Block.Properties properties) {
        super(properties);

    }

    @Override
    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        return SHAPE;
    }

    @Override
    public void onPlayerDestroy(IWorld worldIn, BlockPos pos, BlockState p_176206_3_) {
        super.onPlayerDestroy(worldIn, pos, p_176206_3_);




        BlockState blockstate = worldIn.getBlockState(pos);

        if (blockstate.getBlock() == this ) {

            worldIn.setBlockState(pos, ModBlocks.CHRISTMAS_TREE_STAND.get().getDefaultState(), 35);
        }

    }



}
