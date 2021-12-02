package com.maideniles.maidensmerrymaking.items.armor;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.init.ModArmorMaterial;
import com.maideniles.maidensmerrymaking.init.ModItemGroups;
import com.maideniles.maidensmerrymaking.items.armor.model.RedChristmasArmorModel;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.UUID;

public class RedChristmasArmorItem extends ArmorItem {
    private static final UUID[] ARMOR_MODIFIERS = new UUID[]{UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"), UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"), UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"), UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")};
    private static final int[][] DAMAGE_REDUCTION_ARRAY = new int[][] {{1, 2, 3, 1}};


    public RedChristmasArmorItem(IArmorMaterial materialIn, EquipmentSlotType slot, Properties group) {
        super(materialIn, slot, new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP));
    }

    @Nullable
    @Override
    @OnlyIn(Dist.CLIENT)
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {

            return MaidensMerryMaking.MOD_ID + ":textures/models/armor/red_santa_hat.png";


    }

    @Nullable
    @Override
    @OnlyIn(Dist.CLIENT)
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {

            return (A) new RedChristmasArmorModel();

    }
}