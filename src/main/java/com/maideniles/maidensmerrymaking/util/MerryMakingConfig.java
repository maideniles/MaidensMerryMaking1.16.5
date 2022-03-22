package com.maideniles.maidensmerrymaking.util;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;

import java.io.File;

public class MerryMakingConfig {
    public static ForgeConfigSpec SERVER_CONFIG;
    public static ForgeConfigSpec CLIENT_CONFIG;
    public static ForgeConfigSpec.IntValue CHRISTMAS_PRESENT_CHEST_SPAWN;
    public static ForgeConfigSpec.BooleanValue CHRISTMAS_ENABLED;
    public static ForgeConfigSpec.BooleanValue ST_PATRICKS_DAY_ENABLED;
    public static ForgeConfigSpec.BooleanValue EASTER_ENABLED;
    public static ForgeConfigSpec.IntValue COLORED_EGG_SPAWN;


    static {
        ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();
        ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();

        presentChestChance(SERVER_BUILDER, CLIENT_BUILDER);

        SERVER_CONFIG= SERVER_BUILDER.build();
        CLIENT_CONFIG= CLIENT_BUILDER.build();

    }

    private static void presentChestChance(ForgeConfigSpec.Builder SERVER_BUILDER, ForgeConfigSpec.Builder CLIENT_BUILDER) {
        {
            CHRISTMAS_PRESENT_CHEST_SPAWN = CLIENT_BUILDER.comment("Christmas presents can spawn in chests. Set to 0 to disable")
                    .defineInRange("christmas_present_chest_spawn", 1, 0, Integer.MAX_VALUE);

            CHRISTMAS_ENABLED = CLIENT_BUILDER.comment("Enable Christmas Recipes such as armor, foods, decorations. Set to False to disable")
                    .define("christmas_enabled", true);

//BEGIN ST PATRICK'S DAY CONTENT//
            ST_PATRICKS_DAY_ENABLED = CLIENT_BUILDER.comment("Enable St. Patrick's Day content-- Pot 'O Gold Structure, Green Beer recipe, Clover generation, etc.")
                    .define("st_patricks_day_enabled", true);

//BEGIN EASTER CONTENT//
            EASTER_ENABLED = CLIENT_BUILDER.comment("Enable Easter content--egg world gen, etc.")
                    .define("st_patricks_day_enabled", true);

            COLORED_EGG_SPAWN = CLIENT_BUILDER.comment("Chickens will drop colored eggs. Set to 0 to disable")
                    .defineInRange("colored_egg_spawn", 1, 0, Integer.MAX_VALUE);


        }


    }
    public static void loadConfigFile(ForgeConfigSpec config, String path)
    {

        final CommentedFileConfig file = CommentedFileConfig.builder(new File(path))
                .sync().autosave().writingMode(WritingMode.REPLACE).build();
        file.load();
        config.setConfig(file);

    }

}
