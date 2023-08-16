package poo.encapsulamento.casaA;

public class Paulo {

    Ana esposa = new Ana();

    void testeAcessos() {
        // System.out.println(esposa.segredo); // não é visível
        System.out.println(esposa.facoDentroDeCasa); // padrão (default) só para o pacote casaA
        System.out.println(esposa.formaDeFalar); // protegido só para o pacote casaA e subclasses
        System.out.println(esposa.todosSabem); // público para todos
    }
}
