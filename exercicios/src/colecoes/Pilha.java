package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("O Pequeno Príncipe"); // Retorna boolean
        livros.push("Don Quixote"); // Lança uma exceção caso a pilha esteja cheia
        livros.push("O Hobbit");

        System.out.println(livros.peek()); // Retorna o primeiro elemento da pilha sem remover
        System.out.println(livros.element()); // Retorna o primeiro elemento da pilha sem remover

        for (String livro: livros) {
            System.out.println(livro);
        }

        System.out.println(livros.poll()); // Retorna o primeiro elemento da pilha e remove
        System.out.println(livros.pop()); // Retorna o primeiro elemento da pilha e remove

//        livros.size(); // Retorna o tamanho da pilha
//        livros.clear(); // Limpa a pilha
//        livros.isEmpty(); // Verifica se a pilha esta vazia
//        livros.contains(); // Verifica se a pilha contem o elemento
    }
}
