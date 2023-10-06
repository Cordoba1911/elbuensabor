package com.utn.jpa1.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "Domicilio")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Domicilio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Calle")
    private String calle;
    @Column(name = "Numero")
    private String numero;
    @Column(name = "Localidad")
    private String localidad;

}
