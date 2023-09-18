package com.utn.jpa1.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "DetallePedido")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DetallePedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Cantidad")
    private int cantidad;
    @Column(name = "Subtotal")
    private double subtotal;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk.producto")
    private Producto producto;
}
