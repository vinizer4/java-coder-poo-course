package fundamentos.tipos;

public class TipoString {

    public static void main(String[] args) {
        System.out.println("Ola pessoal".charAt(2));

        String s = "Boa tarde";
        s = s.toUpperCase();

        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.equals("Boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        System.out.println("Nome: " + nome +
                "\nSobrenome: " + sobrenome +
                "\nIdade: " + idade +
                "\nSalario: " + salario + "\n\n");

        System.out.printf("Nome: %s %s \n\n", nome, sobrenome);

        System.out.printf("O senhor: %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);

        String frase = String.format("O senhor: %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);

        System.out.println(frase);
    }
}
