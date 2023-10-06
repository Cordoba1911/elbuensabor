package com.utn.jpa1.entities;

import com.utn.jpa1.ennumerations.FormadePago;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;


import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Table(name = "Pedido")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Factura implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "total")
    private int total;
    @OneToOne(mappedBy = "factura")
    private Pedido pedido;
    @Enumerated(EnumType.STRING)
    private FormadePago formadePago;

}
