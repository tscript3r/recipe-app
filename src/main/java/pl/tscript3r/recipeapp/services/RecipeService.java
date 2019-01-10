package pl.tscript3r.recipeapp.services;

import pl.tscript3r.recipeapp.commands.RecipeCommand;
import pl.tscript3r.recipeapp.model.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
    Recipe findById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand command);

}
