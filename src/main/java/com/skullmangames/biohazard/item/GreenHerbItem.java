package com.skullmangames.biohazard.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class GreenHerbItem extends Item {
    public GreenHerbItem() {
        super(new Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .effect(() -> new EffectInstance(Effects.INSTANT_HEALTH, 1, 1/2), 1)
                        .build())
        );
    }
}