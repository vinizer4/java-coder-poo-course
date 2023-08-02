package classes_e_metodos;

public class ValorNulo {

    public static void main(String[] args) {

        String s1 = "";

        System.out.println(s1.concat("!!!"));

        String s2 = null;
        // exemplo de erro em tempo de execucao null pointer exception!
        System.out.println(s2.concat("????"));

        Data d1 = null;
        //d1.mes = 3; // exemplo de erro em tempo de execucao null pointer exception!

        // para evitar esse erro e uma boa pratica fazer o uso do if
        // para garantir que o endereco de memoria nao e nulo

        // adicionado random para possibilitar null na variavel d1
        d1 = Math.random() > 0.5 ? new Data() : null;

        if(d1 != null) {
            d1.mes = 3;
            System.out.println(d1.obterDataFormatada());
        }

        s2 = Math.random() > 0.5 ? "opa" : null;
        if(s2 != null) {
            System.out.println(s2.concat("????"));
        }

        /*
        OBS: Esse erro so aparece em tempo de execucao,
        e necessario ter muita atencao e sempre validar
        todos os cenarios para garantir que nunca
        ira cair nesse erro, pode ser muito prejudicial a
        qualquer sistema
        */
    }
}
