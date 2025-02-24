package ch.sedryx.zyndiummod.datagen;

import ch.sedryx.zyndiummod.block.ModBlocks;
import ch.sedryx.zyndiummod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ZYNDIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVERITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VOIDITE_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_VOIDITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_SILVERITE_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVERITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VOIDITE_ORE);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ZYNDIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.YERASTILE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.NEBRIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ZIPHYRITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVERITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.VOIDITE_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_SILVERITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_VOIDITE, Models.GENERATED);

        itemModelGenerator.register(ModItems.SILVERITE_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.VOIDITE_NUGGET, Models.GENERATED);

        itemModelGenerator.register(ModItems.COMPACTED_COAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.ZYNDIUM_SWORD, Models.GENERATED);
        itemModelGenerator.register(ModItems.HAMMER_TEST, Models.GENERATED);

        itemModelGenerator.register(ModItems.VOIDITE_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.VOIDITE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.VOIDITE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.VOIDITE_BOOTS, Models.GENERATED);
    }
}
