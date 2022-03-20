package com.maideniles.maidensmerrymaking.util;

import com.google.gson.JsonObject;
import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;

public class StPatricksDayEnabledCondition implements ICondition {

    @Override
    public ResourceLocation getID() {
        return MaidensMerryMaking.prefix("st_patricks_day_enabled");
    }

    @Override
    public boolean test() {
        return MerryMakingConfig.ST_PATRICKS_DAY_ENABLED.get(); //(because true is off and false is on)
    }

    public static class Serializer implements IConditionSerializer<StPatricksDayEnabledCondition> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void write(JsonObject json, StPatricksDayEnabledCondition value) { }

        @Override
        public StPatricksDayEnabledCondition read(JsonObject json) {
            return new StPatricksDayEnabledCondition();
        }

        @Override
        public ResourceLocation getID() {
            return MaidensMerryMaking.prefix("st_patricks_day_enabled");
        }
    }
}