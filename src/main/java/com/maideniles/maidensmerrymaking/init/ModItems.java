package com.maideniles.maidensmerrymaking.init;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.items.*;
import com.maideniles.maidensmerrymaking.items.armor.RedChristmasArmorItem;
import com.maideniles.maidensmerrymaking.items.armor.ReindeerEarsArmorItem;
import com.maideniles.maidensmerrymaking.items.armor.model.BunnyHoodArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MaidensMerryMaking.MOD_ID);


    public static final RegistryObject<Item> CHRISTMAS_TREE = ITEMS.register("christmas_tree",
            () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    // public static final RegistryObject<Item> CHRISTMAS_TREE_LIGHTS_WHITE = ITEMS.register("christmas_tree_white_lights",
    //          () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    //  public static final RegistryObject<Item> CHRISTMAS_TREE_LIGHTS_MULTI = ITEMS.register("christmas_tree_multi_lights",
    //         () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> ROOF_TILES= ITEMS.register( "roof_tiles",
            () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    //MUSIC DISC//
    public static final RegistryObject<Item> CHRISTMAS_DISC = ITEMS.register("christmas_music_disc",
            () -> new MusicDiscItem(1, () -> ModSoundEvents.CHRISTMAS_MUSIC_DISC.get(),
                    new Item.Properties().maxStackSize(1).group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> CHRISTMAS_DISC_2 = ITEMS.register("christmas_music_disc_2",
            () -> new MusicDiscItem(1, () -> ModSoundEvents.CHRISTMAS_MUSIC_DISC_2.get(),
                    new Item.Properties().maxStackSize(1).group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    //TOPPERS//
    public static final RegistryObject<Item> BOW= ITEMS.register( "bow",
            () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> STAR = ITEMS.register( "star",
            () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> STOCKING = ITEMS.register("stocking",
            () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> MUG = ITEMS.register( "mug",
            () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    //BULBS AND WIRES//
    public static final RegistryObject<Item> MULTI_BULBS = ITEMS.register("multi_bulbs",
            () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> WHITE_BULBS = ITEMS.register( "white_bulbs",
            () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> WHITE_WIRES = ITEMS.register("white_wires",
            () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> GREEN_WIRES = ITEMS.register("green_wires",
            () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    //LIGHT STRANDS//
    public static final RegistryObject<Item> CLASSIC_LIGHTS_WHITE = ITEMS.register("classic_lights_white",
            () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> CLASSIC_LIGHTS_MULTI = ITEMS.register("classic_lights_multi",
            () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> ICICLE_LIGHTS_WHITE = ITEMS.register("icicle_lights_white",
            () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> ICICLE_LIGHTS_MULTI = ITEMS.register("icicle_lights_multi",
            () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> MINI_LIGHTS_WHITE = ITEMS.register("mini_lights_white",
            () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> MINI_LIGHTS_MULTI = ITEMS.register("mini_lights_multi",
            () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> TWINKLING_LIGHTS_WHITE = ITEMS.register("twinkling_lights_white",
            () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> TWINKLING_LIGHTS_MULTI = ITEMS.register("twinkling_lights_multi",
            () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> ORNAMENTS = ITEMS.register("ornaments",
            () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> ORNAMENTS_WHITE = ITEMS.register("ornaments_white",
            () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));



    //CROP SEEDS//
    public static final RegistryObject<Item> GINGER_ROOT = ITEMS.register( "ginger_root",
            () ->  new BlockItem(ModBlocks.GINGER_PLANT.get(), (new Item.Properties()).food(Foods.APPLE).group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> MINT_SEEDS = ITEMS.register("mint_seeds",
            () -> new BlockItem(ModBlocks.MINT_PLANT.get(), new Item.Properties()
                    .food(new Food.Builder().hunger(1).saturation(0.1f).build()).group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    //CROP ITEMS//
    public static final RegistryObject<Item> MINT_LEAF = ITEMS.register( "mint_leaf",
            () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item>CORN = ITEMS.register("corn",
            () -> new Item(new Item.Properties().food(Foods.APPLE).group(ModItemGroups.MAIDENS_ITEMS_GROUP)));


    public static final RegistryObject<Item> CORN_KERNELS = ITEMS.register("corn_kernels",
            () -> new BlockItem(ModBlocks.CORN_STALK.get(), new Item.Properties()
                    .food(new Food.Builder().hunger(1).saturation(0.1f).build()).group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    //HANUKKAH TREAT//
    public static final RegistryObject<Item> RUGELACH = ITEMS.register("rugelach",
            ()-> new Item( new Item.Properties().food(Foods.APPLE).group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    //KWANZAA TREAT//

    public static final RegistryObject<Item> SWEET_POTATO = ITEMS.register( "sweet_potato",
            () ->  new BlockItem(ModBlocks.SWEET_POTATO_PLANT.get(), (new Item.Properties()).food(Foods.APPLE).group(ModItemGroups.MAIDENS_ITEMS_GROUP)));


    public static final RegistryObject<Item>SWEET_POTATO_PIE = ITEMS.register("sweet_potato_pie",
            () -> new Item(new Item.Properties().food(Foods.PUMPKIN_PIE).group(ModItemGroups.MAIDENS_ITEMS_GROUP)));



    //CHRISTMAS TREATS AND INGREDIENTS//
    public static final RegistryObject<Item>TREE_CHRISTMAS_COOKIE = ITEMS.register("tree_christmas_cookie",
            () -> new Item(new Item.Properties().food(Foods.APPLE).group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item>STOCKING_CHRISTMAS_COOKIE = ITEMS.register("stocking_christmas_cookie",
            () -> new Item(new Item.Properties().food(Foods.APPLE).group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item>MITTEN_CHRISTMAS_COOKIE = ITEMS.register("mitten_christmas_cookie",
            () -> new Item(new Item.Properties().food(Foods.APPLE).group(ModItemGroups.MAIDENS_ITEMS_GROUP)));


    public static final RegistryObject<Item>CANDY_CANE = ITEMS.register("candy_cane",
            () -> new Item(new Item.Properties().food(Foods.APPLE).group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item>GINGERBREAD_DOUGH = ITEMS.register("gingerbread_dough",
            () -> new Item(new Item.Properties().food(Foods.APPLE).group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item>COOKIE_DOUGH = ITEMS.register("cookie_dough",
            () -> new Item(new Item.Properties().food(Foods.APPLE).group(ModItemGroups.MAIDENS_ITEMS_GROUP)));


    public static final RegistryObject<Item>HOT_COCOA = ITEMS.register("hot_cocoa",
            () -> new Item(new Item.Properties().food(Foods.APPLE).group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item>EGG_NOG = ITEMS.register("egg_nog",
            () -> new Item(new Item.Properties().food(Foods.APPLE).group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item>GINGERBREAD_COOKIE = ITEMS.register("gingerbread_cookie",
            () -> new Item(new Item.Properties().food(Foods.APPLE).group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item>FUDGE = ITEMS.register("fudge",
            () -> new Item(new Item.Properties().food(Foods.APPLE).group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item>PEPPERMINT_COCOA = ITEMS.register("peppermint_cocoa",
            () -> new Item(new Item.Properties().food(Foods.APPLE).group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item>PEPPERMINT_EXTRACT = ITEMS.register("peppermint_extract",
            () -> new Item(new Item.Properties().food(Foods.APPLE).group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item>GROUND_GINGER = ITEMS.register("ground_ginger",
            () -> new Item(new Item.Properties().food(Foods.APPLE).group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item>ICING = ITEMS.register("icing",
            () -> new Item(new Item.Properties().food(Foods.APPLE).group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item>FRUITCAKE = ITEMS.register("fruitcake",
            () -> new Item(new Item.Properties().food(Foods.APPLE).group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> BOTTLE_OF_MINT = ITEMS.register("bottle_of_mint",
            () -> new MintBottleItem(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> CANDLES = ITEMS.register("candle",
            () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> CANDLES_RED = ITEMS.register("red_candle",
            () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> CANDLES_BLACK = ITEMS.register("black_candle",
            () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> CANDLES_GREEN = ITEMS.register("green_candle",
            () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));


    //ARMOR--NOT QUITE READY YET BUT GETTING THERE//
    public static final RegistryObject<Item> SANTA_HAT_RED = ITEMS.register("red_santa_hat",
            () -> new RedChristmasArmorItem(ModArmorMaterial.RED_SANTA_HAT, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> UGLY_SWEATER_RED = ITEMS.register("red_ugly_christmas_sweater",
            () -> new ArmorItem(ModArmorMaterial.RED_WOOL, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> PLAID_PAJAMA_PANTS = ITEMS.register("plaid_pajama_pants",
            () -> new ArmorItem(ModArmorMaterial.RED_WOOL, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> REINDEER_SLIPPERS = ITEMS.register("reindeer_slippers",
            () -> new ArmorItem(ModArmorMaterial.RED_WOOL, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> REINDEER_EARS = ITEMS.register("reindeer_ears",
            () -> new ReindeerEarsArmorItem(ModArmorMaterial.REINDEER_EARS, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> UGLY_SWEATER_GREEN = ITEMS.register("green_ugly_christmas_sweater",
            () -> new ArmorItem(ModArmorMaterial.GREEN_WOOL, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> STRIPED_PAJAMA_PANTS = ITEMS.register("striped_pajama_pants",
            () -> new ArmorItem(ModArmorMaterial.GREEN_WOOL, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> SANTA_SLIPPERS = ITEMS.register("santa_slippers",
            () -> new ArmorItem(ModArmorMaterial.GREEN_WOOL, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> FOUR_LEAF_CLOVER = ITEMS.register("four_leaf_clover",
            () -> new CloverItem(new Item.Properties().maxDamage(50).group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> GREEN_BEER = ITEMS.register("green_beer",
            () -> new GreenBeerItem(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> LUCKY_HAT = ITEMS.register("lucky_hat",
            () -> new Item(new Item.Properties().group(null)));

    //BEGIN EASTER ITEMS//
    public static final RegistryObject<Item> ANGORA_WOOL = ITEMS.register("angora_wool",
            () -> new AngoraWoolItem(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> EASTER_CARD = ITEMS.register("easter_card",
            () -> new CardItem(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> CHOCOLATE_BUNNY = ITEMS.register("chocolate_bunny",
            () -> new ChocolateBunnyItem( new Item.Properties().food(new Food.Builder().hunger(4).saturation(1.2F)
                    .setAlwaysEdible().build()).group(ModItemGroups.MAIDENS_ITEMS_GROUP)));
//CHICKEN EASTER EGG DROPS//
    public static final RegistryObject<Item> PURPLE_EGG = ITEMS.register("purple_egg",
            () -> new EggItem(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> PINK_EGG = ITEMS.register("pink_egg",
            () -> new EggItem(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> BLUE_EGG = ITEMS.register("blue_egg",
            () -> new EggItem(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> YELLOW_EGG = ITEMS.register("yellow_egg",
            () -> new EggItem(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));


    public static final RegistryObject<ModSpawnEggItem> COLORED_CHICKEN_SPAWN_EGG = ITEMS.register("colored_chicken_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.COLORED_CHICKEN, 16777215, 15789322,
                    new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<ModSpawnEggItem> PINK_BUNNY_SPAWN_EGG = ITEMS.register("pink_bunny_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.PINK_BUNNY, 15315927, 14109586,
                    new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<ModSpawnEggItem> PURPLE_BUNNY_SPAWN_EGG = ITEMS.register("purple_bunny_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.PURPLE_BUNNY, 13811433, 8671172,
                    new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));


    public static final RegistryObject<ModSpawnEggItem> BLUE_BUNNY_SPAWN_EGG = ITEMS.register("blue_bunny_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.BLUE_BUNNY, 11455972, 3512029,
                    new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));


    public static final RegistryObject<ModSpawnEggItem> CYAN_BUNNY_SPAWN_EGG = ITEMS.register("cyan_bunny_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.CYAN_BUNNY, 11461860, 4243391,
                    new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));


    public static final RegistryObject<ModSpawnEggItem> YELLOW_BUNNY_SPAWN_EGG = ITEMS.register("yellow_bunny_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.YELLOW_BUNNY, 16448700, 13158233,
                    new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> BUNNY_HOOD = ITEMS.register("bunny_hood",
            () -> new BunnyHoodArmorItem(ModArmorMaterial.ANGORA_WOOL, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> BUNNY_COSTUME = ITEMS.register("bunny_costume",
            () -> new ArmorItem(ModArmorMaterial.ANGORA_WOOL, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> BUNNY_PANTS = ITEMS.register("bunny_pants",
            () -> new ArmorItem(ModArmorMaterial.ANGORA_WOOL, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> BUNNY_FEET = ITEMS.register("bunny_feet",
            () -> new ArmorItem(ModArmorMaterial.ANGORA_WOOL, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> BUNNY_FACE = ITEMS.register("bunny_face",
            () -> new Item(new Item.Properties().group(null)));












    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
