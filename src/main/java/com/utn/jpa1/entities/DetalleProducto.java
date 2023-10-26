package com.utn.jpa1.entities;

import jakarta.persistence.Column;

public class DetalleProducto  extends BaseEntity{
    @Column(name = "cantidad")
    private int cantidad;
}
