package com.chris.gestionproductosbackend.Repository;

import com.chris.gestionproductosbackend.Model.Category;
import org.springframework.data.repository.ListCrudRepository;

public interface CategoryRepository extends ListCrudRepository<Category , Integer> {
}
