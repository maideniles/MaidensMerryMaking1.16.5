package com.maideniles.maidensmerrymaking.init;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.util.MerryMakingConfig;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = MaidensMerryMaking.MOD_ID)
public class ModWorldGen {


    public static void generateTrees(final BiomeLoadingEvent event) {
        RegistryKey<Biome> key = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);


        if (types.contains(BiomeDictionary.Type.SNOWY)) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            base.add(() -> ModConfiguredFeatures.CHRISTMAS_TREE_CONFIGURED_FEATURE
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(
                            new AtSurfaceWithExtraConfig(0, 0.1f, 1))));

            base.add(() -> ModConfiguredFeatures.HOLLY_TREE_CONFIGURED_FEATURE
                    .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT)
                    .withPlacement(Placement.COUNT_EXTRA.configure(
                            new AtSurfaceWithExtraConfig(0, 0.1f, 1))));

        }

        if (types.contains(BiomeDictionary.Type.PLAINS)) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            if (MerryMakingConfig.ST_PATRICKS_DAY_ENABLED.get() == Boolean.TRUE) {
                base.add(() -> ModConfiguredFeatures.CLOVER_CONFIG);

            }
        }

        if (types.contains(BiomeDictionary.Type.JUNGLE) || types.contains(BiomeDictionary.Type.CONIFEROUS)) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            if (MerryMakingConfig.EASTER_LILY_ENABLED.get() == Boolean.TRUE) {
                base.add(() -> ModConfiguredFeatures.EASTER_LILY_CONFIG);

            }
        }

        if (types.contains(BiomeDictionary.Type.FOREST) || types.contains(BiomeDictionary.Type.MOUNTAIN) || types.contains(BiomeDictionary.Type.HILLS)) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            if (MerryMakingConfig.HYDRANGEA_ENABLED.get() == Boolean.TRUE) {
                base.add(() -> ModConfiguredFeatures.HYDRANGEA_CONFIG);

            }
        }

        if (types.contains(BiomeDictionary.Type.SWAMP) || types.contains(BiomeDictionary.Type.PLAINS) || types.contains(BiomeDictionary.Type.PLATEAU) || types.contains(BiomeDictionary.Type.RIVER)) {
            List<Supplier<ConfiguredFeature<?, ?>>> base =
                    event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            if (MerryMakingConfig.HYACINTH_ENABLED.get() == Boolean.TRUE) {
                base.add(() -> ModConfiguredFeatures.HYACINTH_CONFIG);

            }
        }



        // BEGIN ADDING EASTER EGGS TO WORLDGEN//
        if (types.contains(BiomeDictionary.Type.MESA) || types.contains(BiomeDictionary.Type.FOREST) || types.contains(BiomeDictionary.Type.PLAINS)
        || types.contains(BiomeDictionary.Type.MOUNTAIN) || types.contains(BiomeDictionary.Type.HILLS) || types.contains(BiomeDictionary.Type.SWAMP)
         ||types.contains(BiomeDictionary.Type.SANDY) || types.contains(BiomeDictionary.Type.SNOWY) || types.contains(BiomeDictionary.Type.WASTELAND)
        || types.contains(BiomeDictionary.Type.BEACH)) {
            List<Supplier<ConfiguredFeature<?, ?>>> base = event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) {
                base.add(() -> ModConfiguredFeatures.EASTER_EGG_CONFIG);
                System.out.println("EASTER EGG HIDDEN!!");
            }
        }
       /*  if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) {
             base.add(() -> ModConfiguredFeatures.BLUE_MULTI_DOTS_EASTER_EGG_BLOCK_CONFIG);
                System.out.println("EASTER EGG HIDDEN!!");
         }

         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) {
             base.add(() -> ModConfiguredFeatures.BLUE_PURPLE_FADE_DOTS_EASTER_EGG_BLOCK_CONFIG);
                System.out.println("EASTER EGG HIDDEN!!");
         }

         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) {
             base.add(() -> ModConfiguredFeatures.BLUE_PURPLE_FADE_EASTER_EGG_BLOCK_CONFIG);
                System.out.println("EASTER EGG HIDDEN!!");
         }
         /*
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.BLUE_PURPLE_FADE_ZIGZAG_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.BLUE_WHITE_FLOWERS_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.BLUE_ZIGZAG_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.CYAN_BLUE_FADE_DOTS_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.CYAN_BLUE_FADE_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.CYAN_BLUE_FADE_ZIGZAG_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.CYAN_MULTI_DOTS_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.CYAN_MONOCHROME_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.CYAN_PURPLE_FADE_DOTS_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.CYAN_PURPLE_FADE_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.CYAN_PURPLE_FADE_ZIGZAG_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.CYAN_WHITE_FLOWERS_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.PINK_BLUE_FADE_DOTS_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.PINK_BLUE_FADE_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.PINK_BLUE_FADE_ZIGZAG_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.PINK_CYAN_FADE_DOTS_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.PINK_CYAN_FADE_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.PINK_CYAN_FADE_ZIGZAG_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.PINK_MONOCHROME_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.PINK_MULTI_DOTS_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.PINK_PURPLE_FADE_DOTS_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.PINK_PURPLE_FADE_EASTER_EGG_BLOCK_CONFIG);}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.PINK_PURPLE_FADE_ZIGZAG_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.PINK_WHITE_FLOWERS_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.PURPLE_DOTS_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.PURPLE_PINK_FLOWER_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.PURPLE_STRIPES_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.RAINBOW_DOTS_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.RAINBOW_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.RAINBOW_ZIGZAG_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.YELLOW_BLUE_FADE_DOTS_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.YELLOW_BLUE_FADE_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.YELLOW_BLUE_FADE_ZIGZAG_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.YELLOW_MONOCHROME_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.YELLOW_PINK_FADE_DOTS_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.YELLOW_PINK_FADE_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.YELLOW_PINK_FADE_ZIGZAG_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.YELLOW_WHITE_FLOWERS_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
         if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) { base.add(() -> ModConfiguredFeatures.YELLOW_ZIGZAG_EASTER_EGG_BLOCK_CONFIG);System.out.println("EASTER EGG HIDDEN!!");}
*/

    }
}
