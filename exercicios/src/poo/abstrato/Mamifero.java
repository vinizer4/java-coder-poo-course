package poo.abstrato;

public abstract class Mamifero extends Animal {

    public abstract String mamar();

    @Override
    public final String mover() {
        return "Saindo do lugar";
    } // quando defindo final (constante) a classe filha não pode sobrescrever este método
}
