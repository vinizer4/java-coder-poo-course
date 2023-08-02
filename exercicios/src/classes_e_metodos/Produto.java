package classes_e_metodos;


public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;

    // Construtor padrao
    Produto() {}

    // Construtor com parametros
    Produto(String nomeInicial) {
        this.nome = nomeInicial;
    }

    Produto(String nomeInicial, double precoInicial) {
        this.nome = nomeInicial;
        this.preco = precoInicial;
    }

    double precoComDesconto() {
       return preco - (preco * desconto);
    }

    double precoComDescontoGerente(double descontoGerente) {
       return preco - (preco * (desconto + descontoGerente));
    }
}
