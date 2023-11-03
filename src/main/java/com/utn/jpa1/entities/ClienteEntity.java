package com.utn.jpa1.entities;


import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity  //Con esta etiqueta indico a la unidad de persistencia que esta entidad se debe guardar en la bd
@Table(name = "cliente")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Getter
@Setter
public class ClienteEntity extends BaseDate  {

    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Apellido")
    private String apellido;
    @Column(name = "Telefono")
    private String telefono;
    @Column(name = "Email")
    private String email;
    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "password", nullable = false)
    private String password;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "cliente_id")
    @Builder.Default
    private List<DomicilioEntity> domicilios = new ArrayList<DomicilioEntity>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "cliente_id")
    @Builder.Default
    private List<Pedido> pedidos = new ArrayList<Pedido>();

}