package net.leems.shruman.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.leems.shruman.Shruman;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup SHROOMS = FabricItemGroupBuilder.build(
            new Identifier(Shruman.MOD_ID, "shrooms"), () -> new ItemStack(ModItems.MUSHROOM_PICKAXE)
    );
}
