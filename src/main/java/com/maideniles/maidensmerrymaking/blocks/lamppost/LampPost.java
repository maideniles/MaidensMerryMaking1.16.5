package com.maideniles.maidensmerrymaking.blocks.lamppost;

import com.maideniles.maidensmerrymaking.blocks.deco.HorizontalDecoBlock;
import com.maideniles.maidensmerrymaking.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class LampPost extends HorizontalDecoBlock {

    protected static final VoxelShape SHAPE = Block.makeCuboidShape(3.0D, 0.0D, 3.0D, 13.0D, 16.0D, 13.0D);


    public LampPost(Properties properties) {
        super(properties);
    }

    public VoxelShape getShape(BlockState state, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {

        return SHAPE;
    }

    @Override
        public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing());
    }



    @Override
        public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack
        stack)  {


        BlockState blockstate = worldIn.getBlockState(pos.down());
        BlockState blockstate1 = worldIn.getBlockState(pos.down(2));


        if (blockstate.getBlock() == this) {

            worldIn.setBlockState(pos.down(), ModBlocks.LAMP_POST_BOTTOM.get().getDefaultState().with(FACING, state.get(FACING)),3);
            worldIn.setBlockState(pos, ModBlocks.LAMP_POST.get().getDefaultState().with(FACING, state.get(FACING)),3);
//THIS ONE WORKS//
        }

        if(blockstate.getBlock() == this && blockstate1.getBlock() == ModBlocks.LAMP_POST_BOTTOM.get()){

            worldIn.setBlockState(pos.down(2), ModBlocks.LAMP_POST_BOTTOM.get().getDefaultState().with(FACING, state.get(FACING)),3);
            worldIn.setBlockState(pos.down(), ModBlocks.LAMP_POST_POLE.get().getDefaultState().with(FACING, state.get(FACING)),3);

            worldIn.setBlockState(pos, ModBlocks.LAMP_POST.get().getDefaultState().with(FACING, state.get(FACING)),3);
        }

        if(blockstate.getBlock() == this && blockstate1.getBlock() == ModBlocks.LAMP_POST_POLE.get()){
            worldIn.setBlockState(pos.down(2), ModBlocks.LAMP_POST_POLE.get().getDefaultState().with(FACING, state.get(FACING)),3);
            worldIn.setBlockState(pos.down(), ModBlocks.LAMP_POST_POLE.get().getDefaultState().with(FACING, state.get(FACING)),3);

            worldIn.setBlockState(pos, ModBlocks.LAMP_POST.get().getDefaultState().with(FACING, state.get(FACING)),3);

        }
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit){



        ItemStack torch = player.getHeldItem(handIn);

        if (!worldIn.isRemote()) {

            if (torch.getItem() == Items.TORCH ) {
                System.out.println("YOU LIGHT UP MY LIFE!");
                worldIn.setBlockState(pos, ModBlocks.LAMP_POST_ON.get().getDefaultState().with(FACING, state.get(FACING)),3);
                torch.shrink(1);
            }
       }
        return ActionResultType.FAIL;
    }


    }


