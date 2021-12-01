package com.maideniles.maidensmerrymaking.world.feature.tree;

import com.maideniles.maidensmerrymaking.init.ModBlocks;
import com.mojang.serialization.Codec;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.Feature;

import java.util.Random;


public class HollyTreeGen extends Feature<BaseTreeFeatureConfig> {





        public HollyTreeGen(Codec<BaseTreeFeatureConfig> configFactory) {
            super(configFactory);

        }
    public boolean generate(ISeedReader world, ChunkGenerator generator, Random rand, BlockPos position, BaseTreeFeatureConfig config){
        int k = 0;
        int i = 0;
        int j = 0;



        if(Feature.isDirtAt(world, position.down())) {
          //PLACE TRUNK//
            this.setBlockState(world, position.add(i + 0, j + 0, k + 0),
                    Blocks.SPRUCE_LOG.getDefaultState());
            this.setBlockState(world, position.add(i + 0, j + 1, k + 0),
                    Blocks.SPRUCE_LOG.getDefaultState());
            this.setBlockState(world, position.add(i + 0, j + 2, k + 0),
                    Blocks.SPRUCE_LOG.getDefaultState());
            this.setBlockState(world, position.add(i + 0, j + 3, k + 0),
                    Blocks.SPRUCE_LOG.getDefaultState());
            this.setBlockState(world, position.add(i + 0, j + 4, k + 0),
                    Blocks.SPRUCE_LOG.getDefaultState());
            this.setBlockState(world, position.add(i + 0, j + 5, k + 0),
                    Blocks.SPRUCE_LOG.getDefaultState());
            this.setBlockState(world, position.add(i + 0, j + 6, k + 0),
                    Blocks.SPRUCE_LOG.getDefaultState());
          //PLACE FIRST LAYER LEAVES//

//ROW 1//
            this.setBlockState(world, position.add(i - 1, j + 1, k - 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 0, j + 1, k - 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 1, j + 1, k - 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
//ROW 2//
            this.setBlockState(world, position.add(i - 2, j + 1, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i - 1, j + 1, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 0, j + 1, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 1, j + 1, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 2, j + 1, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());


//ROW3//
            this.setBlockState(world, position.add(i - 2, j + 1, k +0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i - 1, j + 1, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 1, j + 1, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 2, j + 1, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());


     //ROW 4//
            this.setBlockState(world, position.add(i - 2, j + 1, k +1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i - 1, j + 1, k +1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 0, j + 1, k + 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 1, j + 1, k + 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 2, j + 1, k + 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());

    //ROW 5//
            this.setBlockState(world, position.add(i - 1, j + 1, k + 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 0, j + 1, k + 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 1, j + 1, k + 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());


//PLACE SECOND LAYER LEAVES//

            //ROW 1//
            this.setBlockState(world, position.add(i - 1, j + 2, k - 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 0, j + 2, k - 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 1, j + 2, k - 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
//ROW 2//
            this.setBlockState(world, position.add(i - 2, j + 2, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());

            this.setBlockState(world, position.add(i - 1, j + 2, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 0, j + 2, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 1, j + 2, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 2, j + 2, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());


//ROW3//
            this.setBlockState(world, position.add(i - 2, j + 2, k +0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i - 1, j + 2, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 1, j + 2, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 2, j + 2, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());


            //ROW 4//
            this.setBlockState(world, position.add(i - 2, j + 2, k +1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i - 1, j + 2, k +1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 0, j + 2, k + 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 1, j + 2, k + 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 2, j + 2, k + 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());

            //ROW 5//
            this.setBlockState(world, position.add(i - 1, j + 2, k + 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 0, j + 2, k + 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 1, j + 2, k + 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());

 //PLACE THIRD LAYER LEAVES//

            //ROW 1//

            this.setBlockState(world, position.add(i + 0, j + 3, k - 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());

//ROW 2//


            this.setBlockState(world, position.add(i - 1, j + 3, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 0, j + 3, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 1, j + 3, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());



//ROW3//
            this.setBlockState(world, position.add(i - 2, j + 3, k +0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i - 1, j + 3, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 1, j + 3, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 2, j + 3, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());


            //ROW 4//

            this.setBlockState(world, position.add(i - 1, j + 3, k +1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 0, j + 3, k + 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 1, j + 3, k + 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());


            //ROW 5//

            this.setBlockState(world, position.add(i + 0, j + 3, k + 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());


  //PLACE FOURTH ROW LEAVES//

            //ROW 1//

            this.setBlockState(world, position.add(i + 0, j + 4, k - 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());

//ROW 2//


            this.setBlockState(world, position.add(i - 1, j + 4, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 0, j + 4, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 1, j + 4, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());



//ROW3//
            this.setBlockState(world, position.add(i - 2, j + 4, k +0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i - 1, j + 4, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 1, j + 4, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 2, j + 4, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());


            //ROW 4//

            this.setBlockState(world, position.add(i - 1, j + 4, k +1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 0, j + 4, k + 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 1, j + 4, k + 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());


            //ROW 5//

            this.setBlockState(world, position.add(i + 0, j + 4, k + 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());

//PLACE FIFTH ROW LEAVES//
//ROW 1//
            this.setBlockState(world, position.add(i - 1, j + 5, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 0, j + 5, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 1, j + 5, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
//ROW 2//
            this.setBlockState(world, position.add(i - 1, j + 5, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 1, j + 5, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
//ROW 3//
            this.setBlockState(world, position.add(i - 1, j + 5, k +1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 0, j + 5, k + 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 1, j + 5, k + 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());

 //PLACE SIXTH ROW LEAVES//
            this.setBlockState(world, position.add(i - 1, j + 6, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 1, j + 6, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 0, j + 6, k + 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());
            this.setBlockState(world, position.add(i + 0, j + 6, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());

 //PLACE TOP LEAVES//
            this.setBlockState(world, position.add(i + 0, j + 7, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().getDefaultState());

        }
        return true;
    }


}
