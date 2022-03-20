package com.maideniles.maidensmerrymaking.world.gen;

import com.maideniles.maidensmerrymaking.init.ModBlocks;
import com.mojang.serialization.Codec;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.Feature;

import java.util.Random;

public class EasterEggGen extends Feature<BaseTreeFeatureConfig> {





    public EasterEggGen(Codec<BaseTreeFeatureConfig> configFactory) {
        super(configFactory);

    }




    public boolean generate(ISeedReader world, ChunkGenerator generator, Random rand, BlockPos position, BaseTreeFeatureConfig config)  {
        int k = 0;
        int i = 0;
        int j = 0;



        if(Feature.isDirtAt(world, position.down()) || world.getBlockState(position.down()).getBlock().isIn(BlockTags.VALID_SPAWN))  {

            this.setBlockState(world, position.add(i + 0, j + 0, k + 0),
                    ModBlocks.TREE.get().getDefaultState());

        }
        return true;
    }


}
