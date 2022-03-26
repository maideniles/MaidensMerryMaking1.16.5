package com.maideniles.maidensmerrymaking.entity.render;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.entity.custom.ColoredBunnyEntity;
import com.maideniles.maidensmerrymaking.entity.model.ColoredBunnyModel;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.debug.CollisionBoxDebugRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class YellowBunnyRenderer extends MobRenderer<ColoredBunnyEntity, ColoredBunnyModel<ColoredBunnyEntity>>{

    private static final ResourceLocation TEXTURE =
            new ResourceLocation(MaidensMerryMaking.MOD_ID, "textures/entity/bunny/yellow_bunny.png");


    public YellowBunnyRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ColoredBunnyModel<>(), 0.3F);
    }

    public ResourceLocation getEntityTexture(ColoredBunnyEntity entity) {

        return TEXTURE;
    }



    public void render(ColoredBunnyEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
        this.shadowSize = 0.25F * (float)entityIn.getBunnySize();
        super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
    }

    protected void preRenderCallback(ColoredBunnyEntity entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
        float f = 0.999F;
        matrixStackIn.scale(0.999F, 0.999F, 0.999F);
        matrixStackIn.translate(0.0D, (double)0.001F, 0.0D);
        float f1 = (float)entitylivingbaseIn.getBunnySize();
        float f2 = MathHelper.lerp(partialTickTime, entitylivingbaseIn.prevSquishFactor, entitylivingbaseIn.squishFactor) / (f1 * 0.5F + 1.0F);
        float f3 = 1.0F / (f2 + 1.0F);
        matrixStackIn.scale(f3 * f1, 1.0F / f3 * f1, f3 * f1);
    }




}
