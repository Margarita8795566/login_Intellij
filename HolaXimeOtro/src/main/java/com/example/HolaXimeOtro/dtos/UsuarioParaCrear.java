package com.example.HolaXimeOtro.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UsuarioParaCrear {
    private String nombre;
    private String clave;
}
