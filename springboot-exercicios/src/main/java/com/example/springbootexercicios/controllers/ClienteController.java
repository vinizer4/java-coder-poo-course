package com.example.springbootexercicios.controllers;

import com.example.springbootexercicios.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/cliente")
public class ClienteController {

    @GetMapping("/obter")
    public Cliente obterCliente() {
        return new Cliente(1, "Fulano", "123.456.789-00");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorId(@PathVariable int id) {
        return new Cliente(id, "Fulano", "123.456.789-00");
    }
}
