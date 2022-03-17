package com.maideniles.maidensmerrymaking.advancements;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonObject;
import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import net.minecraft.advancements.ICriterionTrigger;
import net.minecraft.advancements.PlayerAdvancements;
import net.minecraft.advancements.criterion.CriterionInstance;
import net.minecraft.advancements.criterion.EntityPredicate;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.loot.ConditionArrayParser;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.core.jmx.Server;

import java.util.Map;
import java.util.Set;

public class GreenBeerDrunkTrigger implements ICriterionTrigger<GreenBeerDrunkTrigger.Instance> {

    public static final ResourceLocation ID = MaidensMerryMaking.prefix("drunk_on_green_beer");
    private final Map<PlayerAdvancements, GreenBeerDrunkTrigger.Listeners> listeners = Maps.newHashMap();
    private ServerPlayerEntity player ;

    @Override
    public ResourceLocation getId() {
        return ID;
    }

    @Override
    public void addListener(PlayerAdvancements playerAdvancementsIn, Listener<GreenBeerDrunkTrigger.Instance> listener) {
        GreenBeerDrunkTrigger.Listeners listeners = this.listeners.computeIfAbsent(playerAdvancementsIn, Listeners::new);
        listeners.add(listener);
    }

    @Override
    public void removeListener(PlayerAdvancements playerAdvancementsIn, Listener<GreenBeerDrunkTrigger.Instance> listener) {
        GreenBeerDrunkTrigger.Listeners listeners = this.listeners.get(playerAdvancementsIn);
        if (listeners != null) {
            listeners.remove(listener);
            if (listeners.isEmpty()) {
                this.listeners.remove(playerAdvancementsIn);
            }
        }
    }

    @Override
    public void removeAllListeners(PlayerAdvancements playerAdvancementsIn) {
        this.listeners.remove(playerAdvancementsIn);
    }

    @Override
    public Instance deserialize(JsonObject json, ConditionArrayParser condition) {
        EntityPredicate.AndPredicate player = EntityPredicate.AndPredicate.deserializeJSONObject(json, "player", condition);
        return new GreenBeerDrunkTrigger.Instance(player);
    }

    public void trigger(ServerPlayerEntity player) {
        GreenBeerDrunkTrigger.Listeners listeners = this.listeners.get(player.getAdvancements());
        if (listeners != null) {
            listeners.trigger();
        }
    }

    public static class Instance extends CriterionInstance {
        public Instance(EntityPredicate.AndPredicate player) {
            super(GreenBeerDrunkTrigger.ID, player);
        }
    }

    static class Listeners {

        private final PlayerAdvancements playerAdvancements;
        private final Set<Listener<GreenBeerDrunkTrigger.Instance>> listeners = Sets.newHashSet();

        public Listeners(PlayerAdvancements playerAdvancementsIn) {
            this.playerAdvancements = playerAdvancementsIn;
        }

        public boolean isEmpty() {
            return this.listeners.isEmpty();
        }

        public void add(Listener<GreenBeerDrunkTrigger.Instance> listener) {
            this.listeners.add(listener);
        }

        public void remove(Listener<GreenBeerDrunkTrigger.Instance> listener) {
            this.listeners.remove(listener);
        }

        public void trigger() {
            for (Listener<GreenBeerDrunkTrigger.Instance> listener : Lists.newArrayList(this.listeners)) {
                listener.grantCriterion(this.playerAdvancements);
            }
        }
    }
}