package com.maideniles.maidensmerrymaking.blocks.tree.lights;

import com.maideniles.maidensmerrymaking.init.ModBlocks;
import com.maideniles.maidensmerrymaking.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class MultiChristmasTreeBottomBlock extends Block {

    protected static final VoxelShape SHAPE = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);



    public MultiChristmasTreeBottomBlock(Properties properties) {
        super(properties);
    }

    public VoxelShape getShape(BlockState state, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        return SHAPE;
    }

    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {

        BlockState blockstate = worldIn.getBlockState(pos);

        if (blockstate.getBlock() == this ) {

            worldIn.setBlockState(pos, ModBlocks.CHRISTMAS_TREE_STAND.get().getDefaultState(), 35);
        }
        super.onBlockHarvested(worldIn, pos, state, player);
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit){
        ItemStack tree = player.getHeldItem(handIn);





        if (!worldIn.isRemote()) {



            if (tree.getItem() == ModItems.ORNAMENTS.get()){

                System.out.println("O CHRISTMAS TREE, O CHRISTMAS TREE!");
                worldIn.setBlockState(pos, ModBlocks.DECORATED_MULTI_CHRISTMAS_TREE_BOTTOM.get().getDefaultState(),3);
                worldIn.setBlockState(pos.up(), ModBlocks.DECORATED_MULTI_CHRISTMAS_TREE_MIDDLE.get().getDefaultState(),3);
                worldIn.setBlockState(pos.up(2), ModBlocks.DECORATED_MULTI_CHRISTMAS_TREE_TOP.get().getDefaultState(),3);

                tree.shrink(1);
            }

        }

        if (!worldIn.isRemote()) {



            if (tree.getItem() == ModItems.ORNAMENTS_WHITE.get()){

                System.out.println("O CHRISTMAS TREE, O CHRISTMAS TREE!");
                worldIn.setBlockState(pos, ModBlocks.DECORATED_WHITE_MULTI_CHRISTMAS_TREE_BOTTOM.get().getDefaultState(),3);
                worldIn.setBlockState(pos.up(), ModBlocks.DECORATED_WHITE_MULTI_CHRISTMAS_TREE_MIDDLE.get().getDefaultState(),3);
                worldIn.setBlockState(pos.up(2), ModBlocks.DECORATED_WHITE_MULTI_CHRISTMAS_TREE_TOP.get().getDefaultState(),3);

                tree.shrink(1);
            }

        }

        return ActionResultType.PASS;
    }



}
