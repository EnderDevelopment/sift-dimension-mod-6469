package com.shadowsonic24712.siftdimensionmod;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.monster.Warden;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

public
class SiftMobs {
    public static final EntityType<Warden> MEGA_WARDEN = EntityType.Builder.of(Warden::new, MobCategory.MONSTER).sized(2.0F, 4.0F).build("mega_warden");

    public static void registerMobs() {
        Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(SiftDimensionMod.MOD_ID, "mega_warden"), MEGA_WARDEN);
    }
}
