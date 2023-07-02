package petru.springframework.springrecipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import petru.springframework.springrecipeapp.domain.Category;
import petru.springframework.springrecipeapp.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {
}
