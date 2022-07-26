package net.leems.shruman.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.leems.shruman.Shruman;
import net.leems.shruman.entity.ModEntities;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {


    private static final Item MUSHROOM_PICKAXE = registerItem("mushroom_pickaxe",
            new Item(new FabricItemSettings().group(ItemGroup.TOOLS)));

    public static final Item SHRUMAN_SPAWN_EGG = registerItem("shruman_spawn_egg",
            new SpawnEggItem(ModEntities.SHRUMAN, 0x948e8d, 0x3b3635,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(64)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Shruman.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Shruman.LOGGER.debug("Registering Mod Items for " + Shruman.MOD_ID);
    }
}
