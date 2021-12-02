package com.maideniles.maidensmerrymaking.blocks.lamppost;

import com.maideniles.maidensmerrymaking.blocks.deco.HorizontalDecoBlock;
import com.maideniles.maidensmerrymaking.init.ModBlocks;
import com.maideniles.maidensmerrymaking.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
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

public class LampPostPole extends HorizontalDecoBlock {

    protected static final VoxelShape SHAPE = Block.makeCuboidShape(7.0D, 0.0D, 7.0D, 9.0D, 16.0D, 9.0D);


    public LampPostPole(Properties properties) {
        super(properties);
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing());
    }

    public VoxelShape getShape(BlockState state, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        return SHAPE;
    }


    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit){
        ItemStack item = player.getHeldItem(handIn);
        if (!worldIn.isRemote()) {

            if (item.getItem() == Item.getItemFromBlock(ModBlocks.CHRISTMAS_WREATH.get()) ){
                System.out.println("WREATH");
                worldIn.setBlockState(pos, ModBlocks.LAMP_POST_POLE_WREATH.get().getDefaultState().with(FACING, state.get(FACING)),3);
               item.shrink(1);
            }

            if (item.getItem() == Item.getItemFromBlock(ModBlocks.CHRISTMAS_WREATH_WHITE_LIGHTS.get()) ){
                System.out.println("WREATH WHITE LIGHTS");
                worldIn.setBlockState(pos, ModBlocks.LAMP_POST_POLE_WREATH_WHITE.get().getDefaultState().with(FACING, state.get(FACING)),3);
                item.shrink(1);
            }

            if (item.getItem() == Item.getItemFromBlock(ModBlocks.CHRISTMAS_WREATH_MULTI_LIGHTS.get())){
                System.out.println("WREATH MULTI LIGHTS");
                worldIn.setBlockState(pos, ModBlocks.LAMP_POST_POLE_WREATH_MULTI.get().getDefaultState().with(FACING, state.get(FACING)),3);
                item.shrink(1);
            }

            if (item.getItem() == ModItems.BOW.get()){
                System.out.println("POST WITH BOW");
                worldIn.setBlockState(pos, ModBlocks.LAMP_POST_POLE_BOW.get().getDefaultState().with(FACING, state.get(FACING)),3);
                item.shrink(1);
            }

        }
        return ActionResultType.FAIL;
    }




    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {

        BlockState blockstate = worldIn.getBlockState(pos);

        if (blockstate.getBlock() == ModBlocks.LAMP_POST_POLE_BOW.get()) {
            worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.BOW.get())));
                }

        if (blockstate.getBlock() == ModBlocks.LAMP_POST_POLE_WREATH.get()) {
            worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Item.getItemFromBlock(ModBlocks.CHRISTMAS_WREATH.get()))));
        }

        if (blockstate.getBlock() == ModBlocks.LAMP_POST_POLE_WREATH_WHITE.get()) {
            worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Item.getItemFromBlock(ModBlocks.CHRISTMAS_WREATH_WHITE_LIGHTS.get()))));
        }

        if (blockstate.getBlock() == ModBlocks.LAMP_POST_POLE_WREATH_MULTI.get()) {
            worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Item.getItemFromBlock(ModBlocks.CHRISTMAS_WREATH_MULTI_LIGHTS.get()))));
        }
        super.onBlockHarvested(worldIn, pos, state, player);
    }


}
