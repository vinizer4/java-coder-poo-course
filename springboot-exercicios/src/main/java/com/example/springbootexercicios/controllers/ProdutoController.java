package com.example.springbootexercicios.controllers;

import com.example.springbootexercicios.models.entities.Produto;
import com.example.springbootexercicios.models.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public @ResponseBody Produto novoProduto(
            @Valid Produto produto) {

        produtoRepository.save(produto);

        return produto;
    }
}
