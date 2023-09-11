package com.example.springbootexercicios.models.repositories;

import com.example.springbootexercicios.models.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository
        extends CrudRepository<Produto, Integer> {

}
