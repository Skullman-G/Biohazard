package com.skullmangames.biohazard.client.renderer.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.skullmangames.biohazard.entity.DobermanEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class DobermanModel<T extends DobermanEntity> extends EntityModel<T> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer upperBody;
	private final ModelRenderer upperBody_r1;
	private final ModelRenderer leg0;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer tail;
	private final ModelRenderer tail_r1;

	public DobermanModel() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(-0.8F, 9.8969F, -3.8F);
		head.setTextureOffset(24, 20).addBox(-3.2F, -5.3969F, -3.95F, 6.0F, 6.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(0, 3).addBox(-3.2F, -7.3969F, 0.05F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(0.8F, -7.3969F, 0.05F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(24, 12).addBox(-1.7F, -2.4125F, -6.95F, 3.0F, 3.0F, 5.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(-1.0F, 15.0F, 3.0F);


		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, -1.5F, 1.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 1.3963F, 0.0F, 0.0F);
		body_r1.setTextureOffset(0, 12).addBox(-3.0F, -4.9487F, -2.8517F, 6.0F, 10.0F, 6.0F, 0.0F, false);

		upperBody = new ModelRenderer(this);
		upperBody.setRotationPoint(-1.0F, 13.0F, -0.5F);


		upperBody_r1 = new ModelRenderer(this);
		upperBody_r1.setRotationPoint(0.0F, -0.5F, -3.0F);
		upperBody.addChild(upperBody_r1);
		setRotationAngle(upperBody_r1, 1.4835F, 0.0F, 0.0F);
		upperBody_r1.setTextureOffset(0, 0).addBox(-4.0F, -1.5F, -3.5F, 8.0F, 5.0F, 7.0F, 0.0F, false);

		leg0 = new ModelRenderer(this);
		leg0.setRotationPoint(-2.5F, 16.0F, 7.0F);
		leg0.setTextureOffset(30, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(0.5F, 16.0F, 7.0F);
		leg1.setTextureOffset(30, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-2.5F, 16.0F, -4.0F);
		leg2.setTextureOffset(30, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(0.5F, 16.0F, -4.0F);
		leg3.setTextureOffset(30, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(-1.0F, 12.0F, 8.0F);


		tail_r1 = new ModelRenderer(this);
		tail_r1.setRotationPoint(0.0F, 0.0F, 1.0F);
		tail.addChild(tail_r1);
		setRotationAngle(tail_r1, 0.1309F, 0.0F, 0.0F);
		tail_r1.setTextureOffset(18, 12).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
		this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
		this.leg0.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		this.leg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		upperBody.render(matrixStack, buffer, packedLight, packedOverlay);
		leg0.render(matrixStack, buffer, packedLight, packedOverlay);
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		leg3.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}