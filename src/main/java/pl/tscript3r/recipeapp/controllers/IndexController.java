package pl.tscript3r.recipeapp.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.tscript3r.recipeapp.services.RecipeService;

@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping({"/", "", "index"})
    public String getIndexPage(Model model) {
        log.debug("Index page viewed");
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }

}
