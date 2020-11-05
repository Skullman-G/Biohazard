package com.skullmangames.biohazard.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class MixedHerbsGGGItem extends Item {
    public MixedHerbsGGGItem() {
        super(new Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .effect(() -> new EffectInstance(Effects.INSTANT_HEALTH, 1, 2), 1)
                        .build())
        );
    }
}
