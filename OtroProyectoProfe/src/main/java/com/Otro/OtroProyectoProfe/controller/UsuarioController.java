package com.Otro.OtroProyectoProfe.controller;

import com.Otro.OtroProyectoProfe.dtos.UsuarioDto;
import lombok.extern.log4j.Log4j2;
import org.apache.coyote.Response;
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
