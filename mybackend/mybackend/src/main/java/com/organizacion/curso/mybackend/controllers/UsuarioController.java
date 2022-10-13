package com.organizacion.curso.mybackend.controllers;

import com.organizacion.curso.mybackend.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class UsuarioController {
        @RequestMapping(value = "usuario/{id}")//cuando recibe parametros
        public Usuario getUsuario(@PathVariable long id){
            Usuario usuario= new Usuario();
            usuario.setId(id);
            usuario.setNombre("Julieta");
            usuario.setApellido("Lopez");
            usuario.setEmail("julietalopez@gmail.com");
            usuario.setTelefono("54785412");
            return usuario;
        }
        @RequestMapping(value = "usuario")
        public Usuario editar(){
            Usuario usuario= new Usuario();
            usuario.setNombre("Julieta");
            usuario.setApellido("Lopez");
            usuario.setEmail("julietalopez@gmail.com");
            usuario.setTelefono("54785412");
            return usuario;
        }
        @RequestMapping(value = "usuario")
        public Usuario eliminar(){
            Usuario usuario= new Usuario();
            usuario.setNombre("Julieta");
            usuario.setApellido("Lopez");
            usuario.setEmail("julietalopez@gmail.com");
            usuario.setTelefono("54785412");
            return usuario;
        }
        @RequestMapping(value = "usuario")
        public Usuario buscar(){
            Usuario usuario= new Usuario();
            usuario.setNombre("Julieta");
            usuario.setApellido("Lopez");
            usuario.setEmail("julietalopez@gmail.com");
            usuario.setTelefono("54785412");
            return usuario;
        }
    }



