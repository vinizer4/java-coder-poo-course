package poo.encapsulamento.casaA;

public class Ana {

    @SuppressWarnings("unused")
    private String segredo = "..."; // privado só para a classe Ana
    String facoDentroDeCasa = "..."; // padrão (default) só para o pacote casaA
    protected String formaDeFalar = "..."; // protegido só para o pacote casaA e subclasses
    public String todosSabem = "..."; // público para todos

}
