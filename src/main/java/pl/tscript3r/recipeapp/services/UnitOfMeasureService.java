package pl.tscript3r.recipeapp.services;

import pl.tscript3r.recipeapp.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();

}
