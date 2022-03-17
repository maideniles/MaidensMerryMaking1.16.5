package com.maideniles.maidensmerrymaking.client;


import com.maideniles.maidensmerrymaking.init.ModBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class RenderLayers {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {

        RenderTypeLookup.setRenderLayer(ModBlocks.MKEKA_WITH_CORN_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MKEKA_WITH_CORN_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MKEKA_WITH_CORN_3.get(), RenderType.getCutoutMipped());

        //LOGS//
        RenderTypeLookup.setRenderLayer(ModBlocks.FIREPLACE_LOGS.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.FIREPLACE_LOGS_ON.get(), RenderType.getCutoutMipped());
        //LAMP POSTS//
        RenderTypeLookup.setRenderLayer(ModBlocks.LAMP_POST_POLE_WREATH.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LAMP_POST_POLE_WREATH_MULTI.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LAMP_POST_POLE_WREATH_WHITE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.LAMP_POST_POLE_BOW.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.CHRISTMAS_WREATH.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CHRISTMAS_WREATH_MULTI_LIGHTS.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CHRISTMAS_WREATH_WHITE_LIGHTS.get(), RenderType.getCutoutMipped());

        //CLASSIC LIGHTS//

        RenderTypeLookup.setRenderLayer(ModBlocks.CLASSIC_LIGHTS.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CLASSIC_LIGHTS_DIAGONAL_LEFT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CLASSIC_LIGHTS_DIAGONAL_RIGHT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CLASSIC_LIGHTS_CAP.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.CLASSIC_LIGHTS_VERTICAL_LEFT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CLASSIC_LIGHTS_VERTICAL_RIGHT.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.CLASSIC_LIGHTS_VERTICAL_CORNER_LEFT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CLASSIC_LIGHTS_VERTICAL_CORNER_RIGHT.get(), RenderType.getCutoutMipped());


        //CLASSIC MULTI COLORED//
        RenderTypeLookup.setRenderLayer(ModBlocks.CLASSIC_MULTI.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CLASSIC_MULTI_DIAGONAL_LEFT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CLASSIC_MULTI_DIAGONAL_RIGHT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CLASSIC_MULTI_CAP.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.CLASSIC_MULTI_VERTICAL_LEFT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CLASSIC_MULTI_VERTICAL_RIGHT.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.CLASSIC_MULTI_VERTICAL_CORNER_LEFT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CLASSIC_MULTI_VERTICAL_CORNER_RIGHT.get(), RenderType.getCutoutMipped());

        //ICICLE LIGHTS//
        RenderTypeLookup.setRenderLayer(ModBlocks.ICICLE_LIGHTS.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.ICICLE_LIGHTS_DIAGONAL_LEFT.get(),  RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.ICICLE_LIGHTS_DIAGONAL_RIGHT.get(),  RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.ICICLE_LIGHTS_CAP.get(),  RenderType.getTranslucent());

        //ICICLE MULTI COLORED//
        RenderTypeLookup.setRenderLayer(ModBlocks.ICICLE_MULTI.get(),  RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.ICICLE_MULTI_DIAGONAL_LEFT.get(),  RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.ICICLE_MULTI_DIAGONAL_RIGHT.get(),  RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.ICICLE_MULTI_CAP.get(),  RenderType.getTranslucent());

        //TWINKLING_ICICLE LIGHTS//
        RenderTypeLookup.setRenderLayer(ModBlocks.TWINKLING_ICICLE_LIGHTS.get(),  RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.TWINKLING_ICICLE_LIGHTS_DIAGONAL_LEFT.get(),  RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.TWINKLING_ICICLE_LIGHTS_DIAGONAL_RIGHT.get(),  RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.TWINKLING_ICICLE_LIGHTS_CAP.get(),  RenderType.getTranslucent());
        //TWINKLING_ICICLE MULTI COLORED//
        RenderTypeLookup.setRenderLayer(ModBlocks.TWINKLING_ICICLE_MULTI.get(),  RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.TWINKLING_ICICLE_MULTI_DIAGONAL_LEFT.get(),  RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.TWINKLING_ICICLE_MULTI_DIAGONAL_RIGHT.get(),  RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.TWINKLING_ICICLE_MULTI_CAP.get(),  RenderType.getTranslucent());


//MINI LIGHTS//
        RenderTypeLookup.setRenderLayer(ModBlocks.MINI_LIGHTS.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MINI_LIGHTS_DIAGONAL_LEFT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MINI_LIGHTS_DIAGONAL_RIGHT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MINI_LIGHTS_CAP.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MINI_LIGHTS_VERTICAL_LEFT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MINI_LIGHTS_VERTICAL_RIGHT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MINI_CORNER_LIGHTS_VERTICAL_LEFT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MINI_CORNER_LIGHTS_VERTICAL_RIGHT.get(), RenderType.getCutoutMipped());

        //MINI MULTI COLORED//
        RenderTypeLookup.setRenderLayer(ModBlocks.MINI_MULTI.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MINI_MULTI_DIAGONAL_LEFT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MINI_MULTI_DIAGONAL_RIGHT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MINI_MULTI_CAP.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MINI_MULTI_VERTICAL_LEFT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MINI_MULTI_VERTICAL_RIGHT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MINI_CORNER_MULTI_VERTICAL_RIGHT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MINI_CORNER_MULTI_VERTICAL_LEFT.get(), RenderType.getCutoutMipped());
//GARLAND BLOCKS--DIAGONAL//

        RenderTypeLookup.setRenderLayer(ModBlocks.GARLAND_DIAGONAL_LEFT.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.GARLAND_DIAGONAL_RIGHT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GARLAND_LIGHTS_DIAGONAL_LEFT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GARLAND_LIGHTS_DIAGONAL_RIGHT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GARLAND_MULTI_DIAGONAL_LEFT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GARLAND_MULTI_DIAGONAL_RIGHT.get(), RenderType.getCutoutMipped());


        //GARLAND BLOCKS--HORIZONTAL//
        RenderTypeLookup.setRenderLayer(ModBlocks.GARLAND_HORIZONTAL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GARLAND_HORIZONTAL_LIGHTS_WHITE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GARLAND_HORIZONTAL_LIGHTS_MULTI.get(), RenderType.getCutoutMipped());

        //GARLAND VERTICAL//
        RenderTypeLookup.setRenderLayer(ModBlocks.GARLAND_VERTICAL_LIGHTS_MULTI_RIGHT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GARLAND_VERTICAL_LIGHTS_WHITE_RIGHT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GARLAND_VERTICAL_LIGHTS_MULTI_LEFT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GARLAND_VERTICAL_LIGHTS_WHITE_LEFT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GARLAND_VERTICAL_LEFT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GARLAND_VERTICAL_RIGHT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GARLAND_VERTICAL_CORNER_LEFT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GARLAND_VERTICAL_CORNER_RIGHT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GARLAND_VERTICAL_CORNER_LIGHTS_LEFT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GARLAND_VERTICAL_CORNER_LIGHTS_RIGHT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GARLAND_VERTICAL_CORNER_MULTI_LEFT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GARLAND_VERTICAL_CORNER_MULTI_RIGHT.get(), RenderType.getCutoutMipped());


        //DOORS & FENCES//
        RenderTypeLookup.setRenderLayer(ModBlocks.ACACIA_WREATH_DOOR.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ACACIA_WREATH_LIGHTS_WHITE_DOOR.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ACACIA_WREATH_LIGHTS_MULTI_DOOR.get(), RenderType.getCutoutMipped());


        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_WREATH_DOOR.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_WREATH_LIGHTS_WHITE_DOOR.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_WREATH_LIGHTS_MULTI_DOOR.get(), RenderType.getCutoutMipped());


        RenderTypeLookup.setRenderLayer(ModBlocks.OAK_WREATH_DOOR.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.OAK_WREATH_LIGHTS_WHITE_DOOR.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.OAK_WREATH_LIGHTS_MULTI_DOOR.get(), RenderType.getCutoutMipped());


        RenderTypeLookup.setRenderLayer(ModBlocks.SPRUCE_WREATH_DOOR.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SPRUCE_WREATH_LIGHTS_WHITE_DOOR.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SPRUCE_WREATH_LIGHTS_MULTI_DOOR.get(), RenderType.getCutoutMipped());


        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_OAK_WREATH_DOOR.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_OAK_WREATH_LIGHTS_WHITE_DOOR.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_OAK_WREATH_LIGHTS_MULTI_DOOR.get(), RenderType.getCutoutMipped());


        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_WREATH_DOOR.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_WREATH_LIGHTS_WHITE_DOOR.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_WREATH_LIGHTS_MULTI_DOOR.get(), RenderType.getCutoutMipped());


        RenderTypeLookup.setRenderLayer(ModBlocks.WARPED_WREATH_DOOR.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WARPED_WREATH_LIGHTS_WHITE_DOOR.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WARPED_WREATH_LIGHTS_MULTI_DOOR.get(), RenderType.getCutoutMipped());


        RenderTypeLookup.setRenderLayer(ModBlocks.CRIMSON_WREATH_DOOR.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CRIMSON_WREATH_LIGHTS_WHITE_DOOR.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CRIMSON_WREATH_LIGHTS_MULTI_DOOR.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.IRON_WREATH_DOOR.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.IRON_WREATH_LIGHTS_WHITE_DOOR.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.IRON_WREATH_LIGHTS_MULTI_DOOR.get(), RenderType.getCutoutMipped());


        RenderTypeLookup.setRenderLayer(ModBlocks.ACACIA_PICKET_FENCE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ACACIA_WREATH_FENCE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ACACIA_WREATH_LIGHTS_FENCE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ACACIA_WREATH_MULTI_FENCE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_WREATH_FENCE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_PICKET_FENCE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_WREATH_LIGHTS_FENCE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_WREATH_MULTI_FENCE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.OAK_WREATH_FENCE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.OAK_PICKET_FENCE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.OAK_WREATH_LIGHTS_FENCE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.OAK_WREATH_MULTI_FENCE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SPRUCE_WREATH_FENCE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SPRUCE_PICKET_FENCE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SPRUCE_WREATH_LIGHTS_FENCE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SPRUCE_WREATH_MULTI_FENCE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_OAK_WREATH_FENCE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_OAK_PICKET_FENCE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_OAK_WREATH_LIGHTS_FENCE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_OAK_WREATH_MULTI_FENCE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_WREATH_FENCE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_PICKET_FENCE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_WREATH_LIGHTS_FENCE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_WREATH_MULTI_FENCE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WARPED_WREATH_FENCE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WARPED_PICKET_FENCE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WARPED_WREATH_LIGHTS_FENCE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WARPED_WREATH_MULTI_FENCE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CRIMSON_WREATH_FENCE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CRIMSON_PICKET_FENCE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CRIMSON_WREATH_LIGHTS_FENCE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CRIMSON_WREATH_MULTI_FENCE.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.ACACIA_PICKET_FENCE_GATE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_PICKET_FENCE_GATE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.OAK_PICKET_FENCE_GATE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_OAK_PICKET_FENCE_GATE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SPRUCE_PICKET_FENCE_GATE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_PICKET_FENCE_GATE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WARPED_PICKET_FENCE_GATE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CRIMSON_PICKET_FENCE_GATE.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.ACACIA_WREATH_FENCE_GATE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ACACIA_WREATH_LIGHTS_FENCE_GATE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ACACIA_WREATH_MULTI_FENCE_GATE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_WREATH_FENCE_GATE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_WREATH_LIGHTS_FENCE_GATE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_WREATH_MULTI_FENCE_GATE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.OAK_WREATH_FENCE_GATE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.OAK_WREATH_LIGHTS_FENCE_GATE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.OAK_WREATH_MULTI_FENCE_GATE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SPRUCE_WREATH_FENCE_GATE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SPRUCE_WREATH_LIGHTS_FENCE_GATE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SPRUCE_WREATH_MULTI_FENCE_GATE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_OAK_WREATH_FENCE_GATE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_OAK_WREATH_LIGHTS_FENCE_GATE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_OAK_WREATH_MULTI_FENCE_GATE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_WREATH_FENCE_GATE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_WREATH_LIGHTS_FENCE_GATE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_WREATH_MULTI_FENCE_GATE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WARPED_WREATH_FENCE_GATE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WARPED_WREATH_LIGHTS_FENCE_GATE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.WARPED_WREATH_MULTI_FENCE_GATE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CRIMSON_WREATH_FENCE_GATE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CRIMSON_WREATH_LIGHTS_FENCE_GATE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CRIMSON_WREATH_MULTI_FENCE_GATE.get(), RenderType.getCutoutMipped());


