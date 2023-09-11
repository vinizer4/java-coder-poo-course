package com.example.springbootexercicios.models.repositories;

import com.example.springbootexercicios.models.entities.Produto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository
        extends CrudRepository<Produto, Integer> {

    public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

    @Query("SELECT p FROM Produto p WHERE p.nome LIKE %?1%")
    public Iterable<Produto> buscaPorNome(String parteNome);

}
