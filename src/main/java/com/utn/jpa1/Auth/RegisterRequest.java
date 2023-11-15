package com.utn.jpa1.Auth;

import com.utn.jpa1.ennumerations.Rol;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    String username;
    String password;
    String nombre;
    String apellido;
    String country;
    Rol rol;
}
