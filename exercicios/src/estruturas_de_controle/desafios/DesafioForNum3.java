package estruturas_de_controle.desafios;

public class DesafioForNum3 {

    public static void main(String[] args) {

        String valor = "#";

        for (int i = 1; i <= 5; i++) {
            System.out.println(valor);
            valor += "#";
        }

        // versao do desafio
        // nao pode usar valor numerico para controlar o laco!

        for(String v = "#"; !v.equals("######"); v += "#") {
            System.out.println(v);
        }
    }
}
