package com.example.MartesProfe.services.impl;

@Service
public class AutorServiceImpl implements AutorService {

    private final AutorRepository repository;

    public AutorServiceImpl(AutorRepository repository) {
        this.repository = repository;
    }


    @Override
    public ResponseEntity<?> crear(AutorParaGuardar dto) {
        return null;
    }

    @Override
    public ResponseEntity<?> consultarTodos() {
        return null;
    }

    @Override
    public ResponseEntity<?> consultarPorId(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<?> modificar(Long idAModificar, AutorParaGuardar data) {
        return null;
    }

    @Override
    public ResponseEntity<?> eliminar(Long idAEliminar) {
        return null;
    }
}
