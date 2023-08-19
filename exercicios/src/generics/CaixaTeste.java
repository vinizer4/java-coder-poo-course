package generics;

public class CaixaTeste {

    public static void main(String[] args) {

        Caixa<String> caixaA = new Caixa<>(); // Apos o new Caixa<>(), o Java consegue inferir o tipo do TIPO no caso String
        caixaA.guardar("Segredo!");

        String coisaA = caixaA.abrir();
        System.out.println(coisaA);

        Caixa<Double> caixaB = new Caixa<>();
        caixaB.guardar(3.1415);

        Double coisaB = caixaB.abrir();
        System.out.println(coisaB);
    }
}
