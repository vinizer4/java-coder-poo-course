package poo.heranca.desafio;

public class Ferrari extends Carro{

    public Ferrari() {
        this(315);
    }

    Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        delta = 15;
    }

    @Override
    public void acelerar() {
        velocidadeAtual += 15;
    }

    @Override
    public void frear() {
        if (velocidadeAtual < 15) {
            velocidadeAtual = 0;
        } else {
            velocidadeAtual -= 15;
        }
    }
}
