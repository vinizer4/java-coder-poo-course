package excecao;

import java.util.Scanner;

public class Finally {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        try {

            System.out.println(7 / entrada.nextInt());
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu o erro: " + e.getMessage());
        } finally {
            System.out.println("Finally #01...");
            entrada.close();
        }
    }
}
