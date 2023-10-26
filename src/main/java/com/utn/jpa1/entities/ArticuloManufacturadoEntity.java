package com.utn.jpa1.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "producto")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Builder
public class ArticuloManufacturadoEntity extends BaseDate {

    @Column(name = "TiempoEstimadoCocina")
    private int tiempoEstimadoCocina;
    @Column(name = "Denominacion")
    private String denominacion;
    @Column(name = "PrecioVenta")
    private double precioVenta;
    @Column(name = "Receta")
    private String receta;
    @Column(name = "costo")
    private int costo;
    @Column(name = "url_imagen")
    private String urlImagen;

    @OneToMany(mappedBy = "articuloManufacturado")
    private List<DetalleArticuloManufacturado> detallesArticuloManufacturado = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "id_tipoArticulo")
    private TipoArticulo tipoArticulo;

}
