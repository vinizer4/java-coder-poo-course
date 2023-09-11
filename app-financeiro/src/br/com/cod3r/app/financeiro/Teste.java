package br.com.cod3r.app.financeiro;

import br.com.cod3r.app.calculo.Calculadora;
import br.com.cod3r.app.calculo.interno.OperacoesAritmeticas;

import java.lang.reflect.Field;

public class Teste {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        System.out.println(calc.soma(2, 3, 4));

        OperacoesAritmeticas op = new OperacoesAritmeticas();

        System.out.println(op.soma(2, 3, 4));

        System.out.println(Calculadora.class.getName());

        try {
            Field fieldId = Calculadora.class.getDeclaredFields()[0];
            fieldId.setAccessible(true);
            fieldId.set(calc, "def");
            fieldId.setAccessible(false);

            System.out.println(calc.getId());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Calculadora.class.getDeclaredFields()[0].getName());

    }
}
