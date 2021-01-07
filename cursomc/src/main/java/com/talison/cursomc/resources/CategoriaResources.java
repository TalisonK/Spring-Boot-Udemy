package com.talison.cursomc.resources;

import com.talison.cursomc.domain.Categoria;
import com.talison.cursomc.services.CategoriaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResources {

    @Autowired
    private CategoriaServices services;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> list() {
        List<Categoria> obj = services.listar();
        return ResponseEntity.ok().body(obj);
    }

//    @RequestMapping(value = "/cadastro", method = RequestMethod.POST)
//    public ResponseEntity<Categoria> addCadastro(){
//        System.out.println(RequestEntity.method().body());
//        return ResponseEntity.ok().body();
//    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Categoria> find(@PathVariable Integer id) {
        return ResponseEntity.ok().body(services.buscar(id));
    }
}
