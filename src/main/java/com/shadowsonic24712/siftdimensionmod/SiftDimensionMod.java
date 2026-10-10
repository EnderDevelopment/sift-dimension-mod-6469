package com.shadowsonic24712.siftdimensionmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public
class SiftDimensionMod implements ModInitializer {
    public static final String MOD_ID = "siftdimensionmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Sift Dimension Mod");
        SiftBlocks.registerBlocks();
        SiftItems.registerItems();
        SiftMobs.registerMobs();
        SiftStructures.registerStructures();
        SiftDimension.registerDimension();
        SiftPortal.registerPortal();
    }
}
