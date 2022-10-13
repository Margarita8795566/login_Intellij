package com.example.ProyectoEjemploLogin.controllers;

import com.example.ProyectoEjemploLogin.dtos.UsuarioLogin;
import com.example.ProyectoEjemploLogin.services.UsuarioService;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //anotaciones
@RequestMapping("/usuario")
@CrossOrigin("*")
@Log4j2

public class UsuarioController {
    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }
   /*@PostMapping
    public ResponseEntity<?> crear(@RequestBody UsuarioLogin dataEntrante) {
        //  dataEntrante.setNombre("no me se mi nmbre");//setea la data
        return service.crearLoginService(dataEntrante);
    }*/
    @GetMapping
    public ResponseEntity<?> consultarUno() {
        return service.consultarUno();
    }

}
