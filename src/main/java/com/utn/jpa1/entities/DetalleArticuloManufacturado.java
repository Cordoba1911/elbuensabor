package com.utn.jpa1.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "DetallePedido")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class DetalleArticuloManufacturado extends BaseDate {

    @Column(name = "Cantidad")
    private int cantidad;
    @Column(name = "Subtotal")
    private double subtotal;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk.producto")
    private ArticuloManufacturadoEntity articuloManufacturadoEntity;
}
