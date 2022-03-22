package com.maideniles.maidensmerrymaking.init;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.entity.custom.ColoredBunnyEntity;
import com.maideniles.maidensmerrymaking.entity.custom.ColoredChickenEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, MaidensMerryMaking.MOD_ID);

    public static final RegistryObject<EntityType<ColoredChickenEntity>> COLORED_CHICKEN =
            ENTITY_TYPES.register("colored_chicken",
                    () -> EntityType.Builder.create(ColoredChickenEntity::new,
                            EntityClassification.CREATURE).size(0.4F, 0.7F).trackingRange(10)
                            .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "colored_chicken").toString()));

    public static final RegistryObject<EntityType<ColoredBunnyEntity>> COLORED_BUNNY =
            ENTITY_TYPES.register("colored_bunny",
                    () -> EntityType.Builder.create(ColoredBunnyEntity::new,
                            EntityClassification.CREATURE).size(1f, 3f)
                            .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "colored_bunny").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}