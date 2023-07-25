package tiposprimitivos;

public class TiposPrimitivos {

    /*

    Tipos Numericos {

    Inteiros =
    byte: ( -128 / +127 )
    short: ( )
    int: ( )
    long: ( )

    Decimais =
    float
    double

    }

    boolean
    char


    */

    public static void main(String[] args) {
        // Informacoes do funcionario

        // Tipos numericos inteiros

        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L;

        // Tipos numericos reais

        float salario = 11_455.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo booleano

        boolean estaDeFerias = false;

        // Tipo caractere

        char status = 'A';

        // Dias de empresa
        System.out.println("Dias de empresa: " + anosDeEmpresa * 365);

        // Numero de viagens
        System.out.println("Numero de viagens: " + numeroDeVoos / 2);

        // Pontos por real
        System.out.println("Pontos por real: " + pontosAcumulados / vendasAcumuladas);

        // ID salario e ferias
        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Esta de ferias? " + estaDeFerias);
    }
}
