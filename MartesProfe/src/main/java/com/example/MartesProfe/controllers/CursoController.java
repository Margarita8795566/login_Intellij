package com.example.MartesProfe.controllers;

import com.example.MartesProfe.dtos.CursoEditarPorNombre;
import com.example.MartesProfe.dtos.CursoParaCrearDto;
import com.example.MartesProfe.services.CursoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/curso")
@CrossOrigin("*")
@Log4j2
public class CursoController {
    private final CursoService service;

    public CursoController(CursoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> crear(@RequestBody CursoParaCrearDto dto){
        return service.crear(dto);
    }


    @GetMapping
    public ResponseEntity<?> consultarTodos(){
        return service.consultarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> consultarUno(@PathVariable  Long id){
        return service.consultarPorId(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> actualizar(@PathVariable Long id,@RequestBody CursoParaCrearDto dataEntrante){
        return service.modificar(id,dataEntrante);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> borrar(@PathVariable Long id){
        return service.eliminar(id);
    }

    @PutMapping("/modificarpornombre")
    public ResponseEntity<?> actualizarPorNombre(@RequestBody CursoEditarPorNombre dataEntrante){
        return service.modificarPorNombre(dataEntrante);
    }
}
