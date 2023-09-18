package com.utn.jpa1.entidades;

import com.utn.jpa1.enumeraciones.TipoProducto;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "producto")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Tipo")
    @Enumerated(EnumType.STRING)
    private TipoProducto tipo;

    @Column(name = "TiempoEstimadoCocina")
    private int tiempoEstimadoCocina;
    @Column(name = "Denominacion")
    private String denominacion;
    @Column(name = "PrecioVenta")
    private double precioVenta;
    @Column(name = "PrecioCompra")
    private double precioCompra;
    @Column(name = "StockActual")
    private int stockActual;
    @Column(name = "StockMinimo")
    private int stockMinimo;
    @Column(name = "UnidadMedida")
    private String unidadMedida;
    @Column(name = "Receta")
    private String receta;
}
