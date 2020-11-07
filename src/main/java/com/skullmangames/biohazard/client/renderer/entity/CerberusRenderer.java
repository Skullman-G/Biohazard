package com.skullmangames.biohazard.client.renderer.entity;

import com.skullmangames.biohazard.Biohazard;
import com.skullmangames.biohazard.entity.CerberusEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

public class CerberusRenderer extends DobermanRenderer {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Biohazard.MODID,
            "textures/entities/doberman/doberman.png");

    public CerberusRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn);
    }

    public ResourceLocation getEntityTexture(CerberusEntity entity) {
        return TEXTURE;
    }
}