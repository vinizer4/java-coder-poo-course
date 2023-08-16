package poo.encapsulamento.casaB;

import poo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    void testeAcessos() {

        // System.out.println(mae.segredo); // não é visível
        // System.out.println(mae.facoDentroDeCasa); // padrão (default) só para o pacote casaA
        System.out.println(formaDeFalar); // protegido só para o pacote casaA e subclasses
        System.out.println(todosSabem); // público para todos
    }
}
