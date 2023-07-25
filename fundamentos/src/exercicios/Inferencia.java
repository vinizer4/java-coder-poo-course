package exercicios;

public class Inferencia {

    public static void main(String[] args) {

        double a = 4.5;
        System.out.println(a);

        // Inferencia no Java utilizar var, diferente do var do JavaScript o var do Java nunca muda a sua tipagem apos a inferencia
        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);

        c = "Outro texto";
        System.out.println(c);

        // Ao tentar inferir um tipo diferente o Java vai acusar um erro
        //c = 4.5;
    }
}
