package com.skullmangames.biohazard.util;

import com.skullmangames.biohazard.Biohazard;
import com.skullmangames.biohazard.common.item.GreenHerb;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler
{
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Biohazard.MODID);

    public static void Init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<GreenHerb> GREEN_HERB = ITEMS.register("green_herb", GreenHerb::new);
}
