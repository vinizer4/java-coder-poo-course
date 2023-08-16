package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimintoObjetos {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Usando o for tradicional...");

        for (int i = 0; i < aprovados.size(); i++) {
            System.out.println(aprovados.get(i));
        }

        System.out.println("\nUsando o forEach...");

        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nUsando o Iterator...");
        Iterator<String> iterator = aprovados.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nUsando o Stream...");
        Stream<String> stream = aprovados.stream(); // Cria um fluxo de dados (stream)

        stream.forEach(System.out::println); // Imprime os elementos do fluxo de dados (stream)
    }
}
