package pl.tscript3r.recipeapp.services;

import pl.tscript3r.recipeapp.commands.RecipeCommand;
import pl.tscript3r.recipeapp.model.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(String l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(String id);

    void deleteById(String id);

}
