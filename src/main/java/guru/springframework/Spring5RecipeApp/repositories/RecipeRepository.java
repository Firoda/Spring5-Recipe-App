package guru.springframework.Spring5RecipeApp.repositories;

import guru.springframework.Spring5RecipeApp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {



}
