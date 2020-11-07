package com.skullmangames.biohazard.init;

import com.skullmangames.biohazard.Biohazard;
import com.skullmangames.biohazard.entity.CerberusEntity;
import com.skullmangames.biohazard.entity.DobermanEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes
{
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, Biohazard.MODID);

    public static final RegistryObject<EntityType<DobermanEntity>> DOBERMAN = ENTITY_TYPES.register("doberman",
            () -> EntityType.Builder.<DobermanEntity>create(DobermanEntity::new, EntityClassification.CREATURE)
                    .size(0.6f, 0.85f)
                    .build(new ResourceLocation(Biohazard.MODID, "doberman").toString()));

    public static final RegistryObject<EntityType<CerberusEntity>> CERBERUS = ENTITY_TYPES.register("cerberus",
            () -> EntityType.Builder.<CerberusEntity>create(CerberusEntity::new, EntityClassification.MONSTER)
                    .size(0.6f, 0.85f)
                    .build(new ResourceLocation(Biohazard.MODID, "cerberus").toString()));
}
