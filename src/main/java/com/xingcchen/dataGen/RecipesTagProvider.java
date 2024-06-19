package com.xingcchen.dataGen;

import com.xingcchen.item.NewItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;

import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class RecipesTagProvider extends FabricRecipeProvider {
    public RecipesTagProvider(FabricDataOutput output) {
        super(output);
    }

    public static final List<ItemConvertible> list = List.of(NewItem.RAW_CORN);

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, NewItem.CORN_INGOT, RecipeCategory.BUILDING_BLOCKS,
                NewItem.CORN_BLOCK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, NewItem.CORN_AXE, 1)
                .pattern("## ")
                .pattern("#* ")
                .pattern(" * ")
                .input('#', NewItem.CORN_INGOT).input('*', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(NewItem.CORN_INGOT), FabricRecipeProvider
                        .conditionsFromItem(NewItem.CORN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, NewItem.CORN_PICKAXE, 1)
                .pattern("###")
                .pattern(" * ")
                .pattern(" * ")
                .input('#', NewItem.CORN_INGOT).input('*', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(NewItem.CORN_INGOT), FabricRecipeProvider
                        .conditionsFromItem(NewItem.CORN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, NewItem.CORN_SHOVEL, 1)
                .pattern(" # ")
                .pattern(" * ")
                .pattern(" * ")
                .input('#', NewItem.CORN_INGOT).input('*', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(NewItem.CORN_INGOT), FabricRecipeProvider
                        .conditionsFromItem(NewItem.CORN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, NewItem.CORN_SWORD, 1)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" * ")
                .input('#', NewItem.CORN_INGOT).input('*', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(NewItem.CORN_INGOT), FabricRecipeProvider
                        .conditionsFromItem(NewItem.CORN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, NewItem.CORN_HOE, 1)
                .pattern("## ")
                .pattern(" * ")
                .pattern(" * ")
                .input('#', NewItem.CORN_INGOT).input('*', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(NewItem.CORN_INGOT), FabricRecipeProvider
                        .conditionsFromItem(NewItem.CORN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, NewItem.ORE_FINDER, 1)
                .pattern("#*#")
                .pattern("###")
                .pattern(" & ")
                .input('#', Items.IRON_BLOCK).input('*', NewItem.CORN_BLOCK).input('&', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(NewItem.CORN_BLOCK), FabricRecipeProvider
                        .conditionsFromItem(NewItem.CORN_BLOCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, NewItem.CORN_HELMET, 1)
                .pattern("###")
                .pattern("# #")
                .input('#', NewItem.CORN_INGOT)
                .criterion(FabricRecipeProvider.hasItem(NewItem.CORN_INGOT), FabricRecipeProvider
                        .conditionsFromItem(NewItem.CORN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, NewItem.CORN_CHESTPLATE, 1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', NewItem.CORN_INGOT)
                .criterion(FabricRecipeProvider.hasItem(NewItem.CORN_INGOT), FabricRecipeProvider
                        .conditionsFromItem(NewItem.CORN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, NewItem.CORN_LEGGINGS, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', NewItem.CORN_INGOT)
                .criterion(FabricRecipeProvider.hasItem(NewItem.CORN_INGOT), FabricRecipeProvider
                        .conditionsFromItem(NewItem.CORN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, NewItem.CORN_BOOTS, 1)
                .pattern("# #")
                .pattern("# #")
                .input('#', NewItem.CORN_INGOT)
                .criterion(FabricRecipeProvider.hasItem(NewItem.CORN_INGOT), FabricRecipeProvider
                        .conditionsFromItem(NewItem.CORN_INGOT))
                .offerTo(exporter);


        offerBlasting(exporter, list, RecipeCategory.MISC, NewItem.CORN_INGOT, 2.5f, 150, "corn");
        offerSmelting(exporter, list, RecipeCategory.MISC, NewItem.CORN_INGOT, 2.5f, 300, "corn");
    }
}
