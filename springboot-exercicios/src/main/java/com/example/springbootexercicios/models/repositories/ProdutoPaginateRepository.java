package com.example.springbootexercicios.models.repositories;

import com.example.springbootexercicios.models.entities.Produto;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProdutoPaginateRepository
    extends PagingAndSortingRepository<Produto, Integer> {
}
