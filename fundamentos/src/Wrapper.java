import java.util.Scanner;

public class Wrapper {

    public static void main(String[] args) {

        // Wrapper dos tipos primitivos para numbers
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000;
        Long l = 100000L;
        Float f = 123.10F;
        Double d = 1234.5679;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);
        System.out.println(f);
        System.out.println(d);

        // Wrapper para boolean
        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        // Wrapper caracteres
        Character c = '#';
        System.out.println(c + "...");
    }
}
