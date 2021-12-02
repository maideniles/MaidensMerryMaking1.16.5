package com.maideniles.maidensmerrymaking.blocks.deco;

import com.maideniles.maidensmerrymaking.init.ModBlocks;
import com.maideniles.maidensmerrymaking.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
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

public class MkekaBlock extends HorizontalDecoBlock{

    protected static final VoxelShape WEST_AABB = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D);
    protected static final VoxelShape EAST_AABB = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D);
    protected static final VoxelShape NORTH_AABB = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D);
    protected static final VoxelShape SOUTH_AABB = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D);


    public MkekaBlock(Properties properties) {
        super(properties);
    }


    public VoxelShape getShape(BlockState state, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        {

            switch (state.get(DIRECTION)) {
                case SOUTH:
                    return SOUTH_AABB;
                case NORTH:
                default:
                    return NORTH_AABB;
                case WEST:
                    return WEST_AABB;
                case EAST:
                    return EAST_AABB;
            }
        }

    }

    @Override
        public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit){
        //   Random random = worldIn.getRandom();
        ItemStack stack = player.getHeldItem(handIn);
        Block block = worldIn.getBlockState(pos).getBlock();

        if (!worldIn.isRemote()) {
            if (stack.getItem() == Item.getItemFromBlock(ModBlocks.KINARA.get())) {
                worldIn.setBlockState(pos, ModBlocks.MKEKA_WITH_KINARA.get().getDefaultState().with(FACING, state.get(FACING)).with(MkekaWithKinaraBlock.LIT, Boolean.FALSE), 3);
                worldIn.setBlockState(pos.up(), Blocks.AIR.getDefaultState(), 3);

                System.out.println("PLACED KINARA ON MAT");
                stack.shrink(1);
            }

            if (stack.getItem() == Item.getItemFromBlock(ModBlocks.CHALICE.get())) {
                worldIn.setBlockState(pos, ModBlocks.MKEKA_WITH_CHALICE.get().getDefaultState().with(FACING, state.get(FACING)).with(MkekaWithChaliceBlock.CUP, Boolean.TRUE), 3);
                worldIn.setBlockState(pos.up(), Blocks.AIR.getDefaultState(), 3);

                System.out.println("PLACED CHALICE ON MAT");
                stack.shrink(1);
            }

            if (stack.getItem() == ModItems.CORN.get() && block == ModBlocks.MKEKA.get()) {

                worldIn.setBlockState(pos, ModBlocks.MKEKA_WITH_CORN_1.get().getDefaultState().with(FACING, state.get(FACING)), 3);
                worldIn.setBlockState(pos.up(), Blocks.AIR.getDefaultState(), 3);

                System.out.println("PLACED CORN ON MAT");
                stack.shrink(1);
            }

            if (stack.getItem() == ModItems.CORN.get() && block == ModBlocks.MKEKA_WITH_CORN_1.get()) {
                worldIn.setBlockState(pos, ModBlocks.MKEKA_WITH_CORN_2.get().getDefaultState().with(FACING, state.get(FACING)), 3);
                worldIn.setBlockState(pos.up(), Blocks.AIR.getDefaultState(), 3);

                System.out.println("PLACED 2 CORN ON MAT");
                stack.shrink(1);
            }

            if (stack.getItem() == ModItems.CORN.get() && block == ModBlocks.MKEKA_WITH_CORN_2.get()) {
                worldIn.setBlockState(pos, ModBlocks.MKEKA_WITH_CORN_3.get().getDefaultState().with(FACING, state.get(FACING)), 3);
                worldIn.setBlockState(pos.up(), Blocks.AIR.getDefaultState(), 3);

                System.out.println("PLACED 3 CORN ON MAT");
                stack.shrink(1);
            }

            return ActionResultType.FAIL;

        }

        return ActionResultType.SUCCESS;


}
    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
Block corn = worldIn.getBlockState(pos).getBlock();

if(corn == ModBlocks.MKEKA_WITH_CORN_1.get()){
    worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(),new ItemStack(ModItems.CORN.get(),1)));
    System.out.println("DROPPED 1 CORN");
}
        if(corn == ModBlocks.MKEKA_WITH_CORN_2.get()){
            worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(),new ItemStack(ModItems.CORN.get(),2)));
            System.out.println("DROPPED 2 CORN");
        }

        if(corn == ModBlocks.MKEKA_WITH_CORN_3.get()){
            worldIn.addEntity(new ItemEntity((World) worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.CORN.get(),3)));
            System.out.println("DROPPED 3 CORN");
        }
        super.onBlockHarvested(worldIn, pos, state, player);
    }


}
