package poo.heranca.desafio;

public class Ferrari extends Carro{

    Ferrari() {
        this(315);
    }

    Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        delta = 15;
    }

    @Override
    void acelerar() {
        velocidadeAtual += 15;
    }

    @Override
    void frear() {
        if (velocidadeAtual < 15) {
            velocidadeAtual = 0;
        } else {
            velocidadeAtual -= 15;
        }
    }
}
