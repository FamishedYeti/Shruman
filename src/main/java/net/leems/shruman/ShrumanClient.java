package net.leems.shruman;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.leems.shruman.block.ModBlocks;
import net.leems.shruman.entity.ModEntities;
import net.leems.shruman.entity.client.ShrumanRenderer;
import net.leems.shruman.item.ModItems;

public class ShrumanClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        EntityRendererRegistry.register(ModEntities.SHRUMAN, ShrumanRenderer::new);

    }
}
