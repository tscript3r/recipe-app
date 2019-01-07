package pl.tscript3r.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.tscript3r.recipeapp.model.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);

}
