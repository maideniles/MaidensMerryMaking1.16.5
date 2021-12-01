package com.maideniles.maidensmerrymaking.event;


import com.google.gson.JsonObject;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;
import java.util.List;


public class SpruceLeavesConverterModifier extends LootModifier {
    private final int numSeedsToConvert;
    private final Item itemToCheck;
    private final Item itemReward;
    public SpruceLeavesConverterModifier(ILootCondition[] conditionsIn, int numSeeds, Item itemCheck, Item reward) {
        super(conditionsIn);
        numSeedsToConvert = numSeeds;
        itemToCheck = itemCheck;
        itemReward = reward;
    }

    @Nonnull
    @Override
    public List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
        //
        // Additional conditions can be checked, though as much as possible should be parameterized via JSON data.
        // It is better to write a new ILootCondition implementation than to do things here.
        //
        int numSeeds = 0;
        for (ItemStack stack : generatedLoot) {
            if (stack.getItem() == itemToCheck)
                numSeeds += stack.getCount();
        }
        if (numSeeds >= numSeedsToConvert) {
            generatedLoot.removeIf(x -> x.getItem() == itemToCheck);
            generatedLoot.add(new ItemStack(itemReward, (numSeeds / numSeedsToConvert)));
            numSeeds = numSeeds % numSeedsToConvert;
            if (numSeeds > 0)
                generatedLoot.add(new ItemStack(itemToCheck, numSeeds));
        }
        return generatedLoot;
    }

    public static class Serializer extends GlobalLootModifierSerializer<SpruceLeavesConverterModifier> {

        @Override
        public SpruceLeavesConverterModifier read(ResourceLocation name, JsonObject object, ILootCondition[] conditionsIn) {
            int numSeeds = JSONUtils.getInt(object, "numSeeds");
            Item seed = ForgeRegistries.ITEMS.getValue(new ResourceLocation((JSONUtils.getString(object, "seedItem"))));
            Item wheat = ForgeRegistries.ITEMS.getValue(new ResourceLocation(JSONUtils.getString(object, "replacement")));
            return new SpruceLeavesConverterModifier(conditionsIn, numSeeds, seed, wheat);
        }

        @Override
        public JsonObject write(SpruceLeavesConverterModifier instance) {
            JsonObject json = makeConditions(instance.conditions);
            json.addProperty("numSeeds", instance.numSeedsToConvert);
            json.addProperty("seedItem", ForgeRegistries.ITEMS.getKey(instance.itemToCheck).toString());
            json.addProperty("replacement", ForgeRegistries.ITEMS.getKey(instance.itemReward).toString());
            return json;
        }
    }
}