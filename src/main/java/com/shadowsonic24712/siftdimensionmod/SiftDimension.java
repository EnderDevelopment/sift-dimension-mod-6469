package com.shadowsonic24712.siftdimensionmod;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

public
class SiftDimension {
    public static final ResourceKey<Level> SIFT_DIMENSION = ResourceKey.create(Registries.DIMENSION, new ResourceLocation(SiftDimensionMod.MOD_ID, "sift_dimension"));
    public static final ResourceKey<DimensionType> SIFT_DIMENSION_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE, new ResourceLocation(SiftDimensionMod.MOD_ID, "sift_dimension_type"));

    public static void registerDimension() {
        Registry.register(BuiltInRegistries.DIMENSION_TYPE, new ResourceLocation(SiftDimensionMod.MOD_ID, "sift_dimension_type"), DimensionType.createDefault());
    }
}
