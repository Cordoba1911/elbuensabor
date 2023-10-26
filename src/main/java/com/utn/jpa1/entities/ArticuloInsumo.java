package com.utn.jpa1.entities;

import jakarta.persistence.*;

public class ArticuloInsumo extends BaseEntity {
    @Column(name = "denominacion")
    private String denominacion;
    @Column(name = "precioCompra")
    private int precioCompra;
    @Column(name = "stock_actual")
    private int stock_actual;
    @Column(name = "stock_minimo")
    private int stock_minimo;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_Rubro")
    private Rubro rubro;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_UnidadMedida")
    private UnidadMedida unidadMedida;
}
