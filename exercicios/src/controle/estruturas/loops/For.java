package controle.estruturas.loops;

public class For {

    public static void exemplo1(String[] args) {


        for(int contador = 0; contador <= 20; contador+=2) {
            System.out.printf("i = %d\n", contador);
        }

        int x = 2;
        for(; x < 10;) {
            System.out.println("x = " + x);
            x++;
        }

        //Exemplos de loops infinitos com for
//        for(;true;) {
//            System.out.println("Fim");
//        }
//
//        for(;;) {
//            System.out.println("Fim!");
//        }


    }
}
