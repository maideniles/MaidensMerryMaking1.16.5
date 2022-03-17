package com.maideniles.maidensmerrymaking.world.feature.flower;

import com.maideniles.maidensmerrymaking.init.ModBlocks;
import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.Feature;

import java.util.Random;

public class CloverGen extends Feature<BaseTreeFeatureConfig> {





    public CloverGen(Codec<BaseTreeFeatureConfig> configFactory) {
        super(configFactory);

    }




    public boolean generate(ISeedReader world, ChunkGenerator generator, Random rand, BlockPos position, BaseTreeFeatureConfig config)  {
        int k = 0;
        int i = 0;
        int j = 0;



        if(Feature.isDirtAt(world, position.down()))  {
            this.setBlockState(world, position.add(i + 0, j + 0, k + 0),
                    ModBlocks.TREE.get().getDefaultState());
            this.setBlockState(world, position.add(i + 0, j + 1, k + 0),
                    ModBlocks.TREE_MIDDLE.get().getDefaultState());
            this.setBlockState(world, position.add(i + 0, j + 2, k + 0),
                    ModBlocks.TREE_TOP.get().getDefaultState());
        }
        return true;
    }


}
