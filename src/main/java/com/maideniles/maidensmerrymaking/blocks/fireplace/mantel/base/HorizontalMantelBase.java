package com.maideniles.maidensmerrymaking.blocks.fireplace.mantel.base;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;


public abstract class HorizontalMantelBase extends Block {


    public static final DirectionProperty DIRECTION = BlockStateProperties.HORIZONTAL_FACING;
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    public HorizontalMantelBase(Properties properties) {
        super(properties);
    }


    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {

            return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
        }

        @Override
        public BlockState rotate(BlockState state, Rotation rot) {
            return state.with(FACING, rot.rotate(state.get(FACING)));
        }

    @Override
        public BlockState mirror(BlockState state, Mirror mirrorIn) {
            return state.rotate(mirrorIn.toRotation(state.get(FACING)));
        }

        @Override
        protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder){
            builder.add(FACING);
        }

}
