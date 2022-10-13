package com.example.ProyectoEjemploLogin.services;

import com.example.ProyectoEjemploLogin.dtos.UsuarioLogin;
import org.springframework.http.ResponseEntity;

public interface UsuarioService {
    public ResponseEntity<?> crearLoginService(UsuarioLogin data);

    public ResponseEntity<?> consultarUno();
}
