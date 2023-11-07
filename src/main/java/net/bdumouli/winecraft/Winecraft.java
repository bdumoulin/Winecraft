package net.bdumouli.winecraft;

import net.bdumouli.winecraft.block.ModBlocks;
import net.bdumouli.winecraft.items.ModItemGroups;
import net.bdumouli.winecraft.items.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Winecraft implements ModInitializer {
    public static final String MOD_ID = "winecraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}