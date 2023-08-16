package poo.encapsulamento.casaB;

import poo.encapsulamento.casaA.Ana;

public class Julia {

    Ana sogra = new Ana();

    void testeAcessos() {
        // System.out.println(sogra.segredo); // não é visível
        // System.out.println(sogra.facoDentroDeCasa); // padrão (default) só para o pacote casaA
        // System.out.println(sogra.formaDeFalar); // protegido só para o pacote casaA e subclasses
        System.out.println(sogra.todosSabem); // público para todos
    }
}
