package com.example.ProyectoEjemploLogin.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UsuarioLogin {
    private String nombre;
    private String clave;
}
