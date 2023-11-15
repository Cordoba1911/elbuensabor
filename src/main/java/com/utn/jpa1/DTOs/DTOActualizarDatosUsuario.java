package com.utn.jpa1.DTOs;

import com.utn.jpa1.ennumerations.Rol;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DTOActualizarDatosUsuario {

    private String username;
    private String password;
    private Rol rol;
    private Boolean activo;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}