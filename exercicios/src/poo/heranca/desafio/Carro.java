package poo.heranca.desafio;

public class Carro {

    int velocidadeAtual = 0;

    void acelerar() {
        velocidadeAtual += 5;
    }

    void frear() {
        if (velocidadeAtual < 5) {
            velocidadeAtual = 0;
        } else {
            velocidadeAtual -= 5;
        }
    }

    public String toString() {
        return "Velocidade atual é " + velocidadeAtual + "Km/h.";
    }
}
