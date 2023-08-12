package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        // Adiciona elementos no conjunto
        // Uma colecao nao aceita tipos primitivos, apenas objetos
        // Por isso ocorre a conversao automatica de tipos primitivos para objetos
        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste"); // String
        conjunto.add(1); // int -> Integer
        conjunto.add('x'); // char -> Character

        // Em colecoes nao usamos o lenght usamos o size
        System.out.println("Tamanho é " + conjunto.size()); // 5

        // Adiciona elementos repetidos ele nao adiciona novamente no caso da colection Set
        conjunto.add("Teste");
        conjunto.add('x');
        System.out.println("Tamanho é " + conjunto.size()); // 5

        // Remove um elemento do conjunto
        System.out.println(conjunto.remove("teste")); // false
        System.out.println(conjunto.remove("Teste")); // true
        System.out.println(conjunto.remove('x')); // true

        System.out.println("Tamanho é " + conjunto.size()); // 3

        // Verifica se um elemento existe no conjunto
        System.out.println(conjunto.contains('x')); // false
        System.out.println(conjunto.contains(1)); // true
        System.out.println(conjunto.contains(true)); // true

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums); // Uniao entre dois conjuntos
        System.out.println(conjunto);

        conjunto.retainAll(nums); // Intersecao entre dois conjuntos
        System.out.println(conjunto);

        conjunto.clear(); // Limpa o conjunto
        System.out.println(conjunto);
    }
}
