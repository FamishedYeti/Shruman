package net.leems.shruman;

import net.fabricmc.api.ModInitializer;
import net.leems.shruman.block.ModBlocks;
import net.leems.shruman.item.ModItems;
import net.leems.shruman.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Shruman implements ModInitializer {
	public static final String MOD_ID = "shruman";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerModStuffs();

	}
}
