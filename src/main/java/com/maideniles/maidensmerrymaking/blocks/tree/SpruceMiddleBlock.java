package com.maideniles.maidensmerrymaking.blocks.tree;


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
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;


public class SpruceMiddleBlock extends BushBlock {

    protected static final VoxelShape SHAPE = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 16.0D, 14.0D);

    public SpruceMiddleBlock(Block.Properties properties) {
        super(properties);

    }

    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_)  {
        return SHAPE;
    }

    @Override
    public boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        Block block = state.getBlock();
        return block == ModBlocks.TREE.get() ;
    }

    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
        BlockPos blockpos = pos.down();
        if (state.getBlock() == this) //Forge: This function is called during world gen and placement, before this block is set, so if we are not 'here' then assume it's the pre-check.
            return worldIn.getBlockState(blockpos).canSustainPlant(worldIn, blockpos, Direction.UP, this);
        return this.isValidGround(worldIn.getBlockState(blockpos), worldIn, blockpos);
    }




    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {

        BlockState blockstate = worldIn.getBlockState(pos);
        BlockState blockstate2 = worldIn.getBlockState(pos.down());
        if (blockstate.getBlock() == this && blockstate2.getBlock() == ModBlocks.TREE.get()) {

            worldIn.setBlockState(pos.down(), Blocks.AIR.getDefaultState(), 35);
            worldIn.setBlockState(pos, Blocks.AIR.getDefaultState(), 35);
            System.out.println("NO MORE TREE");
        }
        super.onBlockHarvested(worldIn, pos, state, player);
    }

}
