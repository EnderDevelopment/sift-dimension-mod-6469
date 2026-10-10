package com.shadowsonic24712.siftdimensionmod;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

public
class SiftBlocks {
    public static final Block SCULK_BLOCK = new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).strength(3.0F, 6.0F));

    public static void registerBlocks() {
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(SiftDimensionMod.MOD_ID, "sculk_block"), SCULK_BLOCK);
    }
}
