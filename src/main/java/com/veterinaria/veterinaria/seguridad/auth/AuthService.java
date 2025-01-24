package com.veterinaria.veterinaria.seguridad.auth;

import com.veterinaria.veterinaria.seguridad.usuario.model.Usuario;
import com.veterinaria.veterinaria.seguridad.usuario.repository.UsuarioRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    public AuthService(UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder, JwtUtil jwtUtil) {
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
    }

    /**
     * Método para autenticar un usuario.
     *
     * @param username Nombre de usuario.
     * @param password Contraseña sin encriptar proporcionada por el cliente.
     * @return Token JWT si las credenciales son válidas.
     * @throws RuntimeException Si las credenciales son inválidas.
     */
    public String login(String username, String password) {
        Usuario usuario = usuarioRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        // Valida la contraseña utilizando el PasswordEncoder
        if (!passwordEncoder.matches(password, usuario.getPassword())) {
            throw new RuntimeException("Credenciales inválidas");
        }

        // Genera y retorna el token JWT
        return jwtUtil.generateToken(username);
    }
}
