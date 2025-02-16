package ch.sedryx.zyndiummod;

import ch.sedryx.zyndiummod.block.ModBlocks;
import ch.sedryx.zyndiummod.item.ModItemGroups;
import ch.sedryx.zyndiummod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ZyndiumMod implements ModInitializer {
	public static final String MOD_ID = "zyndiummod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
	}
}