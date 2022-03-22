package com.maideniles.maidensmerrymaking.entity.render;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.entity.custom.ColoredBunnyEntity;
import com.maideniles.maidensmerrymaking.entity.model.ColoredBunnyModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ColoredBunnyRenderer extends MobRenderer<ColoredBunnyEntity, ColoredBunnyModel<ColoredBunnyEntity>>{


    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(MaidensMerryMaking.MOD_ID, "textures/entity/colored_bunny.png");

public ColoredBunnyRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ColoredBunnyModel<>(), 0.3F);
        }

public ResourceLocation getEntityTexture(ColoredBunnyEntity entity) {

       return TEXTURE;
        }

}