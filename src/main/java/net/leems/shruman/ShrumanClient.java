package net.leems.shruman;

import net.fabricmc.api.ClientModInitializer;
import net.leems.shruman.block.ModBlocks;
import net.leems.shruman.item.ModItems;

public class ShrumanClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

    }
}
