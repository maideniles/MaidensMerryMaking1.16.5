package com.maideniles.maidensmerrymaking.blocks.tree;


import com.maideniles.maidensmerrymaking.init.ModBlocks;
import com.maideniles.maidensmerrymaking.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.BushBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

public class ChristmasTreeMiddleBlock extends BushBlock {

    protected static final VoxelShape SHAPE = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 16.0D, 14.0D);

    public ChristmasTreeMiddleBlock(Block.Properties properties) {
        super(properties);

    }

    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        return SHAPE;
    }

    @Override
    public boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        Block block = state.getBlock();
        return block == ModBlocks.CHRISTMAS_TREE_BOTTOM.get()
                || block == ModBlocks.CHRISTMAS_TREE_WHITE_LIGHTS_BOTTOM.get()
                || block == ModBlocks.DECORATED_CHRISTMAS_TREE_BOTTOM.get()
                || block == ModBlocks.CHRISTMAS_TREE_MULTI_LIGHTS_BOTTOM.get();
    }

    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
        BlockPos blockpos = pos.down();
        if (state.getBlock() == this) //Forge: This function is called during world gen and placement, before this block is set, so if we are not 'here' then assume it's the pre-check.
            return worldIn.getBlockState(blockpos).canSustainPlant(worldIn, blockpos, Direction.UP, this);
        return this.isValidGround(worldIn.getBlockState(blockpos), worldIn, blockpos);
    }

    @Override
    public void onPlayerDestroy(IWorld worldIn, BlockPos pos, BlockState p_176206_3_) {
        BlockState blockstate = worldIn.getBlockState(pos);
        BlockState blockstate2 = worldIn.getBlockState(pos.down());
        if (blockstate.getBlock() == this && blockstate2.getBlock() == ModBlocks.CHRISTMAS_TREE_BOTTOM.get()
        || blockstate2.getBlock() == ModBlocks.CHRISTMAS_TREE_WHITE_LIGHTS_BOTTOM.get()
        || blockstate2.getBlock() == ModBlocks.CHRISTMAS_TREE_MULTI_LIGHTS_BOTTOM.get()) {
            worldIn.setBlockState(pos.down(), Blocks.AIR.getDefaultState(), 35);
            worldIn.setBlockState(pos, Blocks.AIR.getDefaultState(), 35);
        }

    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit){
        ItemStack tree = player.getHeldItem(handIn);

        if (!worldIn.isRemote()) {



            if (tree.getItem() == ModItems.MINI_LIGHTS_WHITE.get()){

                System.out.println("O CHRISTMAS TREE, O CHRISTMAS TREE!");
                worldIn.setBlockState(pos, ModBlocks.CHRISTMAS_TREE_WHITE_LIGHTS_MIDDLE.get().getDefaultState(),3);
                 worldIn.setBlockState(pos.down(), ModBlocks.CHRISTMAS_TREE_WHITE_LIGHTS_BOTTOM.get().getDefaultState(),3);
                  worldIn.setBlockState(pos.up(), ModBlocks.CHRISTMAS_TREE_WHITE_LIGHTS_TOP.get().getDefaultState(),3);

                tree.shrink(1);
            }

        }

        if (!worldIn.isRemote()) {



            if (tree.getItem() == ModItems.MINI_LIGHTS_MULTI.get()){

                System.out.println("O CHRISTMAS TREE, O CHRISTMAS TREE!");
                worldIn.setBlockState(pos, ModBlocks.CHRISTMAS_TREE_MULTI_LIGHTS_MIDDLE.get().getDefaultState(),3);
                   worldIn.setBlockState(pos.down(), ModBlocks.CHRISTMAS_TREE_MULTI_LIGHTS_BOTTOM.get().getDefaultState(),3);
                     worldIn.setBlockState(pos.up(), ModBlocks.CHRISTMAS_TREE_MULTI_LIGHTS_TOP.get().getDefaultState(),3);

                tree.shrink(1);
            }

        }

        if (!worldIn.isRemote()) {



            if (tree.getItem() == ModItems.ORNAMENTS.get()){

                System.out.println("O CHRISTMAS TREE, O CHRISTMAS TREE!");
                worldIn.setBlockState(pos.down(), ModBlocks.DECORATED_CHRISTMAS_TREE_BOTTOM.get().getDefaultState(),3);
                worldIn.setBlockState(pos, ModBlocks.DECORATED_CHRISTMAS_TREE_MIDDLE.get().getDefaultState(),3);
                worldIn.setBlockState(pos.up(), ModBlocks.DECORATED_CHRISTMAS_TREE_TOP.get().getDefaultState(),3);

                tree.shrink(1);
            }

        }

        if (!worldIn.isRemote()) {



            if (tree.getItem() == ModItems.ORNAMENTS_WHITE.get()){

                System.out.println("O CHRISTMAS TREE, O CHRISTMAS TREE!");
                worldIn.setBlockState(pos.down(), ModBlocks.DECORATED_WHITE_CHRISTMAS_TREE_BOTTOM.get().getDefaultState(),3);
                worldIn.setBlockState(pos, ModBlocks.DECORATED_WHITE_CHRISTMAS_TREE_MIDDLE.get().getDefaultState(),3);
                worldIn.setBlockState(pos.up(), ModBlocks.DECORATED_WHITE_CHRISTMAS_TREE_TOP.get().getDefaultState(),3);

                tree.shrink(1);
            }

        }

        return ActionResultType.PASS;
    }





}
