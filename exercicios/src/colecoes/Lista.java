package colecoes;

import java.util.ArrayList;
import java.util.Set;

public class Lista {

    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));
        lista.add(new Usuario("Pedro"));

        System.out.println(lista.get(3).nome); // Acessar pelo indice diferente do Set que nao e indexado

        lista.remove(1); // Remove pelo indice
        lista.remove(new Usuario("Manu")); // Remove pelo objeto

        System.out.println("Tem? " + lista.contains(new Usuario("Lia")));
        System.out.println(">>>> " + lista.remove(new Usuario("Lia"))); // Remove pelo objeto

        for(Usuario u: lista) {
            System.out.println(u);
        }
    }
}
