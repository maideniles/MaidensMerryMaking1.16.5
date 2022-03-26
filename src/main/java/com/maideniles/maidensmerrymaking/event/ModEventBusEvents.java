package com.maideniles.maidensmerrymaking.event;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.entity.custom.ColoredBunnyEntity;
import com.maideniles.maidensmerrymaking.entity.custom.ColoredChickenEntity;
import com.maideniles.maidensmerrymaking.init.ModEntityTypes;
import com.maideniles.maidensmerrymaking.items.ModSpawnEggItem;
import net.minecraft.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MaidensMerryMaking.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.COLORED_CHICKEN.get(), ColoredChickenEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.PINK_BUNNY.get(), ColoredBunnyEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.PURPLE_BUNNY.get(), ColoredBunnyEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.BLUE_BUNNY.get(), ColoredBunnyEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.CYAN_BUNNY.get(), ColoredBunnyEntity.setCustomAttributes().create());
        event.put(ModEntityTypes.YELLOW_BUNNY.get(), ColoredBunnyEntity.setCustomAttributes().create());

    }

    @SubscribeEvent
    public static void onRegisterEntities(RegistryEvent.Register<EntityType<?>> event) {
        ModSpawnEggItem.initSpawnEggs();
    }
}