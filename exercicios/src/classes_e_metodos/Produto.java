package classes_e_metodos;

public class Produto {

    String nome;

    double preco;

    double desconto;


    double precoComDesconto() {
       return preco - (preco * desconto);
    }

    double precoComDescontoGerente(double descontoGerente) {
       return preco - (preco * (desconto + descontoGerente));
    }
}
