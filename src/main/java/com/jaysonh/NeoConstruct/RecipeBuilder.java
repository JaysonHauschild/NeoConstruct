package com.jaysonh.NeoConstruct;

import com.jaysonh.NeoConstruct.items.NCItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.concurrent.CompletableFuture;

public class RecipeBuilder extends RecipeProvider {
    public RecipeBuilder(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {
        SimpleCookingRecipeBuilder.smelting(
                Ingredient.of(Items.BRICKS),
                RecipeCategory.MISC,
                NCItems.SMELT_INGOT.get(),
                0.7f,
                200
        )
                .unlockedBy("has_bricks", has(Items.BRICKS))
                .save(output);
    }
}
