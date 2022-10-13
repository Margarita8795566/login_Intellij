package com.Otro.OtroProyectoProfe.controller;


import com.Otro.OtroProyectoProfe.dtos.UsuarioDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/segundaprueba")
//nos permite aceptar Reques de cualquir app
@CrossOrigin("*") //esto va con angular , esta disponible para tod
//nos permite loguear por consola
@Log4j2
public class SegundoController {
    @GetMapping
    public ResponseEntity<?> funcionUno() {
        log.info("Ejecutando segundoController la funcionUno");
        return org.springframework.http.ResponseEntity.status(HttpStatus.OK).body("Hola desde segundoController la funcionUno");
    }
    @GetMapping("/{nombre}")
    public ResponseEntity<?> funcionDos(@PathVariable String nombre) {
        log.info("Ejecutando segundoController la funcionDos");
        return org.springframework.http.ResponseEntity.status(HttpStatus.OK).body("Hola desde segundoController ejecutando funcionDos y tu nombre es "+ nombre);
    }
   @GetMapping("/{nombre}/{nombre2}")
    public ResponseEntity<?> funcionConDosVariables(@PathVariable String nombre,@PathVariable String nombre2) {
        log.info("Ejecutando segundoController la funcionConDosVariables");
        return org.springframework.http.ResponseEntity.status(HttpStatus.OK).body("Hola desde segundoController ejecutando funcionConDosVariables y tu nombre es "+ nombre+ "  tu segundo nombre "+ nombre2);
    }
    @PostMapping
    public ResponseEntity<?> funcionTres() {
        log.info("Ejecutando segundoController la funcionTres");
        return org.springframework.http.ResponseEntity.status(HttpStatus.OK).body("Hola desde segundoController la funcionTres con Nombre: "
        );
    }
    @PostMapping("/algo")
    public ResponseEntity<?> funcionTresAlgo() {
        log.info("Ejecutando segundoController la funcionTresAlgo");
        return org.springframework.http.ResponseEntity.status(HttpStatus.OK).body("Hola desde segundoController la funcionTresAlgo");
    }
    @PutMapping("/{idAlgo}")
    public ResponseEntity<?> funcionCuatro(@PathVariable String idAlgo) {
        log.info("Ejecutando segundoController la funcionCuatro");
        return org.springframework.http.ResponseEntity.status(HttpStatus.OK).body("Hola desde segundoController la funcionCuatro " +idAlgo);
    }
    @DeleteMapping
    public ResponseEntity<?> funcionCinco(@PathVariable String idAlgo) {
        log.info("Ejecutando segundoController la funcionCinco");
        return org.springframework.http.ResponseEntity.status(HttpStatus.OK).body("Hola desde segundoController la funcionCinco" +idAlgo);
    }


}
