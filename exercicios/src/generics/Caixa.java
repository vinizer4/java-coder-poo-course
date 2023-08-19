package generics;

public class Caixa<TIPO> {

    private TIPO coisa; // TIPO é um tipo genérico como o any do TypeScript

    public void guardar(TIPO coisa) {
        this.coisa = coisa;
    }

    public TIPO abrir() {
        return coisa;
    }

}
