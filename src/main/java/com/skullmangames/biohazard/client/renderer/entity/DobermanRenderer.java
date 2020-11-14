package com.skullmangames.biohazard.client.renderer.entity;

import com.skullmangames.biohazard.Biohazard;
import com.skullmangames.biohazard.client.renderer.entity.model.DobermanModel;
import com.skullmangames.biohazard.entity.DobermanEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class DobermanRenderer extends MobRenderer<DobermanEntity, DobermanModel<DobermanEntity>> {

    protected static final ResourceLocation DOBERMAN_TEXTURE = new ResourceLocation(Biohazard.MODID,
            "textures/entities/doberman/doberman.png");

    public DobermanRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new DobermanModel<>(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(DobermanEntity entity) {
        return DOBERMAN_TEXTURE;
    }
}
