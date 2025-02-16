package ch.sedryx.zyndiummod.item;

import ch.sedryx.zyndiummod.ZyndiumMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ZYNDIUM_INGOT = registerItem("zyndium_ingot", new Item(new FabricItemSettings()));
    public static final Item NEBRIUM_INGOT = registerItem("nebrium_ingot", new Item(new FabricItemSettings()));
    public static final Item YERASTILE_INGOT = registerItem("yerastile_ingot", new Item(new FabricItemSettings()));


    private static void addItemToIngredientItemGroup(FabricItemGroupEntries entries) {
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ZyndiumMod.MOD_ID, name),item);
    }

    public static void registerModItems() {
        ZyndiumMod.LOGGER.info("Registering Mod Item for " + ZyndiumMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIngredientItemGroup);
    };
};
