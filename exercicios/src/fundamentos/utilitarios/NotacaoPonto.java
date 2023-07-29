package fundamentos.utilitarios;

public class NotacaoPonto {

    public static void main(String[] args) {

        // String e um tipo mas nao e um tipo primitivo
        String s = "Bom dia X";

        s = s.replace("X", "Senhora");

        s = s.toUpperCase();

        s = s.concat("!!!");

        System.out.println(s);

        String y = "Bom dia X".replace("X", "Gui").toUpperCase().concat("!!!");
        System.out.println(y);

        // Tipos primitivos nao tem a opcao do operador ".", pois ele e so o tipo puro
    }
}
