package com.maideniles.maidensmerrymaking.event;


import com.google.gson.JsonObject;
import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;
import java.util.List;

@Mod.EventBusSubscriber(modid = MaidensMerryMaking.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ChestLootModifier extends LootModifier {
    private final Item addition;

    protected ChestLootModifier(ILootCondition[] conditionsIn, Item addition) {
        super(conditionsIn);
        this.addition = addition;
    }

    @Nonnull
    @Override
    protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
        // generatedLoot is the loot that would be dropped, if we wouldn't add or replace
        // anything!
        if(context.getRandom().nextFloat() > 0.15) {
            generatedLoot.add(new ItemStack(addition, 1));
        }
        return generatedLoot;
    }
    @SubscribeEvent
    public static void registerModifiers(RegistryEvent.Register<GlobalLootModifierSerializer<?>> registryEvent) {
        registryEvent.getRegistry().register(new Serializer().setRegistryName(MaidensMerryMaking.MOD_ID, "chest_loot"));
    }

    public static class Serializer extends GlobalLootModifierSerializer<ChestLootModifier> {

        @Override
        public ChestLootModifier read(ResourceLocation name, JsonObject object, ILootCondition[] conditionsIn) {
            Item addition = ForgeRegistries.ITEMS.getValue(
                    new ResourceLocation(JSONUtils.getString(object, "addition")));
            return new ChestLootModifier(conditionsIn, addition);
        }

        @Override
        public JsonObject write(ChestLootModifier instance) {
            JsonObject json = makeConditions(instance.conditions);
            json.addProperty("addition", ForgeRegistries.ITEMS.getKey(instance.addition).toString());
            return json;
        }
    }
}
