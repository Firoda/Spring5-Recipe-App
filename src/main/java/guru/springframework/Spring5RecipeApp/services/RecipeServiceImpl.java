package guru.springframework.Spring5RecipeApp.services;

import guru.springframework.Spring5RecipeApp.domain.Recipe;
import guru.springframework.Spring5RecipeApp.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipe() {
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().forEach(recipeSet::add);

        return recipeSet;
    }
}
