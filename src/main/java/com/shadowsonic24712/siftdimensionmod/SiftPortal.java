package com.shadowsonic24712.siftdimensionmod;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

public
class SiftPortal {
    public static void registerPortal() {
        // Portal registration logic
    }

    public static boolean isValidPortalFrame(Level level, BlockPos pos) {
        for (int x = -1; x <= 1; x++) {
            for (int z = -1; z <= 1; z++) {
                if (x == 0 && z == 0) continue;
                BlockState blockState = level.getBlockState(pos.offset(x, 0, z));
                if (blockState.getBlock() != SiftBlocks.SCULK_BLOCK) {
                    return false;
                }
            }
        }
        return true;
    }
}
