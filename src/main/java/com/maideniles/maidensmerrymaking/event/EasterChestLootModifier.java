package com.maideniles.maidensmerrymaking.event;




import com.google.gson.JsonObject;
import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.util.MerryMakingConfig;
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
public class EasterChestLootModifier extends LootModifier {
    private final Item addition;

    protected EasterChestLootModifier(ILootCondition[] conditionsIn, Item addition) {
        super(conditionsIn);
        this.addition = addition;
    }

    @Nonnull
    @Override
    protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
        // generatedLoot is the loot that would be dropped, if we wouldn't add or replace
        // anything!
        if(context.getRandom().nextFloat() > 0.15) {
            generatedLoot.add(new ItemStack(addition, MerryMakingConfig.EASTER_BASKET_CHEST_SPAWN.get()));
        }
        return generatedLoot;
    }
    @SubscribeEvent
    public static void registerModifiers(RegistryEvent.Register<GlobalLootModifierSerializer<?>> registryEvent) {
        registryEvent.getRegistry().register(new Serializer().setRegistryName(MaidensMerryMaking.MOD_ID, "easter_chest_loot"));
    }

    public static class Serializer extends GlobalLootModifierSerializer<EasterChestLootModifier> {

        @Override
        public EasterChestLootModifier read(ResourceLocation name, JsonObject object, ILootCondition[] conditionsIn) {
            Item addition = ForgeRegistries.ITEMS.getValue(
                    new ResourceLocation(JSONUtils.getString(object, "addition")));
            return new EasterChestLootModifier(conditionsIn, addition);
        }

        @Override
        public JsonObject write(EasterChestLootModifier instance) {
            JsonObject json = makeConditions(instance.conditions);
            json.addProperty("addition", ForgeRegistries.ITEMS.getKey(instance.addition).toString());
            return json;
        }
    }
}

