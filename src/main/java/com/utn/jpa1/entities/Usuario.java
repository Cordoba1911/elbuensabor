package com.utn.jpa1.entities;



import com.utn.jpa1.ennumerations.FormadePago;

import com.utn.jpa1.ennumerations.RolUsuario;
import jakarta.persistence.*;

import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Value;

import java.beans.ConstructorProperties;
import java.util.Date;

    @Entity
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    @Builder
    @Table(name = "usuario")
    public class Usuario extends BaseDate {


        @NotNull
        @Column(name = "username", nullable = false)
        private String username;

        @NotNull
        @Column(name = "password", nullable = false)
        private String password;


        @NotNull
        @Column(name = "rol")
        @Enumerated(EnumType.STRING)
        private RolUsuario rol;

        @NotNull
        @Column(name = "activo", nullable = false)
        private Boolean activo;

        @Getter
        @OneToOne(mappedBy = "usuario", optional = false)
        private ClienteEntity cliente;

        public void setCliente(ClienteEntity cliente) {
            this.cliente = cliente;
        }
    }

