package ch.sedryx.zyndiummod;

import ch.sedryx.zyndiummod.block.ModBlocks;
import ch.sedryx.zyndiummod.item.ModItemGroups;
import ch.sedryx.zyndiummod.item.ModItems;
import ch.sedryx.zyndiummod.util.HammerUsageEvent;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.client.MinecraftClient;
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

		FuelRegistry.INSTANCE.add(ModItems.COMPACTED_COAL, 20000);

		PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());
	}
}