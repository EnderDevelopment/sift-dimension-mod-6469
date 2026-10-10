package com.shadowsonic24712.siftdimensionmod;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

public
class SiftItems {
    public static final Item SCULK_BLOCK_ITEM = new BlockItem(SiftBlocks.SCULK_BLOCK, new Item.Properties());

    public static void registerItems() {
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(SiftDimensionMod.MOD_ID, "sculk_block"), SCULK_BLOCK_ITEM);
    }
}
