package com.skullmangames.biohazard.util;

import com.skullmangames.biohazard.Biohazard;
import com.skullmangames.biohazard.item.*;
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
    public static final RegistryObject<Item> RED_HERB = ITEMS.register("red_herb", RedHerb::new);
    public static final RegistryObject<BlueHerb> BLUE_HERB = ITEMS.register("blue_herb", BlueHerb::new);
    public static final RegistryObject<MixedHerbsGG> MIXED_HERBS_GG = ITEMS.register("mixed_herbs_gg", MixedHerbsGG::new);
    public static final RegistryObject<MixedHerbsGGG> MIXED_HERBS_GGG = ITEMS.register("mixed_herbs_ggg", MixedHerbsGGG::new);
}
