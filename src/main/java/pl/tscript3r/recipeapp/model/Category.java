package pl.tscript3r.recipeapp.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Category {

    private String id;
    private String description;
    private Set<Recipe> recipes;


}
