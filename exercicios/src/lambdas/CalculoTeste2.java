package lambdas;

public class CalculoTeste2 {

    public static void main(String[] args) {

        Calculo calculo = (x, y) -> {
            return x + y;
        }; // Função lambda com bloco de código

        System.out.println(calculo.executar(2, 3));

        calculo = (x, y) -> x * y; // Função lambda sem bloco de código
        System.out.println(calculo.executar(2, 3));
    }
}
