package net.leems.shruman.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.leems.shruman.Shruman;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block MUSHROOM_STEM = registerBlock("mushroom_stem",
        new PillarBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_LOG).strength(2f).sounds(BlockSoundGroup.FUNGUS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block STRIPPED_MUSHROOM_STEM = registerBlock("stripped_mushroom_stem",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_DARK_OAK_LOG).strength(2f).sounds(BlockSoundGroup.FUNGUS)), ItemGroup.BUILDING_BLOCKS);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Shruman.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM, new Identifier(Shruman.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }


    public static void registerModBlocks() {
        Shruman.LOGGER.debug("Registering Modblocks for " + Shruman.MOD_ID);
    }
}
