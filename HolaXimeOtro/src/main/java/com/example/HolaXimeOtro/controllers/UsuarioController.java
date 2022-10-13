package com.example.HolaXimeOtro.controllers;

import com.example.HolaXimeOtro.dtos.UsuarioParaCrear;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@CrossOrigin
@Log4j2
public class UsuarioController {
    @PostMapping
    public ResponseEntity<?> crear(@RequestBody UsuarioParaCrear dataEntrante){
        return ResponseEntity.status(HttpStatus.OK).body("Estoy creando el usuario "+dataEntrante.getNombre());
    }
    @GetMapping
    public ResponseEntity<?> consultar(){
        return ResponseEntity.status(HttpStatus.OK).body("hola desde el usuario controller metodo consultar");
    }
}
