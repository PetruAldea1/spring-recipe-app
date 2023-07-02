package petru.springframework.springrecipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import petru.springframework.springrecipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository <Recipe,Long> {
}
