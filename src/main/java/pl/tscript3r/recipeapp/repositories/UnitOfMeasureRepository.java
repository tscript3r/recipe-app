package pl.tscript3r.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.tscript3r.recipeapp.model.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, String> {

    Optional<UnitOfMeasure> findByDescription(String description);

}
