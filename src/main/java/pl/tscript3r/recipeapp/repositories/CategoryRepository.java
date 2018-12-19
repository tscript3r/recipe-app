package pl.tscript3r.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.tscript3r.recipeapp.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
