package com.chris.gestionproductosbackend.Repository;

import com.chris.gestionproductosbackend.Model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products , Integer> {
}
