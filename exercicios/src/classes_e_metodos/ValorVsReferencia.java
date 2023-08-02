package classes_e_metodos;

public class ValorVsReferencia {

    public static void main(String[] args) {

        double a = 2;
        double b = a; // atribuicao por valor (Tipo primitivo)

        a++;
        b--;

        // as alteracoes em b nao reflete no a, quando se trata de tipos primitivos
        System.out.println(a + " " + b);

        Data d1 = new Data(1, 6, 2022);
        Data d2 = d1; // atribuicao por referencia (Objeto)

        d1.dia = 31;
        d2.mes = 12;

        // as alteracoes de d2 refletem em d1 pois foi feito a atribuicao por referencia (Objeto)
        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        voltarDataParaValorPadrao(d1);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);
    }

    // so e possivel acessar um metodo static dentro da classe atraves de outro metodo static
    static void voltarDataParaValorPadrao(Data d) {
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    static void alterarPrimitivo(int a) {
        a++;
    }
}
