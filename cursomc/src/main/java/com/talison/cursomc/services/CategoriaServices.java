package com.talison.cursomc.services;

import com.talison.cursomc.domain.Categoria;
import com.talison.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServices {

    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(Integer id){
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("objeto não encontrado! id= " + id ));
    }

    public List<Categoria> listar(){
        return repo.findAll();
    }
}
