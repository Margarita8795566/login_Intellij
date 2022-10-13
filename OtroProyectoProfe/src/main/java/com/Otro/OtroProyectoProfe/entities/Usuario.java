package com.Otro.OtroProyectoProfe.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//Mapear o decir el Springboot que esto sera una tabla en la BD
@Entity
//Para darle el nombre que tendra en nuestra BD
@Table(name = "usuarios")
// Para tener Getters Y Setters
@Data
////Para tener constructores Sin Parametros
@NoArgsConstructor
public class Usuario {
    @Id
    //para que se generar el auto incremento de identity id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String clave;
    private Boolean isOk;
}
