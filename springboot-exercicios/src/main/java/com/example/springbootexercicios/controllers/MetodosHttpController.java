package com.example.springbootexercicios.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/metodos")
public class MetodosHttpController {

    @GetMapping("/get")
    public String get() {
        return "Requisição GET";
    }

    @GetMapping("/post")
    public String post() {
        return "Requisição POST";
    }

    @GetMapping("/put")
    public String put() {
        return "Requisição PUT";
    }

    @GetMapping("/delete")
    public String delete() {
        return "Requisição DELETE";
    }

    @GetMapping("/patch")
    public String patch() {
        return "Requisição PATCH";
    }
}
