package classes_e_metodos;

public class Data {

    int dia;
    int mes;
    int ano;

    Data() {
       // dia = 1;
       // mes = 1;
       // ano = 1970;
        this(1, 1, 1970);
    }

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada() {
        // variavel local que foi definida dentro do escopo do metodo
        // ela nao e acessivel em outros escopos somente no escopo do metodo que foi definida
        final String FORMATO = "%d/%d/%d";
        return String.format(FORMATO, dia, mes, ano);
    }

    void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
    }
}
