package excecao;

public class Causa {

    public static void main(String[] args) {
        try {
            Aluno aluno = null;
            metodoA(aluno);
        } catch (Exception causa) {
            if (causa.getCause() != null) {
                System.out.println(causa.getCause().getMessage());
            }
        }

        metodoA(null);
    }

    static void metodoA(Aluno aluno) {
        try {
            metodoB(aluno);
        } catch (Exception causa) {
            throw new IllegalArgumentException(causa);
        }
    }

    static void metodoB(Aluno aluno) {
        if (aluno == null) {
            throw new IllegalArgumentException("O aluno está nulo");
        }

        System.out.println(aluno.nome);
    }
}
