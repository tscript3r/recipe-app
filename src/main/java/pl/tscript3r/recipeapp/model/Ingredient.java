package pl.tscript3r.recipeapp.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Ingredient {

    private String id;
    private String description;
    private BigDecimal amount;
    private UnitOfMeasure unitOfMeasure;
    private Recipe recipe;

    public Ingredient() {
    }

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom) {
        this.description = description;
        this.amount = amount;
        this.unitOfMeasure = uom;
    }

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom, Recipe recipe) {
        this.description = description;
        this.amount = amount;
        this.unitOfMeasure = uom;
        this.recipe = recipe;
    }

}

