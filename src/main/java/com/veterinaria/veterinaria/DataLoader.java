package com.veterinaria.veterinaria;

import com.veterinaria.veterinaria.modules.empleado.model.Empleado;
import com.veterinaria.veterinaria.modules.empleado.repository.EmpleadoRepository;
import com.veterinaria.veterinaria.seguridad.usuario.model.Usuario;
import com.veterinaria.veterinaria.seguridad.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Profile("h2")
public class DataLoader implements CommandLineRunner {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public DataLoader(EmpleadoRepository empleadoRepository, UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder) {
        this.empleadoRepository = empleadoRepository;
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    public void run(String... args) throws Exception {
        // Crear empleados
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Carlos");
        empleado1.setApellido("Gómez");
        empleado1.setDocumento("12345678");
        empleado1.setFechaNac(LocalDate.parse("1990-05-15")); // Convertir String a LocalDate
        empleado1.setDireccion("Av. Siempre Viva 742");
        empleado1.setEstadoCivil("Casado");
        empleado1.setEmail("carlos.gomez@example.com");
        empleado1.setTelefono("555-1234");
        empleado1.setTelefonoSecundario("555-5678");

        Empleado empleado2 = new Empleado();
        empleado2.setNombre("María");
        empleado2.setApellido("López");
        empleado2.setDocumento("98765432");
        empleado2.setFechaNac(LocalDate.parse("1985-08-10"));
        empleado2.setDireccion("Calle Falsa 123");
        empleado2.setEstadoCivil("Soltera");
        empleado2.setEmail("maria.lopez@example.com");
        empleado2.setTelefono("555-8765");

        Empleado empleado3 = new Empleado();
        empleado3.setNombre("Luis");
        empleado3.setApellido("Martínez");
        empleado3.setDocumento("45678901");
        empleado3.setFechaNac(LocalDate.parse("1992-03-25"));
        empleado3.setDireccion("Calle Principal 456");
        empleado3.setEstadoCivil("Divorciado");
        empleado3.setEmail("luis.martinez@example.com");
        empleado3.setTelefono("555-6789");
        empleado3.setTelefonoSecundario("555-4321");

        empleadoRepository.save(empleado1);
        empleadoRepository.save(empleado2);
        empleadoRepository.save(empleado3);


        // Crear usuarios
        Usuario usuario1 = new Usuario();
        usuario1.setUsername("carlosg");
        usuario1.setPassword(passwordEncoder.encode("password123"));
        usuario1.setActivo(true);
        usuario1.setEmpleado(empleado1);

        Usuario usuario2 = new Usuario();
        usuario2.setUsername("marial");
        usuario2.setPassword(passwordEncoder.encode("password123"));
        usuario2.setActivo(true);
        usuario2.setEmpleado(empleado2);

        Usuario usuario3 = new Usuario();
        usuario3.setUsername("luism");
        usuario3.setPassword(passwordEncoder.encode("password123"));
        usuario3.setActivo(true);
        usuario3.setEmpleado(empleado3);

        usuarioRepository.save(usuario1);
        usuarioRepository.save(usuario2);
        usuarioRepository.save(usuario3);
    }
}
