package poo.heranca.teste;

import poo.heranca.desafio.Civic;
import poo.heranca.desafio.Ferrari;

public class CarroTeste {

    public static void main(String[] args) {

        Civic civic = new Civic();

        civic.acelerar();
        System.out.println(civic);

        civic.acelerar();
        System.out.println(civic);

        civic.acelerar();
        System.out.println(civic);

        Ferrari ferrari = new Ferrari();

        ferrari.acelerar();
        System.out.println(ferrari);

        ferrari.acelerar();
        System.out.println(ferrari);

        ferrari.acelerar();
        System.out.println(ferrari);

    }
}
