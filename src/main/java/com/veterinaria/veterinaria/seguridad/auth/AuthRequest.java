package com.veterinaria.veterinaria.seguridad.auth;

import lombok.Data;

@Data
public class AuthRequest {
    private String username;
    private String password;
}
