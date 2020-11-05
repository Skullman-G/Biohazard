package com.skullmangames.biohazard.client.renderer.entity;

import com.skullmangames.biohazard.Biohazard;
import com.skullmangames.biohazard.client.renderer.entity.model.CerberusModel;
import com.skullmangames.biohazard.entity.CerberusEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CerberusRenderer extends MobRenderer<CerberusEntity, CerberusModel<CerberusEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Biohazard.MODID,
            "textures/entities/cerberus/cerberus.png");

    public CerberusRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new CerberusModel<>(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(CerberusEntity entity) {
        return TEXTURE;
    }
}