    package com.chris.gestionproductosbackend.Model;

    import jakarta.persistence.*;
    import lombok.AllArgsConstructor;
    import lombok.Getter;
    import lombok.NoArgsConstructor;
    import lombok.Setter;

    @Entity
    @Table(name = "products")
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public class Products {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_product")
        private Integer idProduct;

        @Column(name = "id_category")
        private Integer idCategory;

        private String name;

        private String image;

        private String description;

        private String barCode;

        @Column( columnDefinition = "Decimal(5,2)")
        private double price;

        @Column(name = "price_Sales" , columnDefinition = "Decimal(5,2)")
        private double priceSale;

        private int amount;

        private Boolean available;

        @ManyToOne
        @JoinColumn(name = "id_category" , referencedColumnName = "id_category" , insertable = false , updatable = false)
        private Category category;

    }
