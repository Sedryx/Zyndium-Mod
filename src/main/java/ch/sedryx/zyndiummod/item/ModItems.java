package ch.sedryx.zyndiummod.item;

import ch.sedryx.zyndiummod.ZyndiumMod;
import ch.sedryx.zyndiummod.item.custom.HammerItem;
import ch.sedryx.zyndiummod.item.custom.ModArmorMaterials;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.advancement.criterion.ItemDurabilityChangedCriterion;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.BlockTags;
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
    public static final Item ZYNDIUM_SWORD = registerItem("zyndium_sword", new SwordItem(ModToolMaterials.ZYNDIUM, 10, 2f, new FabricItemSettings()));
    // pickaxe
    public static final Item ZYNDIUM_PICKAXE = registerItem("zyndium_pickaxe", new PickaxeItem(ModToolMaterials.ZYNDIUM, 4, 2f, new FabricItemSettings()));
    // axe
    public static final Item ZYNDIUM_AXE = registerItem("zyndium_axe", new AxeItem(ModToolMaterials.ZYNDIUM, 12, 1.2f, new FabricItemSettings()));
    // shovel
    public static final Item ZYNDIUM_SHOVEL = registerItem("zyndium_shovel", new ShovelItem(ModToolMaterials.ZYNDIUM, 3, 1.2f, new FabricItemSettings()));
    // hoe
    public static final Item ZYNDIUM_HOE = registerItem("zyndium_hoe", new HoeItem(ModToolMaterials.ZYNDIUM, 3, 5.0f,new FabricItemSettings()));
    // hammer
    public static final Item HAMMER_TEST = registerItem("hammer_test", new HammerItem(ModToolMaterials.ZYNDIUM, 3, 5F, BlockTags.PICKAXE_MINEABLE, 3, 6, new FabricItemSettings()));
    public static final Item HAMMER_TEST2 = registerItem("hammer_test2", new HammerItem(ModToolMaterials.ZYNDIUM, 3, 5F, BlockTags.PICKAXE_MINEABLE, 1, 2,  new FabricItemSettings()));

    // Armors
    public static final Item VOIDITE_HELMET = registerItem("voidite_helmet",
            new ArmorItem(ModArmorMaterials.ZYNDIUM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item VOIDITE_CHESTPLATE = registerItem("voidite_chestplate",
            new ArmorItem(ModArmorMaterials.ZYNDIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item VOIDITE_LEGGINGS = registerItem("voidite_leggings",
            new ArmorItem(ModArmorMaterials.ZYNDIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item VOIDITE_BOOTS = registerItem("voidite_boots",
            new ArmorItem(ModArmorMaterials.ZYNDIUM, ArmorItem.Type.BOOTS, new FabricItemSettings()));




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
