package arrays_e_collections.desafios;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArrayMediaAluno {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("quantas notas: ");

        int qtdNotas = entrada.nextInt();
        System.out.println(qtdNotas);
        
        double[] notas = new double[qtdNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        double total = 0;

        for (double nota: notas) {
            total += nota;
        }

        System.out.println(Arrays.toString(notas));

        double media = total / notas.length;

        System.out.println("A media e " + media + "!");

        entrada.close();
    }
}
