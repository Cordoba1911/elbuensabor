package com.utn.jpa1.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "detalle_factura")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class DetalleFacturaEntity extends BaseEntity{

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "subtotal", precision = 10, scale = 2)
    private int subtotal;

    @OneToOne()
    @JoinColumn(name = "id_articulo_manufacturado")
    private ArticuloManufacturadoEntity articuloManufacturado;

    @ManyToOne()
    @JoinColumn(name = "id_factura")
    private Factura factura;
}
