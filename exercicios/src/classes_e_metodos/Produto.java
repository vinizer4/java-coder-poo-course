package classes_e_metodos;


public class Produto {

    String nome;
    double preco;
    double desconto;

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

    Produto(
            String nomeInicial,
            double precoInicial,
            double descontoInicial
    ) {
        this.nome = nomeInicial;
        this.preco = precoInicial;
        this.desconto = descontoInicial;
    }

    double precoComDesconto() {
       return preco - (preco * desconto);
    }

    double precoComDescontoGerente(double descontoGerente) {
       return preco - (preco * (desconto + descontoGerente));
    }
}
