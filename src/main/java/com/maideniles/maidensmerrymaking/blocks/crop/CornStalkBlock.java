package com.maideniles.maidensmerrymaking.blocks.crop;

import com.maideniles.maidensmerrymaking.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.IGrowable;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class CornStalkBlock extends CropsBlock implements IGrowable
{
    public static final IntegerProperty AGE = BlockStateProperties.AGE_0_7;


    private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]
            {       /* age 0*/    Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D),
                    /* age 1*/    Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D),
                    /* age 2*/    Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D),
                    /* age 3*/    Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 20.0D, 16.0D),
                    /* age 4*/    Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 29.0D, 16.0D),
                    /* age 5*/    Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 32.0D, 16.0D),
                    /* age 6*/    Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 32.0D, 16.0D),
                    /* age 7*/    Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 32.0D, 16.0D)};

    public CornStalkBlock(Properties builder) {
        super(builder);
    }

    @Override
    protected IItemProvider getSeedsItem() {
        return ModItems.CORN_KERNELS.get();
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE_BY_AGE[state.get(this.getAgeProperty())];
    }

    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        int i = state.get(AGE);
        boolean flag = i == 3;
        if (!flag && player.getHeldItem(handIn).getItem() == Items.BONE_MEAL) {
            return ActionResultType.PASS;
        } else if (i > 1) {
            int j = 1 + worldIn.rand.nextInt(2);
            spawnAsEntity(worldIn, pos, new ItemStack(ModItems.CORN.get(), j + (flag ? 1 : 0)));
            worldIn.playSound((PlayerEntity)null, pos, SoundEvents.BLOCK_CROP_BREAK, SoundCategory.BLOCKS, 1.0F, 0.8F + worldIn.rand.nextFloat() * 0.4F);
            worldIn.setBlockState(pos, state.with(AGE, Integer.valueOf(1)), 2);
            return ActionResultType.func_233537_a_(worldIn.isRemote);
        } else {
            return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
        }
    }

}