//WALLS//
       RenderTypeLookup.setRenderLayer(ModBlocks.COBBLESTONE_GARLAND_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.COBBLESTONE_GARLAND_LIGHTS_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.COBBLESTONE_GARLAND_MULTI_WALL.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.MOSSY_COBBLESTONE_GARLAND_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MOSSY_COBBLESTONE_GARLAND_LIGHTS_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MOSSY_COBBLESTONE_GARLAND_MULTI_WALL.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.BRICK_GARLAND_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BRICK_GARLAND_LIGHTS_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BRICK_GARLAND_MULTI_WALL.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.PRISMARINE_GARLAND_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PRISMARINE_GARLAND_LIGHTS_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.PRISMARINE_GARLAND_MULTI_WALL.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.RED_SANDSTONE_GARLAND_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.RED_SANDSTONE_GARLAND_LIGHTS_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.RED_SANDSTONE_GARLAND_MULTI_WALL.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.GRANITE_GARLAND_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRANITE_GARLAND_LIGHTS_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRANITE_GARLAND_MULTI_WALL.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.STONE_BRICK_GARLAND_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.STONE_BRICK_GARLAND_LIGHTS_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.STONE_BRICK_GARLAND_MULTI_WALL.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.NETHER_BRICK_GARLAND_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.NETHER_BRICK_GARLAND_LIGHTS_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.NETHER_BRICK_GARLAND_MULTI_WALL.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.RED_NETHER_BRICK_GARLAND_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.RED_NETHER_BRICK_GARLAND_LIGHTS_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.RED_NETHER_BRICK_GARLAND_MULTI_WALL.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.SANDSTONE_GARLAND_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SANDSTONE_GARLAND_LIGHTS_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SANDSTONE_GARLAND_MULTI_WALL.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.END_STONE_GARLAND_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.END_STONE_GARLAND_LIGHTS_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.END_STONE_GARLAND_MULTI_WALL.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.DIORITE_GARLAND_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DIORITE_GARLAND_LIGHTS_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DIORITE_GARLAND_MULTI_WALL.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.BLACKSTONE_GARLAND_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACKSTONE_GARLAND_LIGHTS_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACKSTONE_GARLAND_MULTI_WALL.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.POLISHED_BLACKSTONE_GARLAND_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.POLISHED_BLACKSTONE_GARLAND_LIGHTS_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.POLISHED_BLACKSTONE_GARLAND_MULTI_WALL.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.POLISHED_BLACKSTONE_BRICK_GARLAND_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.POLISHED_BLACKSTONE_BRICK_GARLAND_LIGHTS_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.POLISHED_BLACKSTONE_BRICK_GARLAND_MULTI_WALL.get(), RenderType.getCutoutMipped());


        RenderTypeLookup.setRenderLayer(ModBlocks.ANDESITE_GARLAND_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ANDESITE_GARLAND_LIGHTS_WALL.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.ANDESITE_GARLAND_MULTI_WALL.get(), RenderType.getCutoutMipped());

        //MANTEL DECO//
        RenderTypeLookup.setRenderLayer(ModBlocks.MANTEL_DECO.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MANTEL_DECO_1.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MANTEL_DECO_2.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MANTEL_DECO_3.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MANTEL_DECO_4.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MANTEL_DECO_5.get(), RenderType.getCutoutMipped());
