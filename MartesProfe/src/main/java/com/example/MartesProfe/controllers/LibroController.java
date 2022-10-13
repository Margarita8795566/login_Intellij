package com.example.MartesProfe.controllers;

import com.example.MartesProfe.dtos.LibroParaGuardarDto;
import com.example.MartesProfe.services.LibroService;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/libro")
@CrossOrigin("*")
@Log4j2
public class LibroController {

    private final LibroService service;

    public LibroController(LibroService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> crear(@RequestBody LibroParaGuardarDto dataEntrante){
        return service.guardar(dataEntrante);
    }

}
