package com.utn.jpa1.Auth;

import com.utn.jpa1.Jwt.JwtService;
import com.utn.jpa1.ennumerations.Rol;
import com.utn.jpa1.entities.Usuario;
import com.utn.jpa1.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UsuarioRepository usuarioRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    public AuthResponse login(LoginRequest request) {
        return null;
    }

    public AuthResponse register(RegisterRequest request) {
        Usuario user = Usuario.builder()
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .rol(Rol.CLIENTE)
                .build();
        usuarioRepository.save(user);

        return AuthResponse.builder().
                token(jwtService.getToken(user)).build();
    }
}
