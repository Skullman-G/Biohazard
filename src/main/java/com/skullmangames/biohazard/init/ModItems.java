package com.skullmangames.biohazard.init;

import com.skullmangames.biohazard.Biohazard;
import com.skullmangames.biohazard.item.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Biohazard.MODID);

    //Items
    public static final RegistryObject<GreenHerbItem> GREEN_HERB = ITEMS.register("green_herb", GreenHerbItem::new);
    public static final RegistryObject<Item> RED_HERB = ITEMS.register("red_herb", RedHerbItem::new);
    public static final RegistryObject<BlueHerbItem> BLUE_HERB = ITEMS.register("blue_herb", BlueHerbItem::new);
    public static final RegistryObject<MixedHerbsGGItem> MIXED_HERBS_GG = ITEMS.register("mixed_herbs_gg", MixedHerbsGGItem::new);
    public static final RegistryObject<MixedHerbsGGGItem> MIXED_HERBS_GGG = ITEMS.register("mixed_herbs_ggg", MixedHerbsGGGItem::new);

    //SpawnEgg
    public static final RegistryObject<ModSpawnEggItem> CERBERUS_SPAWN_EGG = ITEMS.register("cerberus_spawn_egg",
            ()-> new ModSpawnEggItem(ModEntityTypes.CERBERUS, 0x963200, 0x000000,
                    new Item.Properties().group(ItemGroup.MISC)));
}
