package pl.tscript3r.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.tscript3r.recipeapp.model.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, String> {

}
