package com.maideniles.maidensmerrymaking.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.ValidationTracker;
import net.minecraft.util.ResourceLocation;

import java.util.Map;

public class ModLootTableProvider extends LootTableProvider {
//    private final List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>>
    //        loot_tables = ImmutableList.of(Pair.of(ModBlockLootTables::new, LootParameterSets.BLOCK));

    public ModLootTableProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

 /*   @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables() {
        return this.loot_tables;
    }
*/
    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {

    }
}
