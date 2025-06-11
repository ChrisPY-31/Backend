package com.chris.gestionproductosbackend.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

//Este es el de venta
@Entity
@Table(name = "sales")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Sales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Sale")
    private Integer idSale;

    @Column(name = "id_user")
    private Integer idUser;

    private double total;

    @Column(name = "half_payment")
    private String half_payment;

    private LocalDate date;

    @OneToMany
    private List<DetailSale> detailSales;




}
