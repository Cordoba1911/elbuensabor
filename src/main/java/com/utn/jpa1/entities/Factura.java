package com.utn.jpa1.entities;

import com.utn.jpa1.ennumerations.FormadePago;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Table(name = "Pedido")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Factura extends BaseDate {

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "total")
    private int total;
    @OneToOne(mappedBy = "id_pedido")
    private Pedido pedido;
    @Enumerated(EnumType.STRING)
    private FormadePago formadePago;
    @OneToMany(mappedBy = "factura")
    private List<DetalleFacturaEntity> detallesFactura = new ArrayList<>();

}
