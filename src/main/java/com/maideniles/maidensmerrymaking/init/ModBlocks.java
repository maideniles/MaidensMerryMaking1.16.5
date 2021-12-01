package com.maideniles.maidensmerrymaking.init;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.blocks.*;
import com.maideniles.maidensmerrymaking.blocks.crop.*;
import com.maideniles.maidensmerrymaking.blocks.deco.*;
import com.maideniles.maidensmerrymaking.blocks.deco.lights.*;
import com.maideniles.maidensmerrymaking.blocks.fireplace.logs.Fireplace;
import com.maideniles.maidensmerrymaking.blocks.fireplace.logs.FireplaceLogsOn;
import com.maideniles.maidensmerrymaking.blocks.fireplace.mantel.base.*;
import com.maideniles.maidensmerrymaking.blocks.fireplace.mantel.woods.*;
import com.maideniles.maidensmerrymaking.blocks.lamppost.LampPost;
import com.maideniles.maidensmerrymaking.blocks.lamppost.LampPostBottom;
import com.maideniles.maidensmerrymaking.blocks.lamppost.LampPostOn;
import com.maideniles.maidensmerrymaking.blocks.lamppost.LampPostPole;
import com.maideniles.maidensmerrymaking.blocks.tree.*;
import com.maideniles.maidensmerrymaking.blocks.tree.decorated.DecoratedTreeBottomBlock;
import com.maideniles.maidensmerrymaking.blocks.tree.decorated.DecoratedTreeMiddleBlock;
import com.maideniles.maidensmerrymaking.blocks.tree.decorated.DecoratedTreeTopBlock;
import com.maideniles.maidensmerrymaking.blocks.tree.lights.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, MaidensMerryMaking.MOD_ID);


    public static final RegistryObject<Block> MINT_PLANT = BLOCKS.register("mint_plant",
            () -> new MintPlant(AbstractBlock.Properties.from(Blocks.WHEAT)));

    public static final RegistryObject<Block> CORN_STALK = BLOCKS.register("corn_stalk",
            () -> new CornStalkBlock(Block.Properties.from(Blocks.WHEAT)));

    public static final RegistryObject<Block> GINGER_PLANT = BLOCKS.register("ginger_plant",
            () -> new GingerPlant(Block.Properties.from(Blocks.WHEAT)));

    public static final RegistryObject<Block> SWEET_POTATO_PLANT = BLOCKS.register("sweet_potato_plant",
            () -> new SweetPotatoPlant(Block.Properties.from(Blocks.WHEAT)));

    public static final RegistryObject<Block> TINY_SPRUCE = registerBlock("tiny_spruce",
            () -> new GrowableTinySpruce(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F).notSolid().sound(SoundType.CROP)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> HOLLY_SAPLING = registerBlock("holly_sapling",
            () -> new GrowableHollyTree(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F).notSolid().sound(SoundType.CROP)), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> CHRISTMAS_WREATH = registerBlock("christmas_wreath",
            () -> new WreathBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F).sound(SoundType.PLANT).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHRISTMAS_WREATH_WHITE_LIGHTS = registerBlock("christmas_wreath_white_lights",
            () -> new WreathBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F).sound(SoundType.PLANT).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHRISTMAS_WREATH_MULTI_LIGHTS = registerBlock("christmas_wreath_multi_lights",
            () -> new WreathBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F).sound(SoundType.PLANT).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //TOPPERS//
    public static final RegistryObject<Block> STAR_TOPPER = registerBlock("star_topper",
            () -> new TopperBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(0.5F, 2.0F).setLightLevel((p_50828_) -> {
                return 10;
            }).sound(SoundType.CHAIN).notSolid()), null);

    public static final RegistryObject<Block> BOW_TOPPER = registerBlock("bow_topper",
            () -> new TopperBlock(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.5F, 2.0F).sound(SoundType.CLOTH).notSolid()), null);


    //blocks that make up the christmas pine feature//
    public static final RegistryObject<Block> TREE = BLOCKS.register("christmas_pine_bottom",
            () -> new SpruceBottomBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(2.0F).sound(SoundType.CROP)));

    public static final RegistryObject<Block> TREE_MIDDLE = BLOCKS.register("christmas_pine_middle",
            () -> new SpruceMiddleBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(2.0F).sound(SoundType.CROP)));

    public static final RegistryObject<Block> TREE_TOP = BLOCKS.register("christmas_pine_top",
            () -> new SpruceTopBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(2.0F).sound(SoundType.CROP)));

    //HARVEST TRAY//
    public static final RegistryObject<Block> HARVEST_TRAY = registerBlock("harvest_tray",
            () -> new TrayBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.0F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //COOKIE TRAY//

    public static final RegistryObject<Block> COOKIE_TRAY = registerBlock("cookie_tray",
            () -> new TrayBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.0F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //KINARA//
    public static final RegistryObject<Block> KINARA = registerBlock("kinara",
            () -> new KinaraBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.5F, 2.0F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> KINARA_LIT = registerBlock("kinara_lit",
            () -> new KinaraBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 10;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHALICE = registerBlock("chalice",
            () -> new ChaliceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.5F, 2.0F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //MKEKA BLOCKS//

    public static final RegistryObject<Block> MKEKA = registerBlock("mkeka",
            () -> new MkekaBlock(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.2F, 2.0F).notSolid().sound(SoundType.CLOTH)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MKEKA_WITH_KINARA = BLOCKS.register("mkeka_with_kinara",
            () -> new MkekaWithKinaraBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.5F, 2.0F).notSolid()));

    public static final RegistryObject<Block> MKEKA_WITH_KINARA_LIT = BLOCKS.register("mkeka_with_kinara_lit",
            () -> new MkekaWithKinaraBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 10;
            })));

    public static final RegistryObject<Block> MKEKA_WITH_CHALICE = BLOCKS.register("mkeka_with_chalice",
            () -> new MkekaWithChaliceBlock(Block.Properties.create(Material.WOOL).notSolid().sound(SoundType.CLOTH).hardnessAndResistance(1.5F)));

    public static final RegistryObject<Block> MKEKA_WITH_CORN_1 = BLOCKS.register("mkeka_corn_1",
            () -> new MkekaBlock(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.2F, 2.0F).notSolid().sound(SoundType.CLOTH)));

    public static final RegistryObject<Block> MKEKA_WITH_CORN_2 = BLOCKS.register("mkeka_corn_2",
            () -> new MkekaBlock(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.2F, 2.0F).notSolid().sound(SoundType.CLOTH)));

    public static final RegistryObject<Block> MKEKA_WITH_CORN_3 = BLOCKS.register("mkeka_corn_3",
            () -> new MkekaBlock(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.2F, 2.0F).notSolid().sound(SoundType.CLOTH)));


    //MENORAH BLOCKS//

    public static final RegistryObject<Block> MENORAH = registerBlock("menorah",
            () -> new MenorahBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.5F, 2.0F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MENORAH_LIT = registerBlock("menorah_lit",
            () -> new MenorahBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 10;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //DREIDEL//
    public static final RegistryObject<Block> DREIDEL = registerBlock("dreidel",
            () -> new DreidelBlock(Block.Properties.create(Material.CLAY).hardnessAndResistance(0.5F, 2.0F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);
    //GELT//
    public static final RegistryObject<Block> GELT = registerBlock("gelt",
            () -> new GeltBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(0.5F, 2.0F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //CHRISTMAS TREE//

    public static final RegistryObject<Block> CHRISTMAS_TREE_STAND = registerBlock("christmas_tree_stand",
            () -> new TreeStandBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.5F, 2.0F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //PLAIN TREE//
    public static final RegistryObject<Block> CHRISTMAS_TREE_BOTTOM = BLOCKS.register("christmas_tree_bottom",
            () -> new ChristmasTreeBottomBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(2.0F).notSolid().sound(SoundType.CROP)));

    public static final RegistryObject<Block> CHRISTMAS_TREE_MIDDLE = BLOCKS.register("christmas_tree_middle",
            () -> new ChristmasTreeMiddleBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(2.0F).notSolid().sound(SoundType.CROP)));

    public static final RegistryObject<Block> CHRISTMAS_TREE_TOP = BLOCKS.register("christmas_tree_top",
            () -> new ChristmasTreeTopBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(2.0F).notSolid().sound(SoundType.CROP)));

    // WHITE LIGHTS//
    public static final RegistryObject<Block> CHRISTMAS_TREE_WHITE_LIGHTS_BOTTOM = BLOCKS.register("christmas_tree_white_lights_bottom",
            () -> new LightsChristmasTreeBottomBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 10;
            }).sound(SoundType.CROP)));

    public static final RegistryObject<Block> CHRISTMAS_TREE_WHITE_LIGHTS_MIDDLE = BLOCKS.register("christmas_tree_white_lights_middle",
            () -> new LightsChristmasTreeMiddleBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 10;
            }).sound(SoundType.CROP)));

    public static final RegistryObject<Block> CHRISTMAS_TREE_WHITE_LIGHTS_TOP = BLOCKS.register("christmas_tree_white_lights_top",
            () -> new LightsChristmasTreeTopBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 10;
            }).sound(SoundType.CROP)));

    // MULTI LIGHTS//
    public static final RegistryObject<Block> CHRISTMAS_TREE_MULTI_LIGHTS_BOTTOM = BLOCKS.register("christmas_tree_multi_lights_bottom",
            () -> new MultiChristmasTreeBottomBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 10;
            }).sound(SoundType.CROP)));

    public static final RegistryObject<Block> CHRISTMAS_TREE_MULTI_LIGHTS_MIDDLE = BLOCKS.register("christmas_tree_multi_lights_middle",
            () -> new MultiChristmasTreeMiddleBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 10;
            }).sound(SoundType.CROP)));

    public static final RegistryObject<Block> CHRISTMAS_TREE_MULTI_LIGHTS_TOP = BLOCKS.register("christmas_tree_multi_lights_top",
            () -> new MultiChristmasTreeTopBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 10;
            }).sound(SoundType.CROP)));


    //DECORATED WITH ORNAMENTS, NO LIGHTS/
    public static final RegistryObject<Block> DECORATED_CHRISTMAS_TREE_BOTTOM = BLOCKS.register("decorated_christmas_tree_bottom",
            () -> new DecoratedTreeBottomBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(2.0F).notSolid().sound(SoundType.CROP)));

    public static final RegistryObject<Block> DECORATED_CHRISTMAS_TREE_MIDDLE = BLOCKS.register("decorated_christmas_tree_middle",
            () -> new DecoratedTreeMiddleBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(2.0F).notSolid().sound(SoundType.CROP)));

    public static final RegistryObject<Block> DECORATED_CHRISTMAS_TREE_TOP = BLOCKS.register("decorated_christmas_tree_top",
            () -> new DecoratedTreeTopBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(2.0F).notSolid().sound(SoundType.CROP)));

    //DECORATED WITH WHITE ORNAMENTS, NO LIGHTS/
    public static final RegistryObject<Block> DECORATED_WHITE_CHRISTMAS_TREE_BOTTOM = BLOCKS.register("decorated_white_christmas_tree_bottom",
            () -> new DecoratedTreeBottomBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(2.0F).notSolid().sound(SoundType.CROP)));

    public static final RegistryObject<Block> DECORATED_WHITE_CHRISTMAS_TREE_MIDDLE = BLOCKS.register("decorated_white_christmas_tree_middle",
            () -> new DecoratedTreeMiddleBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(2.0F).notSolid().sound(SoundType.CROP)));

    public static final RegistryObject<Block> DECORATED_WHITE_CHRISTMAS_TREE_TOP = BLOCKS.register("decorated_white_christmas_tree_top",
            () -> new DecoratedTreeTopBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(2.0F).notSolid().sound(SoundType.CROP)));


    //WHITE LIGHTS AND WHITE ORNAMENTS//
    public static final RegistryObject<Block> DECORATED_WHITE_LIGHTS_CHRISTMAS_TREE_BOTTOM = BLOCKS.register("decorated_white_lights_christmas_tree_bottom",
            () -> new DecoratedTreeBottomBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 10;
            }).sound(SoundType.CROP)));

    public static final RegistryObject<Block> DECORATED_WHITE_LIGHTS_CHRISTMAS_TREE_MIDDLE = BLOCKS.register("decorated_white_lights_christmas_tree_middle",
            () -> new DecoratedTreeMiddleBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 10;
            }).sound(SoundType.CROP)));

    public static final RegistryObject<Block> DECORATED_WHITE_LIGHTS_CHRISTMAS_TREE_TOP = BLOCKS.register("decorated_white_lights_christmas_tree_top",
            () -> new DecoratedTreeTopBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 10;
            }).sound(SoundType.CROP)));


    //WHITE LIGHTS AND COLORED ORNAMENTS//
    public static final RegistryObject<Block> DECORATED_LIGHTS_CHRISTMAS_TREE_BOTTOM = BLOCKS.register("decorated_lights_christmas_tree_bottom",
            () -> new DecoratedTreeBottomBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 10;
            }).sound(SoundType.CROP)));

    public static final RegistryObject<Block> DECORATED_LIGHTS_CHRISTMAS_TREE_MIDDLE = BLOCKS.register("decorated_lights_christmas_tree_middle",
            () -> new DecoratedTreeMiddleBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 10;
            }).sound(SoundType.CROP)));

    public static final RegistryObject<Block> DECORATED_LIGHTS_CHRISTMAS_TREE_TOP =BLOCKS.register("decorated_lights_christmas_tree_top",
            () -> new DecoratedTreeTopBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 10;
            }).sound(SoundType.CROP)));

    //MULTI LIGHTS AND WHITE ORNAMENTS//
    public static final RegistryObject<Block> DECORATED_WHITE_MULTI_CHRISTMAS_TREE_BOTTOM = BLOCKS.register("decorated_white_multi_christmas_tree_bottom",
            () -> new DecoratedTreeBottomBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 10;
            }).sound(SoundType.CROP)));

    public static final RegistryObject<Block> DECORATED_WHITE_MULTI_CHRISTMAS_TREE_MIDDLE = BLOCKS.register("decorated_white_multi_christmas_tree_middle",
            () -> new DecoratedTreeMiddleBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 10;
            }).sound(SoundType.CROP)));

    public static final RegistryObject<Block> DECORATED_WHITE_MULTI_CHRISTMAS_TREE_TOP = BLOCKS.register("decorated_white_multi_christmas_tree_top",
            () -> new DecoratedTreeTopBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 10;
            }).sound(SoundType.CROP)));


    //MULTI LIGHTS AND COLORED ORNAMENTS//
    public static final RegistryObject<Block> DECORATED_MULTI_CHRISTMAS_TREE_BOTTOM = BLOCKS.register("decorated_multi_christmas_tree_bottom",
            () -> new DecoratedTreeBottomBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 10;
            }).sound(SoundType.CROP)));

    public static final RegistryObject<Block> DECORATED_MULTI_CHRISTMAS_TREE_MIDDLE = BLOCKS.register("decorated_multi_christmas_tree_middle",
            () -> new DecoratedTreeMiddleBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 10;
            }).sound(SoundType.CROP)));

    public static final RegistryObject<Block> DECORATED_MULTI_CHRISTMAS_TREE_TOP = BLOCKS.register("decorated_multi_christmas_tree_top",
            () -> new DecoratedTreeTopBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 10;
            }).sound(SoundType.CROP)));

    //PRESENT//
    public static final RegistryObject<Block> PRESENT = registerBlock("present",
            () -> new PresentBlock(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.2F, 2.0F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> MANTEL_DECO = registerBlock("mantel_deco",
            () -> new MantelDecoBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(0.5F, 2.0F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MANTEL_DECO_1 = registerBlock("mantel_deco_1",
            () -> new MantelDecoBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(0.5F, 2.0F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MANTEL_DECO_2 = registerBlock("mantel_deco_2",
            () -> new MantelDecoBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(0.5F, 2.0F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MANTEL_DECO_3 = registerBlock("mantel_deco_3",
            () -> new MantelDecoBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(0.5F, 2.0F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MANTEL_DECO_4 = registerBlock("mantel_deco_4",
            () -> new MantelDecoBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(0.5F, 2.0F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MANTEL_DECO_5 = registerBlock("mantel_deco_5",
            () -> new MantelDecoBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(0.5F, 2.0F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //ACACIA MANTEL BLOCKS//
    public static final RegistryObject<Block> MANTEL_ACACIA_NORMAL = registerBlock("mantel_normal_acacia",
            () -> new MantelBlockAcacia(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MANTEL_ACACIA_TOP_MIDDLE = BLOCKS.register("mantel_acacia_top_middle_stocking",
            () -> new MantelTopCenterStocking(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_ACACIA_TOP_LEFT_STOCKING = BLOCKS.register("mantel_acacia_top_left_stocking",
            () -> new MantelTopLeftStocking(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_ACACIA_TOP_RIGHT_STOCKING = BLOCKS.register("mantel_acacia_top_right_stocking",
            () -> new MantelTopRightStocking(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_ACACIA_LEG_LEFT = BLOCKS.register("mantel_acacia_leg_left",
            () -> new MantelLegLeft(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_ACACIA_LEG_RIGHT = BLOCKS.register("mantel_acacia_leg_right",
            () -> new MantelLegRight(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    //BIRCH MANTEL BLOCKS//
    public static final RegistryObject<Block> MANTEL_BIRCH_NORMAL = registerBlock("mantel_normal_birch",
            () -> new MantelBlockBirch(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MANTEL_BIRCH_TOP_MIDDLE = BLOCKS.register("mantel_birch_top_middle_stocking",
            () -> new MantelTopCenterStocking(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_BIRCH_TOP_LEFT_STOCKING = BLOCKS.register("mantel_birch_top_left_stocking",
            () -> new MantelTopLeftStocking(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_BIRCH_TOP_RIGHT_STOCKING = BLOCKS.register("mantel_birch_top_right_stocking",
            () -> new MantelTopRightStocking(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_BIRCH_LEG_LEFT = BLOCKS.register("mantel_birch_leg_left",
            () -> new MantelLegLeft(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_BIRCH_LEG_RIGHT = BLOCKS.register("mantel_birch_leg_right",
            () -> new MantelLegRight(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    //OAK MANTEL BLOCKS//
    public static final RegistryObject<Block> MANTEL_OAK_NORMAL = registerBlock("mantel_normal_oak",
            () -> new MantelBlockOak(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MANTEL_OAK_TOP_MIDDLE = BLOCKS.register("mantel_oak_top_middle_stocking",
            () -> new MantelTopCenterStocking(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_OAK_TOP_LEFT_STOCKING = BLOCKS.register("mantel_oak_top_left_stocking",
            () -> new MantelTopLeftStocking(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_OAK_TOP_RIGHT_STOCKING = BLOCKS.register("mantel_oak_top_right_stocking",
            () -> new MantelTopRightStocking(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_OAK_LEG_LEFT = BLOCKS.register("mantel_oak_leg_left",
            () -> new MantelLegLeft(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_OAK_LEG_RIGHT = BLOCKS.register("mantel_oak_leg_right",
            () -> new MantelLegRight(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    //DARK_OAK MANTEL BLOCKS//
    public static final RegistryObject<Block> MANTEL_DARK_OAK_NORMAL = registerBlock("mantel_normal_dark_oak",
            () -> new MantelBlockDarkOak(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MANTEL_DARK_OAK_TOP_MIDDLE = BLOCKS.register("mantel_dark_oak_top_middle_stocking",
            () -> new MantelTopCenterStocking(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_DARK_OAK_TOP_LEFT_STOCKING = BLOCKS.register("mantel_dark_oak_top_left_stocking",
            () -> new MantelTopLeftStocking(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_DARK_OAK_TOP_RIGHT_STOCKING = BLOCKS.register("mantel_dark_oak_top_right_stocking",
            () -> new MantelTopRightStocking(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_DARK_OAK_LEG_LEFT = BLOCKS.register("mantel_dark_oak_leg_left",
            () -> new MantelLegLeft(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_DARK_OAK_LEG_RIGHT = BLOCKS.register("mantel_dark_oak_leg_right",
            () -> new MantelLegRight(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    //SPRUCE MANTEL BLOCKS//
    public static final RegistryObject<Block> MANTEL_SPRUCE_NORMAL = registerBlock("mantel_normal_spruce",
            () -> new MantelBlockSpruce(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MANTEL_SPRUCE_TOP_MIDDLE = BLOCKS.register("mantel_spruce_top_middle_stocking",
            () -> new MantelTopCenterStocking(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_SPRUCE_TOP_LEFT_STOCKING = BLOCKS.register("mantel_spruce_top_left_stocking",
            () -> new MantelTopLeftStocking(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_SPRUCE_TOP_RIGHT_STOCKING = BLOCKS.register("mantel_spruce_top_right_stocking",
            () -> new MantelTopRightStocking(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_SPRUCE_LEG_LEFT = BLOCKS.register("mantel_spruce_leg_left",
            () -> new MantelLegLeft(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_SPRUCE_LEG_RIGHT = BLOCKS.register("mantel_spruce_leg_right",
            () -> new MantelLegRight(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    //JUNGLE MANTEL BLOCKS//
    public static final RegistryObject<Block> MANTEL_JUNGLE_NORMAL = registerBlock("mantel_normal_jungle",
            () -> new MantelBlockJungle(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MANTEL_JUNGLE_TOP_MIDDLE = BLOCKS.register("mantel_jungle_top_middle_stocking",
            () -> new MantelTopCenterStocking(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_JUNGLE_TOP_LEFT_STOCKING = BLOCKS.register("mantel_jungle_top_left_stocking",
            () -> new MantelTopLeftStocking(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_JUNGLE_TOP_RIGHT_STOCKING = BLOCKS.register("mantel_jungle_top_right_stocking",
            () -> new MantelTopRightStocking(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_JUNGLE_LEG_LEFT = BLOCKS.register("mantel_jungle_leg_left",
            () -> new MantelLegLeft(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_JUNGLE_LEG_RIGHT = BLOCKS.register("mantel_jungle_leg_right",
            () -> new MantelLegRight(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    //CRIMSON MANTEL BLOCKS//
    public static final RegistryObject<Block> MANTEL_CRIMSON_NORMAL = registerBlock("mantel_normal_crimson",
            () -> new MantelBlockCrimson(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MANTEL_CRIMSON_TOP_MIDDLE = BLOCKS.register("mantel_crimson_top_middle_stocking",
            () -> new MantelTopCenterStocking(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_CRIMSON_TOP_LEFT_STOCKING = BLOCKS.register("mantel_crimson_top_left_stocking",
            () -> new MantelTopLeftStocking(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_CRIMSON_TOP_RIGHT_STOCKING = BLOCKS.register("mantel_crimson_top_right_stocking",
            () -> new MantelTopRightStocking(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_CRIMSON_LEG_LEFT = BLOCKS.register("mantel_crimson_leg_left",
            () -> new MantelLegLeft(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_CRIMSON_LEG_RIGHT = BLOCKS.register("mantel_crimson_leg_right",
            () -> new MantelLegRight(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    //WARPED MANTEL BLOCKS//
    public static final RegistryObject<Block> MANTEL_WARPED_NORMAL = registerBlock("mantel_normal_warped",
            () -> new MantelBlockWarped(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MANTEL_WARPED_TOP_MIDDLE = BLOCKS.register("mantel_warped_top_middle_stocking",
            () -> new MantelTopCenterStocking(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_WARPED_TOP_LEFT_STOCKING = BLOCKS.register("mantel_warped_top_left_stocking",
            () -> new MantelTopLeftStocking(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_WARPED_TOP_RIGHT_STOCKING = BLOCKS.register("mantel_warped_top_right_stocking",
            () -> new MantelTopRightStocking(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_WARPED_LEG_LEFT = BLOCKS.register("mantel_warped_leg_left",
            () -> new MantelLegLeft(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.5F, 2.0F)));

    public static final RegistryObject<Block> MANTEL_WARPED_LEG_RIGHT = BLOCKS.register("mantel_warped_leg_right",
            () -> new MantelLegRight(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.0F)));


    //FIREPLACE LOGS//
    public static final RegistryObject<Block> FIREPLACE_LOGS = registerBlock("fireplace_logs",
            () -> new Fireplace(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.5F, 2.0F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> FIREPLACE_LOGS_ON = BLOCKS.register("fireplace_logs_on",
            () -> new FireplaceLogsOn(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })));


    //LAMP POSTS//

    public static final RegistryObject<Block> LAMP_POST = registerBlock("lamp_post",
            () -> new LampPost(Block.Properties.create(Material.IRON).hardnessAndResistance(0.5F, 2.0F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LAMP_POST_ON = BLOCKS.register("lamp_post_on",
            () -> new LampPostOn(Block.Properties.create(Material.IRON).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })));

    public static final RegistryObject<Block> LAMP_POST_BOTTOM = registerBlock("lamp_post_bottom",
            () -> new LampPostBottom(Block.Properties.create(Material.IRON).hardnessAndResistance(0.5F, 2.0F).notSolid()), null);

    public static final RegistryObject<Block> LAMP_POST_POLE = registerBlock("lamp_post_pole",
            () -> new LampPostPole(Block.Properties.create(Material.IRON).hardnessAndResistance(0.5F, 2.0F).notSolid()), null);

    //LAMP POST WITH DECORATIONS//
    public static final RegistryObject<Block> LAMP_POST_POLE_WREATH = BLOCKS.register("lamp_post_pole_wreath",
            () -> new LampPostPole(Block.Properties.create(Material.IRON).hardnessAndResistance(0.5F, 2.0F).notSolid()));

    public static final RegistryObject<Block> LAMP_POST_POLE_WREATH_WHITE = BLOCKS.register("lamp_post_pole_wreath_white",
            () -> new LampPostPole(Block.Properties.create(Material.IRON).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })));

    public static final RegistryObject<Block> LAMP_POST_POLE_WREATH_MULTI = BLOCKS.register("lamp_post_pole_wreath_multi",
            () -> new LampPostPole(Block.Properties.create(Material.IRON).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })));

    public static final RegistryObject<Block> LAMP_POST_POLE_BOW = BLOCKS.register("lamp_post_pole_bow",
            () -> new LampPostPole(Block.Properties.create(Material.IRON).hardnessAndResistance(0.5F, 2.0F).notSolid()));

//LIGHTS//
//CLASSIC LIGHTS//

    public static final RegistryObject<Block> CLASSIC_LIGHTS = registerBlock("classic_lights_horizontal",
            () -> new ConnectingClassicWhite(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CLASSIC_LIGHTS_DIAGONAL_LEFT = registerBlock("classic_lights_diagonal_left",
            () -> new LightsBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CLASSIC_LIGHTS_DIAGONAL_RIGHT = registerBlock("classic_lights_diagonal_right",
            () -> new LightsBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CLASSIC_LIGHTS_CAP = registerBlock("classic_lights_cap",
            () -> new LightsBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CLASSIC_LIGHTS_VERTICAL_LEFT = registerBlock("classic_lights_vertical_left",
            () -> new LightsVerticalBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CLASSIC_LIGHTS_VERTICAL_RIGHT = registerBlock("classic_lights_vertical_right",
            () -> new LightsVerticalBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CLASSIC_LIGHTS_VERTICAL_CORNER_LEFT = registerBlock("classic_lights_vertical_corner_left",
            () -> new LightsVerticalBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CLASSIC_LIGHTS_VERTICAL_CORNER_RIGHT = registerBlock("classic_lights_vertical_corner_right",
            () -> new LightsVerticalBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //CLASSIC MULTI COLORED//
    public static final RegistryObject<Block> CLASSIC_MULTI = registerBlock("classic_multi_horizontal",
            () -> new ConnectingClassicMulti(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CLASSIC_MULTI_DIAGONAL_LEFT = registerBlock("classic_multi_diagonal_left",
            () -> new LightsBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CLASSIC_MULTI_DIAGONAL_RIGHT = registerBlock("classic_multi_diagonal_right",
            () -> new LightsBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CLASSIC_MULTI_CAP = registerBlock("classic_multi_cap",
            () -> new LightsBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CLASSIC_MULTI_VERTICAL_LEFT = registerBlock("classic_multi_vertical_left",
            () -> new LightsVerticalBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CLASSIC_MULTI_VERTICAL_RIGHT = registerBlock("classic_multi_vertical_right",
            () -> new LightsVerticalBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CLASSIC_MULTI_VERTICAL_CORNER_LEFT = registerBlock("classic_multi_vertical_corner_left",
            () -> new LightsVerticalBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CLASSIC_MULTI_VERTICAL_CORNER_RIGHT = registerBlock("classic_multi_vertical_corner_right",
            () -> new LightsVerticalBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //ICICLE LIGHTS//
    public static final RegistryObject<Block> ICICLE_LIGHTS = registerBlock("icicle_lights_horizontal",
            () -> new ConnectingIcicleWhite(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ICICLE_LIGHTS_DIAGONAL_LEFT = registerBlock("icicle_lights_diagonal_left",
            () -> new LightsBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ICICLE_LIGHTS_DIAGONAL_RIGHT = registerBlock("icicle_lights_diagonal_right",
            () -> new LightsBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ICICLE_LIGHTS_CAP = registerBlock("icicle_lights_cap",
            () -> new LightsBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //ICICLE MULTI COLORED//
    public static final RegistryObject<Block> ICICLE_MULTI = registerBlock("icicle_multi_horizontal",
            () -> new ConnectingIcicleMulti(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ICICLE_MULTI_DIAGONAL_LEFT = registerBlock("icicle_multi_diagonal_left",
            () -> new LightsBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ICICLE_MULTI_DIAGONAL_RIGHT = registerBlock("icicle_multi_diagonal_right",
            () -> new LightsBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ICICLE_MULTI_CAP = registerBlock("icicle_multi_cap",
            () -> new LightsBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //TWINKLING_ICICLE LIGHTS//
    public static final RegistryObject<Block> TWINKLING_ICICLE_LIGHTS = registerBlock("twinkling_icicle_lights_horizontal",
            () -> new ConnectingTwinklingIcicleWhite(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> TWINKLING_ICICLE_LIGHTS_DIAGONAL_LEFT = registerBlock("twinkling_icicle_lights_diagonal_left",
            () -> new LightsBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> TWINKLING_ICICLE_LIGHTS_DIAGONAL_RIGHT = registerBlock("twinkling_icicle_lights_diagonal_right",
            () -> new LightsBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> TWINKLING_ICICLE_LIGHTS_CAP = registerBlock("twinkling_icicle_lights_cap",
            () -> new LightsBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //TWINKLING_ICICLE MULTI COLORED//
    public static final RegistryObject<Block> TWINKLING_ICICLE_MULTI = registerBlock("twinkling_icicle_multi_horizontal",
            () -> new ConnectingTwinklingIcicleMulti(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> TWINKLING_ICICLE_MULTI_DIAGONAL_LEFT = registerBlock("twinkling_icicle_multi_diagonal_left",
            () -> new LightsBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> TWINKLING_ICICLE_MULTI_DIAGONAL_RIGHT = registerBlock("twinkling_icicle_multi_diagonal_right",
            () -> new LightsBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> TWINKLING_ICICLE_MULTI_CAP = registerBlock("twinkling_icicle_multi_cap",
            () -> new LightsBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //MINI LIGHTS//
    public static final RegistryObject<Block> MINI_LIGHTS = registerBlock("mini_lights_horizontal",
            () -> new ConnectingMiniWhite(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MINI_LIGHTS_DIAGONAL_LEFT = registerBlock("mini_lights_diagonal_left",
            () -> new LightsBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MINI_LIGHTS_DIAGONAL_RIGHT = registerBlock("mini_lights_diagonal_right",
            () -> new LightsBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MINI_LIGHTS_CAP = registerBlock("mini_lights_cap",
            () -> new LightsBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);
    //MINI VERTICAL//
    public static final RegistryObject<Block> MINI_LIGHTS_VERTICAL_RIGHT = registerBlock("mini_lights_vertical_right",
            () -> new LightsVerticalBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MINI_LIGHTS_VERTICAL_LEFT = registerBlock("mini_lights_vertical_left",
            () -> new LightsVerticalBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MINI_MULTI_VERTICAL_RIGHT = registerBlock("mini_multi_vertical_right",
            () -> new LightsVerticalBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MINI_MULTI_VERTICAL_LEFT = registerBlock("mini_multi_vertical_left",
            () -> new LightsVerticalBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);
    //MINI CORNER VERTICAL//
    public static final RegistryObject<Block> MINI_CORNER_LIGHTS_VERTICAL_RIGHT = registerBlock("mini_corner_lights_vertical_right",
            () -> new LightsVerticalBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MINI_CORNER_LIGHTS_VERTICAL_LEFT = registerBlock("mini_corner_lights_vertical_left",
            () -> new LightsVerticalBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MINI_CORNER_MULTI_VERTICAL_RIGHT = registerBlock("mini_corner_multi_vertical_right",
            () -> new LightsVerticalBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MINI_CORNER_MULTI_VERTICAL_LEFT = registerBlock("mini_corner_multi_vertical_left",
            () -> new LightsVerticalBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //MINI MULTI COLORED//
    public static final RegistryObject<Block> MINI_MULTI = registerBlock("mini_multi_horizontal",
            () -> new ConnectingMiniMulti(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MINI_MULTI_DIAGONAL_LEFT = registerBlock("mini_multi_diagonal_left",
            () -> new LightsBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MINI_MULTI_DIAGONAL_RIGHT = registerBlock("mini_multi_diagonal_right",
            () -> new LightsBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MINI_MULTI_CAP = registerBlock("mini_multi_cap",
            () -> new LightsBlock(Block.Properties.create(Material.GLASS).hardnessAndResistance(0.5F, 2.0F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

//GARLAND BLOCKS--DIAGONAL//

    public static final RegistryObject<Block> GARLAND_DIAGONAL_LEFT = registerBlock("garland_diagonal_left",
            () -> new GarlandBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)
                    .notSolid().sound(SoundType.BAMBOO_SAPLING)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GARLAND_DIAGONAL_RIGHT = registerBlock("garland_diagonal_right",
            () -> new GarlandBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)
                    .notSolid().sound(SoundType.BAMBOO_SAPLING)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GARLAND_LIGHTS_DIAGONAL_LEFT = registerBlock("garland_lights_diagonal_left",
            () -> new GarlandBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)
                    .notSolid().sound(SoundType.BAMBOO_SAPLING).setLightLevel((p_50828_) -> {
                        return 12;
                    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GARLAND_LIGHTS_DIAGONAL_RIGHT = registerBlock("garland_lights_diagonal_right",
            () -> new GarlandBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)
                    .notSolid().sound(SoundType.BAMBOO_SAPLING).setLightLevel((p_50828_) -> {
                        return 12;
                    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GARLAND_MULTI_DIAGONAL_LEFT = registerBlock("garland_multi_diagonal_left",
            () -> new GarlandBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)
                    .notSolid().sound(SoundType.BAMBOO_SAPLING).setLightLevel((p_50828_) -> {
                        return 12;
                    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GARLAND_MULTI_DIAGONAL_RIGHT = registerBlock("garland_multi_diagonal_right",
            () -> new GarlandBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)
                    .notSolid().sound(SoundType.BAMBOO_SAPLING).setLightLevel((p_50828_) -> {
                        return 12;
                    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //GARLAND BLOCKS--HORIZONTAL//
    public static final RegistryObject<Block> GARLAND_HORIZONTAL = registerBlock("garland_horizontal",
            () -> new ConnectingGarland(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)
                    .notSolid().sound(SoundType.BAMBOO_SAPLING)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GARLAND_HORIZONTAL_LIGHTS_WHITE = registerBlock("garland_horizontal_lights",
            () -> new ConnectingGarlandWhite(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)
                    .notSolid().sound(SoundType.BAMBOO_SAPLING).setLightLevel((p_50828_) -> {
                        return 12;
                    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GARLAND_HORIZONTAL_LIGHTS_MULTI = registerBlock("garland_horizontal_multi",
            () -> new ConnectingGarlandMulti(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)
                    .notSolid().sound(SoundType.BAMBOO_SAPLING).setLightLevel((p_50828_) -> {
                        return 12;
                    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //GARLAND-VERTICAL//

    public static final RegistryObject<Block> GARLAND_VERTICAL_LEFT = registerBlock("garland_vertical_left",
            () -> new GarlandVerticalBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)
                    .notSolid().sound(SoundType.BAMBOO_SAPLING)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GARLAND_VERTICAL_RIGHT = registerBlock("garland_vertical_right",
            () -> new GarlandVerticalRight(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)
                    .notSolid().sound(SoundType.BAMBOO_SAPLING)), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> GARLAND_VERTICAL_LIGHTS_WHITE_LEFT = registerBlock("garland_vertical_lights_left",
            () -> new GarlandVerticalBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)
                    .notSolid().sound(SoundType.BAMBOO_SAPLING).setLightLevel((p_50828_) -> {
                        return 12;
                    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GARLAND_VERTICAL_LIGHTS_WHITE_RIGHT = registerBlock("garland_vertical_lights_right",
            () -> new GarlandVerticalRight(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)
                    .notSolid().sound(SoundType.BAMBOO_SAPLING).setLightLevel((p_50828_) -> {
                        return 12;
                    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GARLAND_VERTICAL_LIGHTS_MULTI_LEFT = registerBlock("garland_vertical_multi_left",
            () -> new GarlandVerticalBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)
                    .notSolid().sound(SoundType.BAMBOO_SAPLING).setLightLevel((p_50828_) -> {
                        return 12;
                    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GARLAND_VERTICAL_LIGHTS_MULTI_RIGHT = registerBlock("garland_vertical_multi_right",
            () -> new GarlandVerticalRight(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)
                    .notSolid().sound(SoundType.BAMBOO_SAPLING).setLightLevel((p_50828_) -> {
                        return 12;
                    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //GARLAND VERTICAL CORNERS//
    public static final RegistryObject<Block> GARLAND_VERTICAL_CORNER_LEFT = registerBlock("garland_vertical_corner_left",
            () -> new GarlandVerticalCornerBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)
                    .notSolid().sound(SoundType.BAMBOO_SAPLING)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GARLAND_VERTICAL_CORNER_RIGHT = registerBlock("garland_vertical_corner_right",
            () -> new GarlandVerticalCornerRightBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)
                    .notSolid().sound(SoundType.BAMBOO_SAPLING)), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> GARLAND_VERTICAL_CORNER_LIGHTS_LEFT = registerBlock("garland_vertical_corner_lights_left",
            () -> new GarlandVerticalCornerBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)
                    .notSolid().sound(SoundType.BAMBOO_SAPLING).setLightLevel((p_50828_) -> {
                        return 12;
                    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GARLAND_VERTICAL_CORNER_LIGHTS_RIGHT = registerBlock("garland_vertical_corner_lights_right",
            () -> new GarlandVerticalCornerRightBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)
                    .notSolid().sound(SoundType.BAMBOO_SAPLING).setLightLevel((p_50828_) -> {
                        return 12;
                    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> GARLAND_VERTICAL_CORNER_MULTI_LEFT = registerBlock("garland_vertical_corner_multi_left",
            () -> new GarlandVerticalCornerBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)
                    .notSolid().sound(SoundType.BAMBOO_SAPLING).setLightLevel((p_50828_) -> {
                        return 12;
                    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GARLAND_VERTICAL_CORNER_MULTI_RIGHT = registerBlock("garland_vertical_corner_multi_right",
            () -> new GarlandVerticalCornerRightBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)
                    .notSolid().sound(SoundType.BAMBOO_SAPLING).setLightLevel((p_50828_) -> {
                        return 12;
                    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //ROOF STAIRS//
    public static final RegistryObject<Block> ROOF_ACACIA_STAIRS = registerBlock("roof_acacia_stairs",
            () -> new SnowyStairsBlock(Blocks.ACACIA_PLANKS.getDefaultState(), Block.Properties.create(Material.WOOD)
                    .hardnessAndResistance(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROOF_BIRCH_STAIRS = registerBlock("roof_birch_stairs",
            () -> new SnowyStairsBlock(Blocks.BIRCH_PLANKS.getDefaultState(), Block.Properties.create(Material.WOOD)
                    .hardnessAndResistance(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROOF_DARK_OAK_STAIRS = registerBlock("roof_dark_oak_stairs",
            () -> new SnowyStairsBlock(Blocks.DARK_OAK_PLANKS.getDefaultState(), Block.Properties.create(Material.WOOD)
                    .hardnessAndResistance(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROOF_JUNGLE_STAIRS = registerBlock("roof_jungle_stairs",
            () -> new SnowyStairsBlock(Blocks.JUNGLE_PLANKS.getDefaultState(), Block.Properties.create(Material.WOOD)
                    .hardnessAndResistance(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROOF_OAK_STAIRS = registerBlock("roof_oak_stairs",
            () -> new SnowyStairsBlock(Blocks.OAK_PLANKS.getDefaultState(), Block.Properties.create(Material.WOOD)
                    .hardnessAndResistance(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROOF_SPRUCE_STAIRS = registerBlock("roof_spruce_stairs",
            () -> new SnowyStairsBlock(Blocks.SPRUCE_PLANKS.getDefaultState(), Block.Properties.create(Material.WOOD)
                    .hardnessAndResistance(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROOF_WARPED_STAIRS = registerBlock("roof_warped_stairs",
            () -> new SnowyStairsBlock(Blocks.SPRUCE_PLANKS.getDefaultState(), Block.Properties.create(Material.WOOD)
                    .hardnessAndResistance(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROOF_CRIMSON_STAIRS = registerBlock("roof_crimson_stairs",
            () -> new SnowyStairsBlock(Blocks.SPRUCE_PLANKS.getDefaultState(), Block.Properties.create(Material.WOOD)
                    .hardnessAndResistance(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);
    //ROOF TILES OTHER STAIRS//
    public static final RegistryObject<Block> ROOF_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("roof_polished_blackstone_brick_stairs",
            () -> new StairsBlock(() -> Blocks.SMOOTH_QUARTZ.getDefaultState(), Block.Properties.create(Material.WOOD)
                    .hardnessAndResistance(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);



    public static final RegistryObject<Block> ROOF_STONE_BRICK_STAIRS = registerBlock("roof_stone_brick_stairs",
            () -> new StairsBlock(() -> Blocks.SMOOTH_QUARTZ.getDefaultState(), Block.Properties.create(Material.WOOD)
                    .hardnessAndResistance(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //TESTING SNOW ON STAIRS//
    public static final RegistryObject<Block> SNOWY_ACACIA_STAIRS = registerBlock("snowy_acacia_stairs",
            () -> new StairsBlock(() -> Blocks.SMOOTH_QUARTZ.getDefaultState(), Block.Properties.create(Material.WOOD)
                    .hardnessAndResistance(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SNOWY_BIRCH_STAIRS = registerBlock("snowy_birch_stairs",
            () -> new StairsBlock(() -> Blocks.SMOOTH_QUARTZ.getDefaultState(), Block.Properties.create(Material.WOOD)
                    .hardnessAndResistance(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SNOWY_DARK_OAK_STAIRS = registerBlock("snowy_dark_oak_stairs",
            () -> new StairsBlock(() -> Blocks.SMOOTH_QUARTZ.getDefaultState(), Block.Properties.create(Material.WOOD)
                    .hardnessAndResistance(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SNOWY_JUNGLE_STAIRS = registerBlock("snowy_jungle_stairs",
            () -> new StairsBlock(() -> Blocks.SMOOTH_QUARTZ.getDefaultState(), Block.Properties.create(Material.WOOD)
                    .hardnessAndResistance(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SNOWY_OAK_STAIRS = registerBlock("snowy_oak_stairs",
            () -> new StairsBlock(() -> Blocks.SMOOTH_QUARTZ.getDefaultState(), Block.Properties.create(Material.WOOD)
                    .hardnessAndResistance(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SNOWY_SPRUCE_STAIRS = registerBlock("snowy_spruce_stairs",
            () -> new StairsBlock(() -> Blocks.SMOOTH_QUARTZ.getDefaultState(), Block.Properties.create(Material.WOOD)
                    .hardnessAndResistance(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SNOWY_WARPED_STAIRS = registerBlock("snowy_warped_stairs",
            () -> new StairsBlock(() -> Blocks.SMOOTH_QUARTZ.getDefaultState(), Block.Properties.create(Material.WOOD)
                    .hardnessAndResistance(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SNOWY_CRIMSON_STAIRS = registerBlock("snowy_crimson_stairs",
            () -> new StairsBlock(() -> Blocks.SMOOTH_QUARTZ.getDefaultState(), Block.Properties.create(Material.WOOD)
                    .hardnessAndResistance(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //SNOWY OTHER STAIRS//
    public static final RegistryObject<Block> SNOWY_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("snowy_polished_blackstone_brick_stairs",
            () -> new StairsBlock(() -> Blocks.SMOOTH_QUARTZ.getDefaultState(), Block.Properties.create(Material.WOOD)
                    .hardnessAndResistance(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);



    public static final RegistryObject<Block> SNOWY_STONE_BRICK_STAIRS = registerBlock("snowy_stone_brick_stairs",
            () -> new StairsBlock(() -> Blocks.SMOOTH_QUARTZ.getDefaultState(), Block.Properties.create(Material.WOOD)
                    .hardnessAndResistance(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ACACIA_ROOF_SLAB = registerBlock("acacia_roof_slab",
            () -> new SnowySlabBlock(Block.Properties.from(Blocks.SNOW)), ModItemGroups.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<Block> BIRCH_ROOF_SLAB = registerBlock("birch_roof_slab",
            () -> new SnowySlabBlock(Block.Properties.from(Blocks.SNOW)), ModItemGroups.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<Block> OAK_ROOF_SLAB = registerBlock("oak_roof_slab",
            () -> new SnowySlabBlock(Block.Properties.from(Blocks.SNOW)), ModItemGroups.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<Block> DARK_OAK_ROOF_SLAB = registerBlock("dark_oak_roof_slab",
            () -> new SnowySlabBlock(Block.Properties.from(Blocks.SNOW)), ModItemGroups.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<Block> SPRUCE_ROOF_SLAB = registerBlock("spruce_roof_slab",
            () -> new SnowySlabBlock(Block.Properties.from(Blocks.SNOW)), ModItemGroups.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<Block> JUNGLE_ROOF_SLAB = registerBlock("jungle_roof_slab",
            () -> new SnowySlabBlock(Block.Properties.from(Blocks.SNOW)), ModItemGroups.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<Block> CRIMSON_ROOF_SLAB = registerBlock("crimson_roof_slab",
            () -> new SnowySlabBlock(Block.Properties.from(Blocks.SNOW)), ModItemGroups.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<Block> WARPED_ROOF_SLAB = registerBlock("warped_roof_slab",
            () -> new SnowySlabBlock(Block.Properties.from(Blocks.SNOW)), ModItemGroups.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICK_ROOF_SLAB = registerBlock("polished_blackstone_brick_roof_slab",
            () -> new SnowySlabBlock(Block.Properties.from(Blocks.SNOW)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> STONE_BRICK_ROOF_SLAB = registerBlock("stone_brick_roof_slab",
            () -> new SnowySlabBlock(Block.Properties.from(Blocks.SNOW)), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> ACACIA_SNOWY_SLAB = registerBlock("acacia_snowy_slab",
            () -> new SlabBlock(Block.Properties.from(Blocks.SNOW)), ModItemGroups.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<Block> BIRCH_SNOWY_SLAB = registerBlock("birch_snowy_slab",
            () -> new SlabBlock(Block.Properties.from(Blocks.SNOW)), ModItemGroups.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<Block> OAK_SNOWY_SLAB = registerBlock("oak_snowy_slab",
            () -> new SlabBlock(Block.Properties.from(Blocks.SNOW)), ModItemGroups.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<Block> DARK_OAK_SNOWY_SLAB = registerBlock("dark_oak_snowy_slab",
            () -> new SlabBlock(Block.Properties.from(Blocks.SNOW)), ModItemGroups.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<Block> SPRUCE_SNOWY_SLAB = registerBlock("spruce_snowy_slab",
            () -> new SlabBlock(Block.Properties.from(Blocks.SNOW)), ModItemGroups.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<Block> JUNGLE_SNOWY_SLAB = registerBlock("jungle_snowy_slab",
            () -> new SlabBlock(Block.Properties.from(Blocks.SNOW)), ModItemGroups.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<Block> CRIMSON_SNOWY_SLAB = registerBlock("crimson_snowy_slab",
            () -> new SlabBlock(Block.Properties.from(Blocks.SNOW)), ModItemGroups.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<Block> WARPED_SNOWY_SLAB = registerBlock("warped_snowy_slab",
            () -> new SlabBlock(Block.Properties.from(Blocks.SNOW)), ModItemGroups.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICK_SNOWY_SLAB = registerBlock("polished_blackstone_brick_snowy_slab",
            () -> new SlabBlock(Block.Properties.from(Blocks.SNOW)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> STONE_BRICK_SNOWY_SLAB = registerBlock("stone_brick_snowy_slab",
            () -> new SlabBlock(Block.Properties.from(Blocks.SNOW)), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //WREATH DOORS//
    public static final RegistryObject<Block> ACACIA_WREATH_DOOR = registerBlock("acacia_wreath_door",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BIRCH_WREATH_DOOR = registerBlock("birch_wreath_door",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> OAK_WREATH_DOOR = registerBlock("oak_wreath_door",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SPRUCE_WREATH_DOOR = registerBlock("spruce_wreath_door",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DARK_OAK_WREATH_DOOR = registerBlock("dark_oak_wreath_door",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JUNGLE_WREATH_DOOR = registerBlock("jungle_wreath_door",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CRIMSON_WREATH_DOOR = registerBlock("crimson_wreath_door",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WARPED_WREATH_DOOR = registerBlock("warped_wreath_door",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> IRON_WREATH_DOOR = registerBlock("iron_wreath_door",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).hardnessAndResistance(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //WREATH LIGHTS DOORS//

    public static final RegistryObject<Block> ACACIA_WREATH_LIGHTS_WHITE_DOOR = registerBlock("acacia_wreath_lights_white_door",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).notSolid().hardnessAndResistance(0.5F, 2.0F).setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BIRCH_WREATH_LIGHTS_WHITE_DOOR = registerBlock("birch_wreath_lights_white_door",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).notSolid().hardnessAndResistance(0.5F, 2.0F).setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> OAK_WREATH_LIGHTS_WHITE_DOOR = registerBlock("oak_wreath_lights_white_door",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).notSolid().hardnessAndResistance(0.5F, 2.0F).setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SPRUCE_WREATH_LIGHTS_WHITE_DOOR = registerBlock("spruce_wreath_lights_white_door",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).notSolid().hardnessAndResistance(0.5F, 2.0F).setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DARK_OAK_WREATH_LIGHTS_WHITE_DOOR = registerBlock("dark_oak_wreath_lights_white_door",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).notSolid().hardnessAndResistance(0.5F, 2.0F).setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JUNGLE_WREATH_LIGHTS_WHITE_DOOR = registerBlock("jungle_wreath_lights_white_door",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).notSolid().hardnessAndResistance(0.5F, 2.0F).setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CRIMSON_WREATH_LIGHTS_WHITE_DOOR = registerBlock("crimson_wreath_lights_white_door",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).notSolid().hardnessAndResistance(0.5F, 2.0F).setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WARPED_WREATH_LIGHTS_WHITE_DOOR = registerBlock("warped_wreath_lights_white_door",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).notSolid().hardnessAndResistance(0.5F, 2.0F).setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> IRON_WREATH_LIGHTS_WHITE_DOOR = registerBlock("iron_wreath_lights_white_door",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).notSolid().hardnessAndResistance(0.5F, 2.0F).setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> ACACIA_WREATH_LIGHTS_MULTI_DOOR = registerBlock("acacia_wreath_lights_multi_door",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).notSolid().hardnessAndResistance(0.5F, 2.0F).setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BIRCH_WREATH_LIGHTS_MULTI_DOOR = registerBlock("birch_wreath_lights_multi_door",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).notSolid().hardnessAndResistance(0.5F, 2.0F).setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> OAK_WREATH_LIGHTS_MULTI_DOOR = registerBlock("oak_wreath_lights_multi_door",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).notSolid().hardnessAndResistance(0.5F, 2.0F).setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SPRUCE_WREATH_LIGHTS_MULTI_DOOR = registerBlock("spruce_wreath_lights_multi_door",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).notSolid().hardnessAndResistance(0.5F, 2.0F).setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DARK_OAK_WREATH_LIGHTS_MULTI_DOOR = registerBlock("dark_oak_wreath_lights_multi_door",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).notSolid().hardnessAndResistance(0.5F, 2.0F).setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JUNGLE_WREATH_LIGHTS_MULTI_DOOR = registerBlock("jungle_wreath_lights_multi_door",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).notSolid().hardnessAndResistance(0.5F, 2.0F).setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CRIMSON_WREATH_LIGHTS_MULTI_DOOR = registerBlock("crimson_wreath_lights_multi_door",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).notSolid().hardnessAndResistance(0.5F, 2.0F).setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WARPED_WREATH_LIGHTS_MULTI_DOOR = registerBlock("warped_wreath_lights_multi_door",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).notSolid().hardnessAndResistance(0.5F, 2.0F).setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> IRON_WREATH_LIGHTS_MULTI_DOOR = registerBlock("iron_wreath_lights_multi_door",
            () -> new MaidensDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).notSolid().hardnessAndResistance(0.5F, 2.0F).setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //FENCES//

    public static final RegistryObject<Block> ACACIA_PICKET_FENCE = registerBlock("acacia_picket_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BIRCH_PICKET_FENCE = registerBlock("birch_picket_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> OAK_PICKET_FENCE = registerBlock("oak_picket_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SPRUCE_PICKET_FENCE = registerBlock("spruce_picket_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DARK_OAK_PICKET_FENCE = registerBlock("dark_oak_picket_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JUNGLE_PICKET_FENCE = registerBlock("jungle_picket_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WARPED_PICKET_FENCE = registerBlock("warped_picket_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CRIMSON_PICKET_FENCE = registerBlock("crimson_picket_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ACACIA_WREATH_FENCE = registerBlock("acacia_wreath_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BIRCH_WREATH_FENCE = registerBlock("birch_wreath_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> OAK_WREATH_FENCE = registerBlock("oak_wreath_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> SPRUCE_WREATH_FENCE = registerBlock("spruce_wreath_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DARK_OAK_WREATH_FENCE = registerBlock("dark_oak_wreath_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JUNGLE_WREATH_FENCE = registerBlock("jungle_wreath_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WARPED_WREATH_FENCE = registerBlock("warped_wreath_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CRIMSON_WREATH_FENCE = registerBlock("crimson_wreath_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ACACIA_WREATH_LIGHTS_FENCE = registerBlock("acacia_wreath_lights_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BIRCH_WREATH_LIGHTS_FENCE = registerBlock("birch_wreath_lights_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> OAK_WREATH_LIGHTS_FENCE = registerBlock("oak_wreath_lights_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SPRUCE_WREATH_LIGHTS_FENCE = registerBlock("spruce_wreath_lights_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DARK_OAK_WREATH_LIGHTS_FENCE = registerBlock("dark_oak_wreath_lights_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JUNGLE_WREATH_LIGHTS_FENCE = registerBlock("jungle_wreath_lights_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WARPED_WREATH_LIGHTS_FENCE = registerBlock("warped_wreath_lights_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CRIMSON_WREATH_LIGHTS_FENCE = registerBlock("crimson_wreath_lights_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ACACIA_WREATH_MULTI_FENCE = registerBlock("acacia_wreath_multi_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BIRCH_WREATH_MULTI_FENCE = registerBlock("birch_wreath_multi_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> OAK_WREATH_MULTI_FENCE = registerBlock("oak_wreath_multi_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SPRUCE_WREATH_MULTI_FENCE = registerBlock("spruce_wreath_multi_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DARK_OAK_WREATH_MULTI_FENCE = registerBlock("dark_oak_wreath_multi_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JUNGLE_WREATH_MULTI_FENCE = registerBlock("jungle_wreath_multi_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WARPED_WREATH_MULTI_FENCE = registerBlock("warped_wreath_multi_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CRIMSON_WREATH_MULTI_FENCE = registerBlock("crimson_wreath_multi_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.4F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //GATES//

    public static final RegistryObject<Block> ACACIA_PICKET_FENCE_GATE = registerBlock("acacia_picket_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BIRCH_PICKET_FENCE_GATE = registerBlock("birch_picket_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> OAK_PICKET_FENCE_GATE = registerBlock("oak_picket_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SPRUCE_PICKET_FENCE_GATE = registerBlock("spruce_picket_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DARK_OAK_PICKET_FENCE_GATE = registerBlock("dark_oak_picket_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JUNGLE_PICKET_FENCE_GATE = registerBlock("jungle_picket_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WARPED_PICKET_FENCE_GATE = registerBlock("warped_picket_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CRIMSON_PICKET_FENCE_GATE = registerBlock("crimson_picket_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ACACIA_WREATH_FENCE_GATE = registerBlock("acacia_wreath_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BIRCH_WREATH_FENCE_GATE = registerBlock("birch_wreath_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> OAK_WREATH_FENCE_GATE = registerBlock("oak_wreath_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SPRUCE_WREATH_FENCE_GATE = registerBlock("spruce_wreath_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DARK_OAK_WREATH_FENCE_GATE = registerBlock("dark_oak_wreath_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JUNGLE_WREATH_FENCE_GATE = registerBlock("jungle_wreath_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WARPED_WREATH_FENCE_GATE = registerBlock("warped_wreath_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CRIMSON_WREATH_FENCE_GATE = registerBlock("crimson_wreath_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ACACIA_WREATH_LIGHTS_FENCE_GATE = registerBlock("acacia_wreath_lights_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BIRCH_WREATH_LIGHTS_FENCE_GATE = registerBlock("birch_wreath_lights_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> OAK_WREATH_LIGHTS_FENCE_GATE = registerBlock("oak_wreath_lights_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SPRUCE_WREATH_LIGHTS_FENCE_GATE = registerBlock("spruce_wreath_lights_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DARK_OAK_WREATH_LIGHTS_FENCE_GATE = registerBlock("dark_oak_wreath_lights_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JUNGLE_WREATH_LIGHTS_FENCE_GATE = registerBlock("jungle_wreath_lights_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WARPED_WREATH_LIGHTS_FENCE_GATE = registerBlock("warped_wreath_lights_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CRIMSON_WREATH_LIGHTS_FENCE_GATE = registerBlock("crimson_wreath_lights_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ACACIA_WREATH_MULTI_FENCE_GATE = registerBlock("acacia_wreath_multi_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BIRCH_WREATH_MULTI_FENCE_GATE = registerBlock("birch_wreath_multi_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> OAK_WREATH_MULTI_FENCE_GATE = registerBlock("oak_wreath_multi_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SPRUCE_WREATH_MULTI_FENCE_GATE = registerBlock("spruce_wreath_multi_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DARK_OAK_WREATH_MULTI_FENCE_GATE = registerBlock("dark_oak_wreath_multi_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JUNGLE_WREATH_MULTI_FENCE_GATE = registerBlock("jungle_wreath_multi_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WARPED_WREATH_MULTI_FENCE_GATE = registerBlock("warped_wreath_multi_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CRIMSON_WREATH_MULTI_FENCE_GATE = registerBlock("crimson_wreath_multi_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //GARLAND-DECORATED WALLS//

    //WALLS//
    public static final RegistryObject<Block> COBBLESTONE_GARLAND_WALL = registerBlock("cobblestone_garland_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> COBBLESTONE_GARLAND_LIGHTS_WALL = registerBlock("cobblestone_garland_lights_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> COBBLESTONE_GARLAND_MULTI_WALL = registerBlock("cobblestone_garland_multi_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ANDESITE_GARLAND_WALL = registerBlock("andesite_garland_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ANDESITE_GARLAND_LIGHTS_WALL = registerBlock("andesite_garland_lights_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ANDESITE_GARLAND_MULTI_WALL = registerBlock("andesite_garland_multi_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> MOSSY_COBBLESTONE_GARLAND_WALL = registerBlock("mossy_cobblestone_garland_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MOSSY_COBBLESTONE_GARLAND_LIGHTS_WALL = registerBlock("mossy_cobblestone_garland_lights_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MOSSY_COBBLESTONE_GARLAND_MULTI_WALL = registerBlock("mossy_cobblestone_garland_multi_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BRICK_GARLAND_WALL = registerBlock("brick_garland_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BRICK_GARLAND_LIGHTS_WALL = registerBlock("brick_garland_lights_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BRICK_GARLAND_MULTI_WALL = registerBlock("brick_garland_multi_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PRISMARINE_GARLAND_WALL = registerBlock("prismarine_garland_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PRISMARINE_GARLAND_LIGHTS_WALL = registerBlock("prismarine_garland_lights_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PRISMARINE_GARLAND_MULTI_WALL = registerBlock("prismarine_garland_multi_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> RED_SANDSTONE_GARLAND_WALL = registerBlock("red_sandstone_garland_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> RED_SANDSTONE_GARLAND_LIGHTS_WALL = registerBlock("red_sandstone_garland_lights_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> RED_SANDSTONE_GARLAND_MULTI_WALL = registerBlock("red_sandstone_garland_multi_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRANITE_GARLAND_WALL = registerBlock("granite_garland_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRANITE_GARLAND_LIGHTS_WALL = registerBlock("granite_garland_lights_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRANITE_GARLAND_MULTI_WALL = registerBlock("granite_garland_multi_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> STONE_BRICK_GARLAND_WALL = registerBlock("stone_brick_garland_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> STONE_BRICK_GARLAND_LIGHTS_WALL = registerBlock("stone_brick_garland_lights_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> STONE_BRICK_GARLAND_MULTI_WALL = registerBlock("stone_brick_garland_multi_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> NETHER_BRICK_GARLAND_WALL = registerBlock("nether_brick_garland_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> NETHER_BRICK_GARLAND_LIGHTS_WALL = registerBlock("nether_brick_garland_lights_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> NETHER_BRICK_GARLAND_MULTI_WALL = registerBlock("nether_brick_garland_multi_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> RED_NETHER_BRICK_GARLAND_WALL = registerBlock("red_nether_brick_garland_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> RED_NETHER_BRICK_GARLAND_LIGHTS_WALL = registerBlock("red_nether_brick_garland_lights_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> RED_NETHER_BRICK_GARLAND_MULTI_WALL = registerBlock("red_nether_brick_garland_multi_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SANDSTONE_GARLAND_WALL = registerBlock("sandstone_garland_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SANDSTONE_GARLAND_LIGHTS_WALL = registerBlock("sandstone_garland_lights_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SANDSTONE_GARLAND_MULTI_WALL = registerBlock("sandstone_garland_multi_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> END_STONE_GARLAND_WALL = registerBlock("end_stone_brick_garland_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> END_STONE_GARLAND_LIGHTS_WALL = registerBlock("end_stone_brick_garland_lights_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> END_STONE_GARLAND_MULTI_WALL = registerBlock("end_stone_brick_garland_multi_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DIORITE_GARLAND_WALL = registerBlock("diorite_garland_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DIORITE_GARLAND_LIGHTS_WALL = registerBlock("diorite_garland_lights_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DIORITE_GARLAND_MULTI_WALL = registerBlock("diorite_garland_multi_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACKSTONE_GARLAND_WALL = registerBlock("blackstone_garland_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACKSTONE_GARLAND_LIGHTS_WALL = registerBlock("blackstone_garland_lights_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACKSTONE_GARLAND_MULTI_WALL = registerBlock("blackstone_garland_multi_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_GARLAND_WALL = registerBlock("polished_blackstone_garland_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_GARLAND_LIGHTS_WALL = registerBlock("polished_blackstone_garland_lights_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_GARLAND_MULTI_WALL = registerBlock("polished_blackstone_garland_multi_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICK_GARLAND_WALL = registerBlock("polished_blackstone_brick_garland_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICK_GARLAND_LIGHTS_WALL = registerBlock("polished_blackstone_brick_garland_lights_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICK_GARLAND_MULTI_WALL = registerBlock("polished_blackstone_brick_garland_multi_wall", () -> new WallBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(0.6F, 2.5F).notSolid().setLightLevel((p_50828_) -> {
        return 12;
    })), ModItemGroups.MAIDENS_BLOCKS_GROUP);



    //LEAVES-BUSHES//
    public static final RegistryObject<Block> SPRUCE_LEAVES_HOLLY = registerBlock("spruce_leaves_holly",
            () -> new Block(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F, 2.5F).notSolid().sound(SoundType.PLANT)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SPRUCE_LEAVES_LIGHTS_WHITE = registerBlock("spruce_leaves_lights_white",
            () -> new Block(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F, 2.5F).notSolid().sound(SoundType.PLANT).setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SPRUCE_LEAVES_LIGHTS_LARGE_WHITE = registerBlock("spruce_leaves_lights_large_white",
            () -> new Block(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F, 2.5F).notSolid().sound(SoundType.PLANT).setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SPRUCE_LEAVES_LIGHTS_MULTI = registerBlock("spruce_leaves_lights_multi",
            () -> new Block(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F, 2.5F).notSolid().sound(SoundType.PLANT).setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SPRUCE_LEAVES_LIGHTS_LARGE_MULTI = registerBlock("spruce_leaves_lights_large_multi",
            () -> new Block(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F, 2.5F).notSolid().sound(SoundType.PLANT).setLightLevel((p_50828_) -> {
                return 12;
            })), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, ItemGroup maidensBlocksGroup) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ModItemGroups.MAIDENS_BLOCKS_GROUP)));
    }

    private static <R extends Block> RegistryObject<R> registerWithNullGroup(String name, Supplier<R> block){

        RegistryObject<R> toReturn2 = BLOCKS.register(name, block);
        ModItems.ITEMS.register(name, ()-> new BlockItem(toReturn2.get(),
                new Item.Properties().group(null)));
        return toReturn2;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}

