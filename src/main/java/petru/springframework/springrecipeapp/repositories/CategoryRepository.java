package petru.springframework.springrecipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import petru.springframework.springrecipeapp.domain.Category;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
