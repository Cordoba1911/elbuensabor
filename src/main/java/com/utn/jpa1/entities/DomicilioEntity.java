package com.utn.jpa1.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "domicilio")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class DomicilioEntity extends BaseDate {

    @Column(name = "calle")
    private String calle;
    @Column(name = "numero")
    private Integer numero;
    @Column(name = "numeroDpto")
    private Integer numeroDpto;
    @Column(name = "localidad")
    private String localidad;
    @Column(name = "codigoPostal")
    private Integer codigoPostal;
    @Column(name = "pisoDpto")
    private Integer pisoDpto;

}
