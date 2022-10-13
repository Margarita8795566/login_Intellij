package com.repeticion.profe.proyectoProfe.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nuevo-controller")
@CrossOrigin("*") //esto va con angular , esta disponible para tod
@Log4j2
public class NuevaClase {
    @GetMapping
    public ResponseEntity<?> saludar() {
        log.info("Ejecutando controllador  quien soy  funcion saludar");
        return ResponseEntity.status(HttpStatus.OK).body("Hola nose quien soy");
    }
}
