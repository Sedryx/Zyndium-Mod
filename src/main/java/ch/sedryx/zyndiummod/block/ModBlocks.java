package ch.sedryx.zyndiummod.block;

import ch.sedryx.zyndiummod.ZyndiumMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block ZYNDIUM_BLOCK = registerBlock("zyndium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block SILVERITE_BLOCK = registerBlock("silverite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block RAW_SILVERITE_BLOCK = registerBlock("raw_silverite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_COPPER_BLOCK)));

    public static final Block SILVERITE_ORE = registerBlock("silverite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_ORE)));





    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return  Registry.register(Registries.BLOCK, new Identifier(ZyndiumMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(ZyndiumMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        ZyndiumMod.LOGGER.info("Registering ModBlocks for " + ZyndiumMod.MOD_ID);
    }
}
