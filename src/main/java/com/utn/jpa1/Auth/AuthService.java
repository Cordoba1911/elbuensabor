package com.utn.jpa1.Auth;

import com.utn.jpa1.Jwt.JwtService;
import com.utn.jpa1.ennumerations.Rol;
import com.utn.jpa1.entities.Usuario;
import com.utn.jpa1.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UsuarioRepository usuarioRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    public AuthResponse login(LoginRequest request) {
        authenticationManager.authenticate((new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword())));
        UserDetails user = usuarioRepository.findByUsername(request.getUsername()).orElseThrow();
        String token = jwtService.getToken(user);
        return AuthResponse.builder()
                .token(token).build();
    }

    public AuthResponse register(RegisterRequest request) {
        Usuario user = Usuario.builder()
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .rol(request.rol)
                .nombre(request.getNombre())
                .apellido(request.getApellido())
                .build();
        usuarioRepository.save(user);

        return AuthResponse.builder().
                token(jwtService.getToken(user)).build();
    }
}
