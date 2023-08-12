package colecoes;

public class Hash {

    public static void main(String[] args) {

            java.util.HashSet<Usuario> usuarios = new java.util.HashSet<>();

            usuarios.add(new Usuario("Pedro"));
            usuarios.add(new Usuario("Ana"));
            usuarios.add(new Usuario("Guilherme"));

            boolean resultado = usuarios.contains(new Usuario("Guilherme"));
            System.out.println(resultado);
    }
}
