package com.example.Lunes.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/saludar")
@CrossOrigin("*")
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
