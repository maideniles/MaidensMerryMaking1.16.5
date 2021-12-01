package com.maideniles.maidensmerrymaking.blocks.deco;

import com.maideniles.maidensmerrymaking.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import java.util.Random;

public class MkekaWithChaliceBlock extends HorizontalDecoBlock{

    protected static final VoxelShape SHAPE = Block.makeCuboidShape(5.0D, 0.0D, 5.0D, 11.0D, 8.0D, 11.0D);


    public static final BooleanProperty CUP = BooleanProperty.create("cup");

    public MkekaWithChaliceBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return super.getStateForPlacement(context).with(DIRECTION, context.getPlacementHorizontalFacing().getOpposite()).with(CUP, Boolean.FALSE);

    }

    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {

        return SHAPE;
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        Random random = worldIn.getRandom();


        ItemStack stack = player.getHeldItem(handIn);

            if(stack.isEmpty()){
                worldIn.setBlockState(pos, ModBlocks.MKEKA.get().getDefaultState().with(FACING, state.get(FACING)), 3);
                player.setHeldItem(handIn, new ItemStack(Item.getItemFromBlock(ModBlocks.CHALICE.get())));
                return ActionResultType.PASS;
            }




        return ActionResultType.SUCCESS;
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
        super.fillStateContainer(builder);
        builder.add(CUP);

    }


    @Override
    public void onPlayerDestroy(IWorld worldIn, BlockPos pos, BlockState p_176206_3_){
        Boolean has_cup = Boolean.TRUE;

        if(has_cup = worldIn.getBlockState(pos).get(MkekaWithChaliceBlock.CUP)) {
            worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Item.getItemFromBlock(ModBlocks.CHALICE.get()), 1)));

            System.out.println("DROPPED_CUP");
        }
    }



}
