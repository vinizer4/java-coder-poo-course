package classes_e_metodos;

import java.util.Scanner;

public class ProdutoTeste {

    public static void main(String[] args) {

        // instanciando objeto produto do classe molde Produto
        Produto p1 = new Produto("Notebook", 5000, 0.25);
        //p1.nome = "Notebook";
        //p1.preco = 5000;
        //p1.desconto = 0.25;

        var p2 = new Produto("Caneta Preta");
        //p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.preco * (1 - p1.desconto);
        double precoFinalMetodo = p1.precoComDesconto();
        double precoDescontoGerente = p1.precoComDescontoGerente(0.20);

        System.out.println(precoFinal1);
        System.out.println(precoFinalMetodo);
        System.out.println(precoDescontoGerente);

        double precoFinal2 = p2.preco * (1 - p2.desconto);

        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("Media carrinho = R$%.2f.", mediaCarrinho);
    }
}
