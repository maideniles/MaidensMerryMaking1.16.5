package com.maideniles.maidensmerrymaking.blocks;

import com.maideniles.maidensmerrymaking.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import java.util.Random;

public class PresentBlock extends Block {

    protected static final VoxelShape SHAPE = Block.makeCuboidShape(3.0D, 0.0D, 3.0D, 13.0D, 8.0D, 13.0D);


    public PresentBlock(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        return SHAPE;
    }

    @Override
    public void onBlockHarvested(World world, BlockPos pos, BlockState state, PlayerEntity player){
        Random rand = new Random();
        Integer gift_id = rand.nextInt(20);
        Integer gift_count = inclusiveBoundedRandom(rand,1,5);


    if (gift_id== 0){
        world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.NETHER_STAR,1)));

    }
    if(gift_id== 1){
        world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Item.getItemFromBlock(Blocks.LODESTONE),1)));

    }
    if(gift_id== 2){
        world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.HEART_OF_THE_SEA,1)));

        }
    if(gift_id== 3){
        world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(),  new ItemStack(Items.PRISMARINE_CRYSTALS,gift_count)));

        }
    if(gift_id== 4){
        world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(),  new ItemStack(Item.getItemFromBlock(Blocks.DIAMOND_BLOCK), 1)));

        }
    if(gift_id== 5){
        world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(),  new ItemStack(Items.MUSIC_DISC_PIGSTEP,1)));

        }
    if(gift_id== 6){
        world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(),  new ItemStack(Items.NETHERITE_INGOT,gift_count)));

        }
    if(gift_id== 7){
        world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(),  new ItemStack(Items.GOLDEN_APPLE,gift_count)));

        }
    if(gift_id== 8){
        world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.DIAMOND,gift_count)));

        }
    if(gift_id== 9){
        world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.GOLD_INGOT,gift_count)));

        }
    if(gift_id== 10){
        world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.EMERALD,gift_count)));

        }
    if(gift_id== 11){
        world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.IRON_INGOT,gift_count)));

        }
    if(gift_id== 12){
        world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Item.getItemFromBlock(Blocks.REDSTONE_BLOCK), gift_count)));

        }
    if(gift_id== 13){
        world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.LAPIS_LAZULI,gift_count)));

        }
    if(gift_id== 14){
        world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.HONEYCOMB,gift_count)));

        }
    if(gift_id== 15){
        world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.HONEY_BOTTLE,gift_count)));

        }
    if(gift_id== 16){
        world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.FRUITCAKE.get(),gift_count)));

        }
    if(gift_id== 17){
        world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.NAUTILUS_SHELL,gift_count)));

        }
    if(gift_id== 18){
        world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.TURTLE_EGG,gift_count)));

        }
    if(gift_id== 19){
        world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.ENDER_EYE,gift_count)));

    }

        if(gift_id== 20){
            world.addEntity(new ItemEntity((World) world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.BEE_NEST,gift_count)));

        }
        super.onBlockHarvested(world, pos, state, player);
    }

    private static int inclusiveBoundedRandom(Random random, int min, int max) {
        return min + random.nextInt(max-min);
    }
}
