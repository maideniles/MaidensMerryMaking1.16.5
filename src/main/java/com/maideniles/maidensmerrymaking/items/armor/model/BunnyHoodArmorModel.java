package com.maideniles.maidensmerrymaking.items.armor.model;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class BunnyHoodArmorModel extends BipedModel<LivingEntity> {
    //  private final EquipmentSlotType slot;


    private final ModelRenderer hat1;
    private final ModelRenderer hat2;
    private final ModelRenderer earLeft;
    private final ModelRenderer earRight;

    public BunnyHoodArmorModel() {
        super(1);
        //  this.slot = slot;
        textureWidth = 64;
        textureHeight = 64;

        hat1 = new ModelRenderer(this);
        hat2 = new ModelRenderer(this);
        earLeft = new ModelRenderer(this);
        earRight = new ModelRenderer(this);


        bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);

        bipedHead.addChild(hat1);
        bipedHead.addChild(earLeft);
        bipedHead.addChild(earRight);
        bipedHead.addChild(hat2);
        hat1.setTextureOffset(0, 33).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.50F, false);
        hat2.setTextureOffset(32, 34).addBox(-3.5F, -9.5F, -3.5F, 7.0F, 1.0F, 7.0F, 0.0F, false);

        earRight.setTextureOffset(0,0).addBox(-3.0F, -15.75F, 0.0F, 2.0F, 7.0F, 1.0F,0.50F,false);
earLeft.setTextureOffset(0,0).addBox(1.0F, -15.75F, 0.0F, 2.0F, 7.0F, 1.0F,0.50F,true);
    }


    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){

        bipedHead.render(matrixStack, buffer, packedLight, packedOverlay);

    }


    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}