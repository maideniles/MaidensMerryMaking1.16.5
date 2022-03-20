package com.maideniles.maidensmerrymaking.world.gen;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.init.ModStructures;
import com.maideniles.maidensmerrymaking.util.MerryMakingConfig;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.StructureFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = MaidensMerryMaking.MOD_ID)
public class ModStructureGeneration {
    public static void generateStructures(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.PLAINS)) {
            List<Supplier<StructureFeature<?, ?>>> structures = event.getGeneration().getStructures();

            if (MerryMakingConfig.ST_PATRICKS_DAY_ENABLED.get() == Boolean.TRUE) {
            structures.add(() -> ModStructures.POT_OF_GOLD.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
           System.out.println("Added POT 'O GOLD!");}
        }
    }
}
