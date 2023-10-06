package com.utn.jpa1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fechaAlta")
    private Date fechaAlta;
    @Column(name = "fechaBaja")
    private Date fechaBaja;
    @Column(name = "fechaModificacion")
    private Date fechaModificacion;
}
