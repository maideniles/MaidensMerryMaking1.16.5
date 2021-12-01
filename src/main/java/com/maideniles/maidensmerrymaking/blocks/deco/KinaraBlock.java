package com.maideniles.maidensmerrymaking.blocks.deco;

import com.maideniles.maidensmerrymaking.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Random;

public class KinaraBlock extends HorizontalDecoBlock{

    protected static final VoxelShape WEST_AABB = Block.makeCuboidShape(5.5D, 0.0D, 0.0D, 11.5D, 16.0D, 16.0D);
    protected static final VoxelShape EAST_AABB = Block.makeCuboidShape(5.5D, 0.0D, 0.0D, 11.5D, 16.0D, 16.0D);
    protected static final VoxelShape NORTH_AABB = Block.makeCuboidShape(0.0D, 0.0D, 5.5D, 16.0D, 16.0D, 11.5D);
    protected static final VoxelShape SOUTH_AABB = Block.makeCuboidShape(0.0D, 0.0D, 5.5D, 16.0D, 16.0D, 11.5D);

    public static final BooleanProperty LIT = BooleanProperty.create("lit");

    public KinaraBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return super.getStateForPlacement(context).with(DIRECTION, context.getPlacementHorizontalFacing().getOpposite()).with(LIT, Boolean.FALSE);

    }

    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {

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
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        Random random = worldIn.getRandom();


        ItemStack stack = player.getHeldItem(handIn);

        if (!worldIn.isRemote()) {
            if(stack.getItem() == Items.FLINT_AND_STEEL){
                System.out.println("LIT KINARA");
                worldIn.setBlockState(pos, ModBlocks.KINARA_LIT.get().getDefaultState().with(FACING, state.get(FACING)).with(KinaraBlock.LIT, Boolean.TRUE), 3);
                stack.damageItem(1, player, p -> p.sendBreakAnimation(EquipmentSlotType.MAINHAND));

                return ActionResultType.FAIL;
            }


        }

        return ActionResultType.SUCCESS;
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
        super.fillStateContainer(builder);
        builder.add(LIT);

    }








    }
