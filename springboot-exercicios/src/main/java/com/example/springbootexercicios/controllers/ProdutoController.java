package com.example.springbootexercicios.controllers;

import com.example.springbootexercicios.models.entities.Produto;
import com.example.springbootexercicios.models.repositories.ProdutoPaginateRepository;
import com.example.springbootexercicios.models.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private ProdutoPaginateRepository produtoPaginateRepository;

//    @PostMapping
//    public @ResponseBody Produto novoProduto(
//            @Valid Produto produto) {
//
//        produtoRepository.save(produto);
//
//        return produto;
//    }

    @GetMapping
    public Iterable<Produto> obterProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping("/pagina/{numeroPagina}/{qtdePagina}")
    public Iterable<Produto> obterProdutosPorPagina(
            @PathVariable int numeroPagina,
            @PathVariable int qtdePagina) {

        if (qtdePagina >= 5) qtdePagina = 5;

        Pageable page = PageRequest.of(numeroPagina, qtdePagina);

        return produtoPaginateRepository.findAll(page);
    }

    @GetMapping("/{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
        return produtoRepository.findById(id);
    }

//    @PutMapping
//    public Produto alterarProduto(@Valid Produto produto) {
//        produtoRepository.save(produto);
//        return produto;
//    }

    @RequestMapping(method = {RequestMethod.PATCH, RequestMethod.PUT})
    public @ResponseBody Produto salvarProduto(@Valid Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }

    @DeleteMapping("/{id}")
    public void excluirProduto(@PathVariable int id) {
        produtoRepository.deleteById(id);
    }

    @GetMapping("/nome/{parteNome}")
    public Iterable<Produto> obterProdutosPorNome(
            @PathVariable String parteNome) {
        return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
    }
}
