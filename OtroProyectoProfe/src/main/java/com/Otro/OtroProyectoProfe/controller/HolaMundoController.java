package com.Otro.OtroProyectoProfe.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/saludar")
//nos permite aceptar Reques de cualquir app
@CrossOrigin("*") //esto va con angular , esta disponible para tod
//nos permite loguear por consola
@Log4j2
public class HolaMundoController {
    @GetMapping
    public ResponseEntity<?> saludar() {
        log.info("Ejecutando controllador  HolaMundo  funcion saludar");
        return ResponseEntity.status(HttpStatus.OK).body("Hola desde Hola mundo");
    }
    @GetMapping("/{name}")
    public ResponseEntity<?> saludarPorNombre(@PathVariable String name) {
        log.info("Necesita Saludar a " + name);
        return ResponseEntity.status(HttpStatus.OK).body("Hola "+ name);
    }
    @GetMapping("/alternativo/{name}")
    public ResponseEntity<?> saludarPorNombreAlternativo(@PathVariable String name) {
        log.info("Necesita Saludar a " + name+" de forma Alternativa");
        return ResponseEntity.status(HttpStatus.OK).body("Hola "+ name +" de forma Alternativa");
    }
}