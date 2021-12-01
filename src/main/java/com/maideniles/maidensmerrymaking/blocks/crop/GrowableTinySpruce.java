package com.maideniles.maidensmerrymaking.blocks.crop;

import com.maideniles.maidensmerrymaking.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.IGrowable;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class GrowableTinySpruce extends Block implements IGrowable {

    protected static final VoxelShape SHAPE = Block.makeCuboidShape(4.0D, 0.0D, 4.0D, 12.0D, 16.0D, 12.0D);

    public GrowableTinySpruce(Block.Properties p_48957_) {
        super(p_48957_);
    }

    /**
     * Get the OffsetType for this Block. Determines if the model is rendered slightly offset.
     */


    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }

    /**
     * Performs a random tick on a block.
     */
    public void randomTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
        if (worldIn.getLight(pos.up()) >= 9 && random.nextInt(7) == 0) {
            if (!worldIn.isAreaLoaded(pos, 1)) return; // Forge: prevent loading unloaded chunks when checking neighbor's light
            this.placeTree(worldIn, pos, state, random);
        }

    }

    public boolean isValidGround(BlockState pos, World worldIn, BlockPos pPos) {
        return worldIn.getBlockState(pPos.down()).isIn(BlockTags.BAMBOO_PLANTABLE_ON);
    }


    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
        return (double)worldIn.rand.nextFloat() < 0.45D;
    }

    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
        return true;
    }

    public void grow(ServerWorld worldIn, Random rand, BlockPos pos, BlockState state) {
        this.placeTree(worldIn, pos, state, rand);
    }


    public void placeTree(ServerWorld worldIn, BlockPos pos, BlockState state, Random rand) {
        worldIn.setBlockState(pos, ModBlocks.TREE.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.up(), ModBlocks.TREE_MIDDLE.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.up(2), ModBlocks.TREE_TOP.get().getDefaultState(), 3);


    }

    @Override
    public boolean ticksRandomly(BlockState pState) {
        return true;
    }
}