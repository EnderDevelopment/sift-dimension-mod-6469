package com.shadowsonic24712.siftdimensionmod;

import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

public
class SiftStructures {
    public static final StructureType<?> SCULK_CASTLE = () -> Structure.STRUCTURE_TYPES.get(new ResourceLocation(SiftDimensionMod.MOD_ID, "sculk_castle"));

    public static void registerStructures() {
        Registry.register(BuiltInRegistries.STRUCTURE_TYPE, new ResourceLocation(SiftDimensionMod.MOD_ID, "sculk_castle"), SCULK_CASTLE);
    }
}
