package ch.sedryx.zyndiummod.datagen;

import ch.sedryx.zyndiummod.block.ModBlocks;
import ch.sedryx.zyndiummod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import org.spongepowered.asm.mixin.Final;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> SILVER_SMELTABLE = List.of(
        ModBlocks.RAW_SILVERITE_BLOCK, ModItems.RAW_SILVERITE
    );

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, SILVER_SMELTABLE, RecipeCategory.MISC, ModItems.SILVERITE_INGOT,
        0.7f, 200, "zyndium");
        offerBlasting(exporter, SILVER_SMELTABLE, RecipeCategory.MISC, ModItems.SILVERITE_INGOT,
                0.7f, 100, "zyndium");





        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ZYNDIUM_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.ZYNDIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SILVERITE_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.SILVERITE_BLOCK);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ZYNDIUM_INGOT);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILVERITE_INGOT);
    }
}
