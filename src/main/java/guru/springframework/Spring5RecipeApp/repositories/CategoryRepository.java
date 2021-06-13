package guru.springframework.Spring5RecipeApp.repositories;

import guru.springframework.Spring5RecipeApp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
