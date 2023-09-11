package com.example.springbootexercicios.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {


    @GetMapping("/somar/{n1}/{n2}")
    public int somar(@PathVariable int n1,@PathVariable int n2) {
        return n1 + n2;
    }

    @GetMapping("/subtrair/{n1}/{n2}")
    public int subtrair(
            @RequestParam int n1,
            @RequestParam int n2) {
        return n1 - n2;
    }
}
