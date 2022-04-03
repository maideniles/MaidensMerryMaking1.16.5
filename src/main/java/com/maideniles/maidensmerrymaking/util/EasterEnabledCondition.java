package com.maideniles.maidensmerrymaking.util;

import com.google.gson.JsonObject;
import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;

public class EasterEnabledCondition implements ICondition {

    @Override
    public ResourceLocation getID() {
        return MaidensMerryMaking.prefix("easter_enabled");
    }

    @Override
    public boolean test() {
        return MerryMakingConfig.EASTER_ENABLED.get(); //(because true is off and false is on)
    }

    public static class Serializer implements IConditionSerializer<EasterEnabledCondition> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void write(JsonObject json, EasterEnabledCondition value) { }

        @Override
        public EasterEnabledCondition read(JsonObject json) {
            return new EasterEnabledCondition();
        }

        @Override
        public ResourceLocation getID() {
            return MaidensMerryMaking.prefix("easter_enabled");
        }
    }
}
