package controle.estruturas.loops;

public class SwitchSemBreak {

    public static void main(String[] args) {

        String faixa = "preta";

        // No caso do switch sem break ele executa o caso que ele encontra e todos os outros abaixo
        // Como e mostrado no exemplo abaixo

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei o Bassai-Dai...");
            case "marrom":
                System.out.println("Sei o Tekki Shodan");
            case "roxa":
                System.out.println("Sei o Heian Godan");
            case "verde":
                System.out.println("Sei o Heian Yodan");
            case "laranja":
                System.out.println("Sei o Heian Sandan");
            case "vermelha":
                System.out.println("Sei o Heian Nidan");
            case "amarela":
                System.out.println("Sei o Heian Shodan");
                break;
            default:
                System.out.println("Nao sei nada.");

        }

        int idade = 3;

        switch (idade) {
            case 3:
                System.out.println("Save programar");
            case 2:
                System.out.println("Sabe falar");
            case 1:
                System.out.println("Sabe andar");
            case 0:
                System.out.println("Sabe respirar");
        }
    }
}
