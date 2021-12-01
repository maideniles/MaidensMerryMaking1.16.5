package com.maideniles.maidensmerrymaking.blocks.fireplace.logs;


import com.maideniles.maidensmerrymaking.blocks.deco.HorizontalDecoBlock;
import com.maideniles.maidensmerrymaking.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Random;

public class FireplaceLogsOn extends HorizontalDecoBlock {
    protected static final VoxelShape WEST_AABB = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D);
    protected static final VoxelShape EAST_AABB = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D);
    protected static final VoxelShape NORTH_AABB = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D);
    protected static final VoxelShape SOUTH_AABB = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D);


    public static final BooleanProperty BURNING = BooleanProperty.create("burning");


    public FireplaceLogsOn(Properties properties) {
        super(properties.sound(SoundType.WOOD));
    }


    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return super.getStateForPlacement(context).with(DIRECTION, context.getPlacementHorizontalFacing().getOpposite()).with(BURNING, Boolean.TRUE);

    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit){
        Random random = worldIn.getRandom();
        Boolean burnt = Boolean.FALSE;

        ItemStack stack = player.getHeldItem(handIn);

        if (!worldIn.isRemote()) {

            }

            if (stack.getItem() == Items.WATER_BUCKET) {

                System.out.println("FIREPLACE QUENCHED");
                stack.shrink(1);
                player.setHeldItem(handIn,new ItemStack(Items.BUCKET));
                worldIn.setBlockState(pos, ModBlocks.FIREPLACE_LOGS.get().getDefaultState().with(FACING, state.get(FACING)).with(Fireplace.BURNED, Boolean.TRUE), 3);
                worldIn.playSound((double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, SoundEvents.ENTITY_GENERIC_EXTINGUISH_FIRE, SoundCategory.BLOCKS, 0.5F + random.nextFloat(), random.nextFloat() * 0.7F + 0.6F, false);
                worldIn.addParticle(ParticleTypes.SMOKE, (double)pos.getX() + 0.5D + random.nextDouble() / 4.0D * (double)(random.nextBoolean() ? 1 : -1), (double)pos.getY() + 0.4D, (double)pos.getZ() + 0.5D + random.nextDouble() / 4.0D * (double)(random.nextBoolean() ? 1 : -1), 0.0D, 0.005D, 0.0D);
                return ActionResultType.PASS;
            }

            if(burnt == worldIn.getBlockState(pos).get(FireplaceLogsOn.BURNING)) {

                if (stack.getItem() == Items.FLINT_AND_STEEL) {
                    System.out.println("LIT FIREPLACE AGAIN");
                    worldIn.setBlockState(pos, ModBlocks.MKEKA_WITH_KINARA_LIT.get().getDefaultState().with(FACING, state.get(FACING)).with(FireplaceLogsOn.BURNING, Boolean.TRUE), 3);


                }


        }

        return ActionResultType.SUCCESS;
    }


    public VoxelShape getShape(BlockState state, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {

        switch(state.get(DIRECTION)) {
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

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
        super.fillStateContainer(builder);
        builder.add(BURNING);

    }


}
