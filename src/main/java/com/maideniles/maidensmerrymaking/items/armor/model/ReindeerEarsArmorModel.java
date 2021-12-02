package com.maideniles.maidensmerrymaking.items.armor.model;



import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class ReindeerEarsArmorModel extends BipedModel<LivingEntity> {
    //  private final EquipmentSlotType slot;


    private final ModelRenderer hat1;


    public ReindeerEarsArmorModel() {
        super(1);
        //  this.slot = slot;
        textureWidth = 64;
        textureHeight = 64;

        hat1 = new ModelRenderer(this);



        bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);

        bipedHead.addChild(hat1);

        hat1.setTextureOffset(0, 32).addBox(-5.0F, -17.0F, -4.0F, 10.0F, 9.0F, 0.0F, 0.25F, false);


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
