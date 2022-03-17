package com.maideniles.maidensmerrymaking.util;

import com.google.gson.JsonObject;
import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;

public class ChristmasEnabledCondition implements ICondition {

    @Override
    public ResourceLocation getID() {
        return MaidensMerryMaking.prefix("christmas_enabled");
    }

    @Override
    public boolean test() {
        return MerryMakingConfig.CHRISTMAS_ENABLED.get(); //(because true is off and false is on)
    }

    public static class Serializer implements IConditionSerializer<ChristmasEnabledCondition> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void write(JsonObject json, ChristmasEnabledCondition value) { }

        @Override
        public ChristmasEnabledCondition read(JsonObject json) {
            return new ChristmasEnabledCondition();
        }

        @Override
        public ResourceLocation getID() {
            return MaidensMerryMaking.prefix("christmas_enabled");
        }
    }
}