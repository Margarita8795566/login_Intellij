package com.example.ProyectoLunes.controllers;

import com.example.ProyectoLunes.dtos.UsuarioParaCrear;
import com.example.ProyectoLunes.services.UsuarioService;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //anotaciones
@RequestMapping("/usuario")
@CrossOrigin("*")
@Log4j2
public class UsuarioController {
// inyeccion de dependenncia cuando se declara el private final nombre del service  servece y se anade el parametro por constructor
    private final UsuarioService service;

//se añade a un constructor por parametro
    public UsuarioController(UsuarioService service) {

        this.service = service;
    }

    @PostMapping//crear
    public ResponseEntity<?> crear(@RequestBody UsuarioParaCrear dataEntrante) {
      //  dataEntrante.setNombre("no me se mi nmbre");//setea la data
        return service.crearDesdeElService(dataEntrante);
    }
    @GetMapping// consultar
    public ResponseEntity<?> consultarTodos(){
        return service.consultarTodo();
    }
    @GetMapping("/{idUsuario}")
    public ResponseEntity<?> consultarUno(@PathVariable Long idUsuario){
        return service.consultarUno(idUsuario);

    }
    @GetMapping("/{idUsuario}")
    public ResponseEntity<?> consultarUno(@PathVariable Long idUsuario) {
        return service.consultarUno(idUsuario);
    }
    @PutMapping("/{id}")//actualizar
    public ResponseEntity<?> actualizar(@PathVariable Long id,@RequestBody UsuarioParaCrear dataEntrante){
        return service.actualizar(id,dataEntrante);
    }
    @DeleteMapping("/{id}")// eliminar
    public ResponseEntity<?> borrar(@PathVariable Long id){
        return service.borrar(id);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UsuarioParaCrear dataEntrante){
        return  service.buscarPorNombre(dataEntrante.getNombre(), dataEntrante.getClave());
    /*public ResponseEntity<?> login(String nombre, String clave){
        return  service.buscarPorNombre(nombre, clave)*/
    }

   /* @GetMapping
    public ResponseEntity<?> consultar(){
        return ResponseEntity.status(HttpStatus.OK).body("Hola desde el usuario controllerTodo Ok con el metodo consultar");
    }*/
}
