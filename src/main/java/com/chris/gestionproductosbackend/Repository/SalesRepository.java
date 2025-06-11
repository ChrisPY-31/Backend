package com.chris.gestionproductosbackend.Repository;

import com.chris.gestionproductosbackend.Model.Sales;
import org.springframework.data.repository.ListCrudRepository;

public interface SalesRepository extends ListCrudRepository<Sales , Integer> {

}
