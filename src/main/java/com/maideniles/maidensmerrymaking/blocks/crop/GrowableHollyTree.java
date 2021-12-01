package com.maideniles.maidensmerrymaking.blocks.crop;


import com.maideniles.maidensmerrymaking.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.IGrowable;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class GrowableHollyTree extends Block implements IGrowable {

    protected static final VoxelShape SHAPE = Block.makeCuboidShape(4.0D, 0.0D, 4.0D, 12.0D, 16.0D, 12.0D);

    public GrowableHollyTree(Block.Properties p_48957_) {
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




    public void placeTree(ServerWorld worldIn, BlockPos pos, BlockState state, Random rand){

        //PLACE TRUNK//
        worldIn.setBlockState(pos, Blocks.SPRUCE_LOG.getDefaultState(), 3);
        worldIn.setBlockState(pos.up(),  Blocks.SPRUCE_LOG.getDefaultState(), 3);
        worldIn.setBlockState(pos.up(2),  Blocks.SPRUCE_LOG.getDefaultState(), 3);
        worldIn.setBlockState(pos.up(3),  Blocks.SPRUCE_LOG.getDefaultState(), 3);
        worldIn.setBlockState(pos.up(4),  Blocks.SPRUCE_LOG.getDefaultState(), 3);
        worldIn.setBlockState(pos.up(5),  Blocks.SPRUCE_LOG.getDefaultState(), 3);
        worldIn.setBlockState(pos.up(6),  Blocks.SPRUCE_LOG.getDefaultState(), 3);
//LAYER 1 LEAVES//
//ROW 1//
        worldIn.setBlockState(pos.add(-1,1,-2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(0,1,-2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(1,1,-2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
//ROW 2//
        worldIn.setBlockState(pos.add(-2,1,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(-1,1,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(0,1,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(1,1,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(2,1,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
//ROW 3//
        worldIn.setBlockState(pos.add(-2,1,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(-1,1,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(0,1,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(1,1,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(2,1,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
//ROW 4//
        worldIn.setBlockState(pos.add(-2,1,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(-1,1,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(0,1,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(1,1,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(2,1,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
//ROW 5//
        worldIn.setBlockState(pos.add(-1,1,2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(0,1,2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(1,1,2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
//PLACE LAYER 2  LEAVES//
        //ROW 1//
        worldIn.setBlockState(pos.add(-1,2,-2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(0,2,-2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(1,2,-2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
//ROW 2//
        worldIn.setBlockState(pos.add(-2,2,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(-1,2,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(0,2,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(1,2,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(2,2,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
//ROW 3//
        worldIn.setBlockState(pos.add(-2,2,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(-1,2,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(0,2,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(1,2,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(2,2,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
//ROW 4//
        worldIn.setBlockState(pos.add(-2,2,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(-1,2,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(0,2,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(1,2,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(2,2,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
//ROW 5//
        worldIn.setBlockState(pos.add(-1,2,2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(0,2,2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(1,2,2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);

//PLACE LAYER 3 LEAVES//
        //ROW 1//
        worldIn.setBlockState(pos.add(0,3,-2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
//ROW 2//
        worldIn.setBlockState(pos.add(-1,3,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(0,3,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(1,3,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
//ROW 3//
        worldIn.setBlockState(pos.add(-2,3,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(-1,3,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(1,3,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(2,3,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
//ROW 4//
        worldIn.setBlockState(pos.add(-1,3,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(0,3,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(1,3,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
//ROW 5//
        worldIn.setBlockState(pos.add(0,3,2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
 //PLACE LAYER 4 LEAVES//
        //ROW 1//
        worldIn.setBlockState(pos.add(0,4,-2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
//ROW 2//
        worldIn.setBlockState(pos.add(-1,4,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(0,4,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(1,4,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
//ROW 3//
        worldIn.setBlockState(pos.add(-2,4,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(-1,4,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(1,4,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(2,4,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
//ROW 4//
        worldIn.setBlockState(pos.add(-1,4,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(0,4,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(1,4,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
//ROW 5//
        worldIn.setBlockState(pos.add(0,4,2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
//PLACE LAYER 5 LEAVES//
        //ROW 1//
        worldIn.setBlockState(pos.add(-1,5,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(0,5,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(1,5,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
//ROW 2//
        worldIn.setBlockState(pos.add(-1,5,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(1,5,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
 //ROW 3//
        worldIn.setBlockState(pos.add(-1,5,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(0,5,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(1,5,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
    //PLACE LAYER 6 LEAVES//
        worldIn.setBlockState(pos.add(-1,6,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(1,6,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(0,6,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        worldIn.setBlockState(pos.add(0,6,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);
        //PLACE TOP LEAVES//
        worldIn.setBlockState(pos.add(0,7,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState(), 3);

    }

    @Override
    public boolean ticksRandomly(BlockState pos) {
        return true;
    }
}
