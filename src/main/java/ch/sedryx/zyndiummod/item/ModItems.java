package ch.sedryx.zyndiummod.item;

import ch.sedryx.zyndiummod.ZyndiumMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // ingot item
    public static final Item ZYNDIUM_INGOT = registerItem("zyndium_ingot", new Item(new FabricItemSettings()));
    public static final Item NEBRIUM_INGOT = registerItem("nebrium_ingot", new Item(new FabricItemSettings()));
    public static final Item YERASTILE_INGOT = registerItem("yerastile_ingot", new Item(new FabricItemSettings()));
    public static final Item ZIPHYRITE_INGOT = registerItem("ziphyrite_ingot", new Item(new FabricItemSettings()));
    public static final Item SILVERITE_INGOT = registerItem("silverite_ingot", new Item(new FabricItemSettings()));
    public static final Item COMPACTED_COAL = registerItem("compacted_coal", new Item(new FabricItemSettings()));
    public static final Item VOIDITE_INGOT = registerItem("voidite_ingot", new Item(new FabricItemSettings()));

    // raw item
    public static final Item RAW_SILVERITE = registerItem("raw_silverite", new Item(new FabricItemSettings()));
    public static final Item RAW_VOIDITE = registerItem("raw_voidite", new Item(new FabricItemSettings()));

    // nugget
    public static final Item SILVERITE_NUGGET = registerItem("silverite_nugget", new Item(new FabricItemSettings()));
    public static final Item VOIDITE_NUGGET = registerItem("voidite_nugget", new Item(new FabricItemSettings()));

    // sword
    public static final Item ZYNDIUM_SWORD = registerItem("zyndium_sword", new SwordItem(ModToolMaterials.ZYNDIUM, 500, 50f, new FabricItemSettings()));
    // pickaxe
    public static final Item ZYNDIUM_PICKAXE = registerItem("zyndium_pickaxe", new PickaxeItem(ModToolMaterials.ZYNDIUM, 2, 7f, new FabricItemSettings()));
    // axe
    public static final Item ZYNDIUM_AXE = registerItem("zyndium_pickaxe", new PickaxeItem(ModToolMaterials.ZYNDIUM, 2, 7f, new FabricItemSettings()));
    // shovel
    public static final Item ZYNDIUM_SHOVEL = registerItem("zyndium_pickaxe", new PickaxeItem(ModToolMaterials.ZYNDIUM, 2, 7f, new FabricItemSettings()));
    // hoe
    public static final Item ZYNDIUM_HOW = registerItem("zyndium_pickaxe", new PickaxeItem(ModToolMaterials.ZYNDIUM, 2, 7f, new FabricItemSettings()));
    // hammer



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
