package arrays_e_collections;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos alunos?");
        int qtdAlunos = entrada.nextInt();

        System.out.println("Quantas notas por aluno? ");
        int qtdNotas = entrada.nextInt();

        // matriz | 10 10 10 | gerada abaixo
        //        | 10 1O 10 | exemplo matriz de 2 niveis
        double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];

        // iterando sobre uma matriz
        double total = 0;
        for (int aluno = 0; aluno < notasDaTurma.length; aluno++) {
            for (int nota = 0; nota < notasDaTurma[aluno].length; nota++) {
                System.out.printf(
                        "Informe a nota %d do aluno %d: ", nota + 1, aluno + 1
                );
                notasDaTurma[aluno][nota] = entrada.nextDouble();
                total += notasDaTurma[aluno][nota];
            }
        }

        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("Media da turma é " + media);

        for (double[] notasDoAluno: notasDaTurma) {
            System.out.println(Arrays.toString(notasDoAluno));
        }

        entrada.close();
    }
}
