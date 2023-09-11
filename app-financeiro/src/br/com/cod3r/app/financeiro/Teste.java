package br.com.cod3r.app.financeiro;

import br.com.cod3r.app.Calculadora;

import java.util.ServiceLoader;

public class Teste {

    public static void main(String[] args) {

        Calculadora calc = ServiceLoader.load(Calculadora.class).findFirst().get();

        System.out.println(calc.soma(2, 3, 4));

//        OperacoesAritmeticas op = new OperacoesAritmeticas();
//
//        System.out.println(op.soma(2, 3, 4));

//        System.out.println(CalculadoraImpl.class.getName());
//
//        try {
//            Field fieldId = CalculadoraImpl.class.getDeclaredFields()[0];
//            fieldId.setAccessible(true);
//            fieldId.set(calc, "def");
//            fieldId.setAccessible(false);
//
//            System.out.println(calc.getId());
//        } catch (IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println(CalculadoraImpl.class.getDeclaredFields()[0].getName());
//
    }
}
