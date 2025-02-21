package ch.sedryx.zyndiummod.item;

import ch.sedryx.zyndiummod.ZyndiumMod;
import ch.sedryx.zyndiummod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ZYNDIUM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ZyndiumMod.MOD_ID, "zyndium"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.zyndium"))
                    .icon(() -> new ItemStack(ModItems.ZYNDIUM_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ZYNDIUM_INGOT);
                        entries.add(ModItems.YERASTILE_INGOT);
                        entries.add(ModItems.NEBRIUM_INGOT);
                        entries.add(ModItems.ZIPHYRITE_INGOT);
                        entries.add(ModItems.SILVERITE_INGOT);
                        entries.add(ModItems.COMPACTED_COAL);
                        entries.add(ModItems.VOIDITE_INGOT);

                        entries.add(ModItems.SILVERITE_NUGGET);
                        entries.add(ModItems.VOIDITE_NUGGET);

                        entries.add(ModItems.VOIDITE_CHESTPLATE);
                        entries.add(ModItems.VOIDITE_HELMET);
                        entries.add(ModItems.VOIDITE_LEGGINGS);
                        entries.add(ModItems.VOIDITE_BOOTS);

                        entries.add(ModBlocks.ZYNDIUM_BLOCK);
                        entries.add(ModBlocks.SILVERITE_BLOCK);
                        entries.add(ModBlocks.VOIDITE_BLOCK);

                        entries.add(ModBlocks.RAW_SILVERITE_BLOCK);
                        entries.add(ModBlocks.RAW_VOIDITE_BLOCK);

                        entries.add(ModItems.RAW_SILVERITE);
                        entries.add(ModItems.RAW_VOIDITE);

                        entries.add(ModBlocks.SILVERITE_ORE);
                        entries.add(ModBlocks.VOIDITE_ORE);

                        entries.add(ModItems.ZYNDIUM_SWORD);
                        entries.add(ModItems.HAMMER_TEST);
                        entries.add(ModItems.HAMMER_TEST2);
                    }).build());

    public static void registerItemGroups() {
        ZyndiumMod.LOGGER.info("Registering item groups for " + ZyndiumMod.MOD_ID);
    }
}