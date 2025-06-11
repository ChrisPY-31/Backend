package com.chris.gestionproductosbackend.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "detail_sale")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetailSale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sales_detail")
    private Integer idSalesDetail;

    @Column(name = "id_sale")
    private Integer idSale;

    @Column(name = "id_product")
    private Integer idProducto;

    private Integer amount;

    @Column(name = "price_unitary")
    private double priceUnitary;

    @Column(name = "sub_total")
    private double subTotal;

    @ManyToOne
    @JoinColumn(name = "id_sale" , referencedColumnName = "id_sale" , insertable = false , updatable = false)
    private Sales sales;
}
