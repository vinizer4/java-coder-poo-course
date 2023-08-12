package colecoes;

import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new java.util.LinkedList<>();

        // Offer e Add -> adicionam elementos na fila
        // Diferença é o comportamento quando a fila está cheia!
        fila.add("Ana"); // Retorna false
        fila.offer("Bia"); // Lança uma exceção
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // Peek e Element -> obter o próximo elemento da fila (sem remover)
        System.out.println(fila.peek()); // Retorna o primeiro elemento da fila sem remover
        System.out.println(fila.peek()); // Quando a lista esta vazia retorna nulo
        System.out.println(fila.element()); // Retorna o primeiro elemento da fila sem remover
        System.out.println(fila.element()); // Quando a lista esta vazia retorna uma exceção

        // fila.size(); // Retorna o tamanho da fila
        // fila.clear(); // Limpa a fila
        // fila.isEmpty(); // Verifica se a fila esta vazia
        // fila.contains(); // Verifica se a fila contem o elemento


        System.out.println(fila.poll()); // Retorna o primeiro elemento da fila e remove
        System.out.println(fila.poll()); // Quando a lista esta vazia retorna nulo

        System.out.println(fila.remove()); // Retorna o primeiro elemento da fila e remove
        System.out.println(fila.remove()); // Quando a lista esta vazia retorna uma exceção
    }
}
