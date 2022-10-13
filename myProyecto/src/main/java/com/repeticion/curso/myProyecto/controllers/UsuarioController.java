package com.repeticion.curso.myProyecto.controllers;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
@CrossOrigin("*") //esto va con angular , esta disponible para tod
@Log4j2
public class UsuarioController {

  //  private final UsuarioService service;

    public UsuarioController() { //el va a declarar ,etodos GET; POST;ETC...

    }
    @PostMapping
    public ResponseEntity<?>crear(){
        return ResponseEntity.status(HttpStatus.OK).body("hola desde el usuario controller motodo crear");
    }
}
