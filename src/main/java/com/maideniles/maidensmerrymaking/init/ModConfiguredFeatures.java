package com.maideniles.maidensmerrymaking.init;

import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.ForestFlowerBlockStateProvider;
import net.minecraft.world.gen.blockstateprovider.PlainFlowerBlockStateProvider;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.blockstateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;


public class ModConfiguredFeatures {
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> CHRISTMAS_TREE_CONFIGURED_FEATURE = ModFeatures.CHRISTMAS_TREE_INSTANCE.withConfiguration(
            new BaseTreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Blocks.AIR.getDefaultState()), new SimpleBlockStateProvider(Blocks.AIR.getDefaultState()),
                    new BlobFoliagePlacer(FeatureSpread.create(1), FeatureSpread.create(1), 1),
                    new StraightTrunkPlacer(1, 1, 1),
                    new TwoLayerFeature(1, 1, 1)).setIgnoreVines().build());

    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> HOLLY_TREE_CONFIGURED_FEATURE = ModFeatures.HOLLY_TREE_INSTANCE.withConfiguration(
            new BaseTreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Blocks.AIR.getDefaultState()), new SimpleBlockStateProvider(Blocks.AIR.getDefaultState()),
                    new BlobFoliagePlacer(FeatureSpread.create(1), FeatureSpread.create(1), 1),
                    new StraightTrunkPlacer(1, 1, 1),
                    new TwoLayerFeature(1, 1, 1)).setIgnoreVines().build());

    public static final ConfiguredFeature<?, ?> CLOVER_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.CLOVER.get().getDefaultState()),
                    SimpleBlockPlacer.PLACER)).tries(12).build())
            .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).count(3);


    public static final ConfiguredFeature<BlockClusterFeatureConfig, ?> EASTER_EGG_CONFIG = (ConfiguredFeature<BlockClusterFeatureConfig, ?>) ModFeatures.EASTER_EGG_INSTANCE.withConfiguration((
           new BlockClusterFeatureConfig.Builder((
            new WeightedBlockStateProvider())
            .addWeightedBlockstate(ModBlocks.BLUE_MULTI_DOTS_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.BLUE_PURPLE_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.BLUE_PURPLE_FADE_EASTER_EGG_GEN_BLOCK.get().getDefaultState(),1)
            .addWeightedBlockstate(ModBlocks.BLUE_PURPLE_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.BLUE_WHITE_FLOWERS_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.BLUE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.CYAN_BLUE_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.CYAN_BLUE_FADE_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.CYAN_BLUE_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.CYAN_MULTI_DOTS_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.CYAN_MONOCHROME_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.CYAN_PURPLE_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.CYAN_PURPLE_FADE_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.CYAN_PURPLE_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.CYAN_WHITE_FLOWERS_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.PINK_BLUE_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.PINK_BLUE_FADE_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.PINK_BLUE_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.PINK_CYAN_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.PINK_CYAN_FADE_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.PINK_CYAN_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.PINK_MONOCHROME_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.PINK_MULTI_DOTS_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.PINK_PURPLE_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.PINK_PURPLE_FADE_EASTER_EGG_GEN_BLOCK.get().getDefaultState(),1)
            .addWeightedBlockstate(ModBlocks.PINK_PURPLE_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.PINK_WHITE_FLOWERS_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.PURPLE_DOTS_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.PURPLE_PINK_FLOWER_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.PURPLE_STRIPES_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.RAINBOW_DOTS_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.RAINBOW_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.RAINBOW_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.YELLOW_BLUE_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.YELLOW_BLUE_FADE_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.YELLOW_BLUE_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.YELLOW_MONOCHROME_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.YELLOW_PINK_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.YELLOW_PINK_FADE_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.YELLOW_PINK_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.YELLOW_WHITE_FLOWERS_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1)
            .addWeightedBlockstate(ModBlocks.YELLOW_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().getDefaultState(), 1),
                   SimpleBlockPlacer.PLACER)).tries(1).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.05F, 1)));



    // BEGIN EASTER EGGS CONFIG//
  /*  public static final ConfiguredFeature<?, ?> BLUE_MULTI_DOTS_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.BLUE_MULTI_DOTS_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> BLUE_PURPLE_FADE_DOTS_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.BLUE_PURPLE_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> BLUE_PURPLE_FADE_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.BLUE_PURPLE_FADE_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> BLUE_PURPLE_FADE_ZIGZAG_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.BLUE_PURPLE_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> BLUE_WHITE_FLOWERS_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.BLUE_WHITE_FLOWERS_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> BLUE_ZIGZAG_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.BLUE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get()
            .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> CYAN_BLUE_FADE_DOTS_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.CYAN_BLUE_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> CYAN_BLUE_FADE_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.CYAN_BLUE_FADE_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> CYAN_BLUE_FADE_ZIGZAG_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.CYAN_BLUE_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> CYAN_MULTI_DOTS_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks. CYAN_MULTI_DOTS_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> CYAN_MONOCHROME_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.CYAN_MONOCHROME_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> CYAN_PURPLE_FADE_DOTS_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.CYAN_PURPLE_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> CYAN_PURPLE_FADE_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.CYAN_PURPLE_FADE_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> CYAN_PURPLE_FADE_ZIGZAG_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.CYAN_PURPLE_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> CYAN_WHITE_FLOWERS_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.CYAN_WHITE_FLOWERS_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> PINK_BLUE_FADE_DOTS_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.PINK_BLUE_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> PINK_BLUE_FADE_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.PINK_BLUE_FADE_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> PINK_BLUE_FADE_ZIGZAG_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.PINK_BLUE_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> PINK_CYAN_FADE_DOTS_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.PINK_CYAN_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> PINK_CYAN_FADE_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.PINK_CYAN_FADE_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> PINK_CYAN_FADE_ZIGZAG_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.PINK_CYAN_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> PINK_MONOCHROME_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.PINK_MONOCHROME_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> PINK_MULTI_DOTS_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.PINK_MULTI_DOTS_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> PINK_PURPLE_FADE_DOTS_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.PINK_PURPLE_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> PINK_PURPLE_FADE_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.PINK_PURPLE_FADE_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> PINK_PURPLE_FADE_ZIGZAG_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.PINK_PURPLE_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> PINK_WHITE_FLOWERS_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.PINK_WHITE_FLOWERS_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> PURPLE_DOTS_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.PURPLE_DOTS_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> PURPLE_PINK_FLOWER_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.PURPLE_PINK_FLOWER_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> PURPLE_STRIPES_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.PURPLE_STRIPES_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> RAINBOW_DOTS_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.RAINBOW_DOTS_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> RAINBOW_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.RAINBOW_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> RAINBOW_ZIGZAG_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.RAINBOW_ZIGZAG_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> YELLOW_BLUE_FADE_DOTS_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.YELLOW_BLUE_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> YELLOW_BLUE_FADE_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.YELLOW_BLUE_FADE_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> YELLOW_BLUE_FADE_ZIGZAG_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.YELLOW_BLUE_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> YELLOW_MONOCHROME_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.YELLOW_MONOCHROME_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> YELLOW_PINK_FADE_DOTS_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.YELLOW_PINK_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> YELLOW_PINK_FADE_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.YELLOW_PINK_FADE_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> YELLOW_PINK_FADE_ZIGZAG_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.YELLOW_PINK_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> YELLOW_WHITE_FLOWERS_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.YELLOW_WHITE_FLOWERS_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));

    public static final ConfiguredFeature<?, ?> YELLOW_ZIGZAG_EASTER_EGG_BLOCK_CONFIG = Feature.RANDOM_PATCH.withConfiguration((
            new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.YELLOW_ZIGZAG_EASTER_EGG_GEN_BLOCK.get()
                    .getDefaultState()),SimpleBlockPlacer.PLACER)).xSpread(0).ySpread(0).zSpread(0).build()).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.03F, 1)));
*/
// END EASTER EGGS CONFIG//











    private static <C extends IFeatureConfig, F extends Feature<C>> F register(String key, F value) {
        return Registry.register(Registry.FEATURE, key, value);
    }

    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String key,
                                                                                 ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, key, configuredFeature);
    }
}
