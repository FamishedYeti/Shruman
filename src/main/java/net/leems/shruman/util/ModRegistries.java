package net.leems.shruman.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.leems.shruman.block.ModBlocks;
import net.leems.shruman.entity.ModEntities;
import net.leems.shruman.entity.custom.ShrumanEntity;

public class ModRegistries {
    public static void registerModStuffs() {
        registerStrippables();
        registerAttributes();
    }

    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.MUSHROOM_STEM, ModBlocks.STRIPPED_MUSHROOM_STEM);
    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.SHRUMAN, ShrumanEntity.setAttributes());
    }

}
