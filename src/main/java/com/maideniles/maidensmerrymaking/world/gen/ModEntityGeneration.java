package com.maideniles.maidensmerrymaking.world.gen;

import com.maideniles.maidensmerrymaking.init.ModEntityTypes;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraftforge.common.world.MobSpawnInfoBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class ModEntityGeneration {
    public static void onEntitySpawn(final BiomeLoadingEvent event) {
        addEntityToAllBiomes(event.getSpawns(), ModEntityTypes.COLORED_CHICKEN.get(), 40, 2, 4);
        addEntityToAllBiomes(event.getSpawns(), ModEntityTypes.COLORED_BUNNY.get(), 40, 2, 4);
    }


    private static void addEntityToAllBiomes(MobSpawnInfoBuilder spawns, EntityType<?> type,
                                             int weight, int minCount, int maxCount) {
        List<MobSpawnInfo.Spawners> base = spawns.getSpawner(type.getClassification());
        base.add(new MobSpawnInfo.Spawners(type,weight, minCount, maxCount));
    }
}
