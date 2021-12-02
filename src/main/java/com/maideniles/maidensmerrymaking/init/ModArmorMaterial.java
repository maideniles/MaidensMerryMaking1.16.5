package com.maideniles.maidensmerrymaking.init;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public enum ModArmorMaterial implements IArmorMaterial {

    RED_WOOL("red_wool", 25, new int[] {3, 6, 8, 3}, 10, Items.DIAMOND, "item.armor.equip_leather", 2.0f, 0.0f),
    GREEN_WOOL("green_wool", 25, new int[] {3, 6, 8, 3}, 10, Items.DIAMOND, "item.armor.equip_leather", 2.0f, 0.0f),
    RED_SANTA_HAT("red_santa_hat", 25, new int[] {3, 6, 8, 3}, 10, Items.DIAMOND, "item.armor.equip_leather", 2.0f, 0.0f),
    REINDEER_EARS("reindeerEars", 25, new int[] {3, 6, 8, 3}, 10, Items.DIAMOND, "item.armor.equip_leather", 2.0f, 0.0f);


    private static final int[] max_damage_array = new int[]{13, 15, 16, 11};
    private String name, equipSound;
    private int durability, enchantability;
    private Item repairItem;
    private int[] damageReductionAmounts;
    private float toughness;
    private float knockbackResistance;

    private ModArmorMaterial(String name, int durability, int[] damageReductionAmounts, int enchantability, Item repairItem, String equipSound, float toughness, float knockbackResistance)
    {
        this.name = name;
        this.equipSound = equipSound;
        this.durability = durability;
        this.enchantability = enchantability;
        this.repairItem = repairItem;
        this.damageReductionAmounts = damageReductionAmounts;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public String getName()
    {
        return MaidensMerryMaking.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness()
    {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance()
    {
        return this.knockbackResistance;
    }

    @Override
    public int getDurability(EquipmentSlotType slot)
    {
        return max_damage_array[slot.getIndex()] * this.durability;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slot)
    {
        return this.damageReductionAmounts[slot.getIndex()];
    }

    @Override
    public int getEnchantability()
    {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent()
    {
        return new SoundEvent(new ResourceLocation(equipSound));
    }

    @Override
    public Ingredient getRepairMaterial()
    {
        return Ingredient.fromItems(this.repairItem);
    }
}