package guru.springframework.Spring5RecipeApp.controllers;


import guru.springframework.Spring5RecipeApp.domain.Category;
import guru.springframework.Spring5RecipeApp.repositories.CategoryRepository;
import guru.springframework.Spring5RecipeApp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"/", "/index.html", ""})
    public String getIndexPage(Model model){

       model.addAttribute("recipes", recipeService.getRecipe());
       return "index";
    }
}
