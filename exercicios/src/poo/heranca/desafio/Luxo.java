package poo.heranca.desafio;

public interface Luxo {

    void ligarAr(); // todos métodos de uma interface é public e abstract
    void desligarAr(); // metodo abstrato é um metodo que não tem corpo

    default int velocidadeDoAr() {
        return 1;
    }
}
