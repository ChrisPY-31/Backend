package com.chris.gestionproductosbackend.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "shopping_cart")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_shopping_cart")
    private Integer idShoppingCart;

    @Column(name = "id_product")
    private Integer idProduct;

    private Integer amount;

    private double total;

    @Column(name = "sub_total")
    private double subTotal;


}
