package br.com.cod3r.app.calculo;

import br.com.cod3r.app.Calculadora;
import br.com.cod3r.app.calculo.interno.OperacoesAritmeticas;
import br.com.cod3r.logging.Logger;

public class CalculadoraImpl implements Calculadora {

    private String id = "abc";

    private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

    @Override
    public double soma(double... nums) {
        Logger.info("Somando...");
        return opAritmeticas.soma(nums);
    }

    public String getId() {
        return id;
    }
}