//TREES//
        RenderTypeLookup.setRenderLayer(ModBlocks.CHRISTMAS_TREE_BOTTOM.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CHRISTMAS_TREE_MIDDLE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CHRISTMAS_TREE_TOP.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CHRISTMAS_TREE_WHITE_LIGHTS_BOTTOM.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CHRISTMAS_TREE_WHITE_LIGHTS_MIDDLE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CHRISTMAS_TREE_WHITE_LIGHTS_TOP.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CHRISTMAS_TREE_MULTI_LIGHTS_BOTTOM.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CHRISTMAS_TREE_MULTI_LIGHTS_MIDDLE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CHRISTMAS_TREE_MULTI_LIGHTS_TOP.get(), RenderType.getCutoutMipped());


//GEN TREE//
        RenderTypeLookup.setRenderLayer(ModBlocks.TREE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.TREE_MIDDLE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.TREE_TOP.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CHRISTMAS_TREE_STAND.get(), RenderType.getCutoutMipped());
//TOPPERS//
        RenderTypeLookup.setRenderLayer(ModBlocks.BOW_TOPPER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.STAR_TOPPER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CHRISTMAS_TREE_STAND.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CORN_STALK.get(), RenderType.getCutoutMipped());
//HOLIDAY BLOCKS//
        RenderTypeLookup.setRenderLayer(ModBlocks.KINARA.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.KINARA_LIT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MKEKA_WITH_KINARA_LIT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MKEKA_WITH_KINARA.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MKEKA_WITH_CHALICE.get(),RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CHALICE.get(),RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MKEKA.get(),RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.MENORAH.get(),RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.MENORAH_LIT.get(),RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DREIDEL.get(),RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GELT.get(),RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.TINY_SPRUCE.get(),RenderType.getCutoutMipped());

       //WREATHS//
        RenderTypeLookup.setRenderLayer(ModBlocks.CHRISTMAS_WREATH.get(),RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CHRISTMAS_WREATH_WHITE_LIGHTS.get(),RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CHRISTMAS_WREATH_MULTI_LIGHTS.get(),RenderType.getCutoutMipped());
