package classes_e_metodos;

public class Data {

    int dia;
    int mes;
    int ano;

    // final int x;
    // no caso de constantes elas obrigatoriamente tem
    // que ser definidas, nao recebem valor padrao esse exemplo lanca um erro
    // variavel x nao foi inicializada!!!

    Data() {
       // dia = 1;
       // mes = 1;
       // ano = 1970;
        this(1, 1, 1970);

        // byte, short, int, long -> valor padrao = 0
        // float, double -> valor padrao = 0.0
        // boolean -> valor padrao = false
        // char -> valor padrao = '\u00000'
        // Objetos -> valor padrao = null

        // OBS: variavel local nao recebe valor padrao o codigo abaixo lanca um erro
        // int a;
        // System.out.println(a); variavel a nao foi inicializada!!!
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
