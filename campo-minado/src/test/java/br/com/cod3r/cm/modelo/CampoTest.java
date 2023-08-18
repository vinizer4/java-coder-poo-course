package br.com.cod3r.cm.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CampoTest {

    private Campo campo;

    @BeforeEach
    void iniciarCampo() {
        campo = new Campo(3, 3);
    }

    @Test
    void testeVizinhoDistancia1Esquerda() {
        Campo vizinhoEsquerda = new Campo(3, 2);
        boolean resultadoEsquerda = campo.adicionarVizinho(vizinhoEsquerda);
        Assertions.assertTrue(resultadoEsquerda);
    }

    @Test
    void testeVizinhoDistancia1Direita() {
        Campo vizinhoDireita = new Campo(3, 4);
        boolean resultadoDireita = campo.adicionarVizinho(vizinhoDireita);
        Assertions.assertTrue(resultadoDireita);
    }

    @Test
    void testeVizinhoDistancia1Emcima() {
        Campo vizinho = new Campo(2, 3);
        boolean resultado = campo.adicionarVizinho(vizinho);
        Assertions.assertTrue(resultado);
    }

    @Test
    void testeVizinhoDistancia1Embaixo() {
        Campo vizinho = new Campo(4, 3);
        boolean resultado = campo.adicionarVizinho(vizinho);
        Assertions.assertTrue(resultado);
    }

    @Test
    void testeVizinhoDistancia2() {
        Campo vizinho = new Campo(2, 2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        Assertions.assertTrue(resultado);
    }

    @Test
    void testeNaoVizinho() {
        Campo vizinho = new Campo(1, 1);
        boolean resultado = campo.adicionarVizinho(vizinho);
        Assertions.assertFalse(resultado);
    }
}
