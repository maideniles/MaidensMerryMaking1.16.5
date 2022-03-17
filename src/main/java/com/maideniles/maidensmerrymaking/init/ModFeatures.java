package com.maideniles.maidensmerrymaking.init;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.world.feature.tree.ChristmasSpruce;
import com.maideniles.maidensmerrymaking.world.feature.tree.HollyTreeGen;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModFeatures {
    public static final DeferredRegister<Feature<?>> FEATURES
            = DeferredRegister.create(ForgeRegistries.FEATURES, MaidensMerryMaking.MOD_ID);

    static final Feature<BaseTreeFeatureConfig> CHRISTMAS_TREE_INSTANCE = new ChristmasSpruce(BaseTreeFeatureConfig.CODEC);
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> CHRISTMAS_TREE = FEATURES.register("christmas_tree", () -> CHRISTMAS_TREE_INSTANCE);




    static final Feature<BaseTreeFeatureConfig> HOLLY_TREE_INSTANCE = new HollyTreeGen(BaseTreeFeatureConfig.CODEC);
    public static final RegistryObject<Feature<BaseTreeFeatureConfig>> HOLLY_TREE = FEATURES.register("holly_tree", () -> HOLLY_TREE_INSTANCE);

    public static void register(IEventBus eventBus) {
        FEATURES.register(eventBus);
    }
}
