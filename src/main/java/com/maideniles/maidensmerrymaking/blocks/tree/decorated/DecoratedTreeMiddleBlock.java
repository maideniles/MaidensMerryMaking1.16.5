package com.maideniles.maidensmerrymaking.blocks.tree.decorated;


import com.maideniles.maidensmerrymaking.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.BushBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;


public class DecoratedTreeMiddleBlock extends BushBlock {

    protected static final VoxelShape SHAPE = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 16.0D, 14.0D);

    public DecoratedTreeMiddleBlock(Block.Properties properties) {
        super(properties);

    }

    @Override
    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        return SHAPE;
    }

    @Override
    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        Block block = state.getBlock();
        return block == ModBlocks.DECORATED_CHRISTMAS_TREE_BOTTOM.get() ||
                block == ModBlocks.DECORATED_WHITE_CHRISTMAS_TREE_BOTTOM.get()
                || block == ModBlocks.DECORATED_WHITE_LIGHTS_CHRISTMAS_TREE_BOTTOM.get()
                || block == ModBlocks.DECORATED_LIGHTS_CHRISTMAS_TREE_BOTTOM.get()
                || block == ModBlocks.DECORATED_MULTI_CHRISTMAS_TREE_BOTTOM.get()
                || block == ModBlocks.DECORATED_WHITE_MULTI_CHRISTMAS_TREE_BOTTOM.get();
    }

    public boolean isValidPosition(BlockState pState, IBlockReader worldIn, BlockPos pPos) {
        BlockPos blockpos = pPos.down();
        if (pState.getBlock() == this) //Forge: This function is called during world gen and placement, before this block is set, so if we are not 'here' then assume it's the pre-check.
            return worldIn.getBlockState(blockpos).canSustainPlant(worldIn, blockpos, Direction.UP, this);
        return this.isValidGround(worldIn.getBlockState(blockpos), worldIn, blockpos);
    }




    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {


        BlockState blockstate = worldIn.getBlockState(pos);
        BlockState blockstate2 = worldIn.getBlockState(pos.down());
        if (blockstate.getBlock() == this && blockstate2.getBlock() == ModBlocks.DECORATED_CHRISTMAS_TREE_BOTTOM.get()
        ||blockstate.getBlock() == this && blockstate2.getBlock() == ModBlocks.DECORATED_WHITE_CHRISTMAS_TREE_BOTTOM.get()
                || blockstate.getBlock() == this && blockstate2.getBlock() == ModBlocks.DECORATED_LIGHTS_CHRISTMAS_TREE_BOTTOM.get()
        || blockstate.getBlock() == this && blockstate2.getBlock() == ModBlocks.DECORATED_WHITE_LIGHTS_CHRISTMAS_TREE_BOTTOM.get()
        || blockstate.getBlock() == this && blockstate2.getBlock() == ModBlocks.DECORATED_MULTI_CHRISTMAS_TREE_BOTTOM.get()
                || blockstate.getBlock() == this && blockstate2.getBlock() == ModBlocks.DECORATED_WHITE_MULTI_CHRISTMAS_TREE_BOTTOM.get()) {

            worldIn.setBlockState(pos.down(), Blocks.AIR.getDefaultState(), 35);
            worldIn.setBlockState(pos, Blocks.AIR.getDefaultState(), 35);
            System.out.println("NO MORE TREE");
        }
super.onBlockHarvested(worldIn,pos,state,player);
    }

}