//LIT LEAVES-BUSHES//
        RenderTypeLookup.setRenderLayer(ModBlocks.HOLLY_SAPLING.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.SPRUCE_LEAVES_HOLLY.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SPRUCE_LEAVES_LIGHTS_WHITE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SPRUCE_LEAVES_LIGHTS_LARGE_WHITE.get(), RenderType.getCutoutMipped());



        RenderTypeLookup.setRenderLayer(ModBlocks.SPRUCE_LEAVES_LIGHTS_MULTI.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.SPRUCE_LEAVES_LIGHTS_LARGE_MULTI.get(), RenderType.getCutoutMipped());


        //DECORATED CHRISTMAS TREES//

        //COLORFUL//
        RenderTypeLookup.setRenderLayer(ModBlocks.DECORATED_CHRISTMAS_TREE_BOTTOM.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DECORATED_CHRISTMAS_TREE_MIDDLE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DECORATED_CHRISTMAS_TREE_TOP.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.DECORATED_LIGHTS_CHRISTMAS_TREE_BOTTOM.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DECORATED_LIGHTS_CHRISTMAS_TREE_MIDDLE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DECORATED_LIGHTS_CHRISTMAS_TREE_TOP.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.DECORATED_MULTI_CHRISTMAS_TREE_BOTTOM.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DECORATED_MULTI_CHRISTMAS_TREE_MIDDLE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DECORATED_MULTI_CHRISTMAS_TREE_TOP.get(), RenderType.getCutoutMipped());

        //TRADITIONAL//
        RenderTypeLookup.setRenderLayer(ModBlocks.DECORATED_WHITE_LIGHTS_CHRISTMAS_TREE_BOTTOM.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DECORATED_WHITE_LIGHTS_CHRISTMAS_TREE_MIDDLE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DECORATED_WHITE_LIGHTS_CHRISTMAS_TREE_TOP.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.DECORATED_WHITE_CHRISTMAS_TREE_BOTTOM.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DECORATED_WHITE_CHRISTMAS_TREE_MIDDLE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DECORATED_WHITE_CHRISTMAS_TREE_TOP.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.DECORATED_WHITE_MULTI_CHRISTMAS_TREE_BOTTOM.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DECORATED_WHITE_MULTI_CHRISTMAS_TREE_MIDDLE.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.DECORATED_WHITE_MULTI_CHRISTMAS_TREE_TOP.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.PRESENT.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.CLOVER.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.GLASS_MUG.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.POT_O_GOLD_BLOCK.get(), RenderType.getCutoutMipped());


























    }

    public static void safeRunClient() {
        final IEventBus eventHandler = FMLJavaModLoadingContext.get().getModEventBus();
        eventHandler.register(RenderLayers.class);
    }
}