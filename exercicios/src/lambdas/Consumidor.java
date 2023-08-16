package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {

        // Implementação da interface funcional
        // Consumer<T> que recebe um parâmetro e não retorna nada
        // Método accept(T t)
        Consumer<String> imprimirUmaFrase = System.out::println;
        imprimirUmaFrase.accept("Hello World!");

        // Implementação da interface funcional
        // Consumer<T> que recebe um parâmetro e não retorna nada
        // Método accept(T t)
        Consumer<Produto> imprimirNome = produto -> System.out.println(produto.nome);

        Produto produto = new Produto("Caneta", 12.34, 0.09);
        imprimirNome.accept(produto);

        Produto produto2 = new Produto("Notebook", 2987.99, 0.25);
        Produto produto3 = new Produto("Caderno", 19.90, 0.03);
        Produto produto4 = new Produto("Borracha", 7.80, 0.18);
        Produto produto5 = new Produto("Lapis", 4.39, 0.19);

        List<Produto> produtos = Arrays.asList(produto, produto2, produto3, produto4, produto5);

        // Implementação da interface funcional
        // Consumer<T> que recebe um parâmetro e não retorna nada
        // Método accept(T t)
        produtos.forEach(imprimirNome);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
    }
}
