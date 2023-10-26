package com.utn.jpa1.entities;

import com.utn.jpa1.ennumerations.EstadoPedido;
import com.utn.jpa1.ennumerations.FormadePago;
import com.utn.jpa1.ennumerations.TipoEnvio;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "pedido")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pedido extends BaseDate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "desc_aplicado")
    private Double descAplicado;

    @Column(name = "estado")
    @Enumerated(EnumType.STRING)
    private EstadoPedido estado;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "forma_pago")
    @Enumerated(EnumType.STRING)
    private FormadePago formadePago;

    @Column(name = "tipo_envio")
    @Enumerated(EnumType.STRING)
    private TipoEnvio tipoEnvio;
    private double total;

    @ManyToOne()
    @JoinColumn(name = "id_cliente")
    private ClienteEntity cliente;


    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "Pedido_id")
    @Builder.Default
    private List<DetalleArticuloManufacturado> detalleArticuloManufacturados = new ArrayList<DetalleArticuloManufacturado>();


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_Factura")
    private Factura factura;
}
