package com.example.MartesProfe.services.impl;

import com.example.MartesProfe.dtos.CursoEditarPorNombre;
import com.example.MartesProfe.dtos.CursoParaCrearDto;
import com.example.MartesProfe.entities.Curso;
import com.example.MartesProfe.repositories.CursoRepository;
import com.example.MartesProfe.services.CursoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {

    private final CursoRepository repository;

    public CursoServiceImpl(CursoRepository repository) {
        this.repository = repository;
    }

    @Override
    public ResponseEntity<?> crear(CursoParaCrearDto dto) {
        //Crear la entity y setear Valores de mi entity a guardar
        Curso noGuardado = new Curso();
        noGuardado.setNombre(dto.getNombreEntrante()+"-2022");
        noGuardado.setPremiun(dto.getPremiunEntrante());
        //Ocupar el repository y oupar el metodo save
        Curso guardado=repository.save(noGuardado);

        return ResponseEntity.status(HttpStatus.OK).body(guardado);
    }

    @Override
    public ResponseEntity<?> consultarTodos() {
        //Consultamos con el Repository a todos los registros
        List<Curso> cursosEnBd=repository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(cursosEnBd);
    }

    @Override
    public ResponseEntity<?> consultarPorId(Long id) {
        //Ocupar El Repository con el metodo Buscar Por ID
        Curso cursoEnBD=repository.findById(id).orElse(null);
        return ResponseEntity.status(HttpStatus.OK).body(cursoEnBD);
    }

    @Override
    public ResponseEntity<?> modificar(Long idAModificar, CursoParaCrearDto data) {
        Curso cursoEnBD=repository.findById(idAModificar).orElse(null);
        cursoEnBD.setNombre(data.getNombreEntrante());
        cursoEnBD.setPremiun(data.getPremiunEntrante());
        Curso cursoActualizado=repository.save(cursoEnBD);
        return ResponseEntity.status(HttpStatus.OK).body(cursoActualizado);
    }

    @Override
    public ResponseEntity<?> eliminar(Long idAEliminar) {
        repository.deleteById(idAEliminar);
        return ResponseEntity.status(HttpStatus.OK).body("Eliminado");
    }

    @Override
    public ResponseEntity<?> modificarPorNombre(CursoEditarPorNombre dataEntrante) {
        //Buscar el curso a Buscar por el Nombre
        Curso enBd=repository.buscarPorNombre(dataEntrante.getNombreActual()).orElse(null);

        //Setearle a ese curso encontrado el nuevo Nombre
        enBd.setNombre(dataEntrante.getNuevoNombre());

        //ir a modificarlo en la BD (guardarlo)
        Curso editado= repository.save(enBd);

        //Retornar algo
        return ResponseEntity.status(HttpStatus.OK).body(editado);
    }
}