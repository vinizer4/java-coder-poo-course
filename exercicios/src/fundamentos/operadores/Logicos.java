package fundamentos.operadores;

public class Logicos {

    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!!condicao1);
        System.out.println(!condicao2);

        // Tabela verdade E && (AND)

        System.out.println("Tabela verdade E && (AND)");
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false

        // Tabela verdade OU || (OR)
        System.out.println("\nTabela verdade OU || (OR)");
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false

        // Tabela verdade OU || (XOR)
        System.out.println("\nTabela verdade OU Exclusivo ˆ (XOR)");
        System.out.println(true ^ true); // false
        System.out.println(true ^ false); // true
        System.out.println(false ^ true); // true
        System.out.println(false ^ false); // false

        // Tabela verdade NOT
        System.out.println("\nTabela verdade NOT");
        System.out.println(!true);
        System.out.println(!false);
    }
}
