package com.example.Lunes.controller;

import com.example.Lunes.dtos.UsuarioDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@CrossOrigin("*")
@Log4j2
public class UsuarioController {
    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody UsuarioDto dataEntrante){
        return ResponseEntity.status(HttpStatus.OK).body("Todo Ok");
    }
}
