package com.maideniles.maidensmerrymaking.entity.render;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.entity.custom.ColoredChickenEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.ChickenModel;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class ColoredChickenRenderer extends MobRenderer<ColoredChickenEntity, ChickenModel<ColoredChickenEntity>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(MaidensMerryMaking.MOD_ID, "textures/entity/colored_chicken.png");

    public ColoredChickenRenderer(EntityRendererManager renderManagerIn) {

        super(renderManagerIn, new ChickenModel<>(), 0.2F);

    }

    protected float handleRotationFloat(ColoredChickenEntity livingBase, float partialTicks) {
        float f = MathHelper.lerp(partialTicks, livingBase.oFlap, livingBase.wingRotation);
        float f1 = MathHelper.lerp(partialTicks, livingBase.oFlapSpeed, livingBase.destPos);
        return (MathHelper.sin(f) + 1.0F) * f1;
    }

    @Override
    public ResourceLocation getEntityTexture(ColoredChickenEntity entity) {
        return TEXTURE;
    }
}
