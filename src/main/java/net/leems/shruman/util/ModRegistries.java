package net.leems.shruman.util;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.leems.shruman.block.ModBlocks;

public class ModRegistries {
    public static void registerModStuffs() {
        registerStrippables();
    }

    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.MUSHROOM_STEM, ModBlocks.STRIPPED_MUSHROOM_STEM);
    }

}
