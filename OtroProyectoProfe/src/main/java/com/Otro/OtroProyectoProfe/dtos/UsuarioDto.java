package com.Otro.OtroProyectoProfe.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data //para utilizar los getter y los setter
@NoArgsConstructor   //para intanciar la clase
public class UsuarioDto {

    private String nombre;
    private String clave;
}
