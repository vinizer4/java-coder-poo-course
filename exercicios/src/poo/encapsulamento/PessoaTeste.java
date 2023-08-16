package poo.encapsulamento;

public class PessoaTeste {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(18, "João", "Silva");
        p1.setIdade(-30); // alterando diretamente o atributo idade

        System.out.println(p1.getIdade()); // lendo diretamente o atributo idade
        System.out.println(p1.getNome()); // lendo diretamente o atributo nome
        System.out.println(p1); // chamando o método toString() implicitamente

        System.out.println(p1.getNomeCompleto()); // chamando o método getNomeCompleto()
    }
}
