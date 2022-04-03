package com.maideniles.maidensmerrymaking.advancements;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.init.ModAdvancements;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.player.AdvancementEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.core.jmx.Server;

@Mod.EventBusSubscriber(modid = MaidensMerryMaking.MOD_ID)
public class EggstraordinaireAdvancementCheckEvent {

    @SubscribeEvent
    public static void checkAdvancementsEvent(AdvancementEvent event) {

        PlayerEntity player = event.getPlayer();

        if(player instanceof ServerPlayerEntity){
            ModAdvancements.EGGSTRAORDINAIRE.trigger((ServerPlayerEntity) player, event.getAdvancement());
        }
    }





}
