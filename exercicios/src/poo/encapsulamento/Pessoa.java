package poo.encapsulamento;

public class Pessoa {

    private int idade;
    private String nome;
    private String sobrenome;

    public Pessoa(int idade) {
        setIdade(idade);
    }

    public Pessoa(int idade, String nome, String sobrenome) {
        setIdade(idade);
        setSobrenome(sobrenome);
        setNome(nome);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0 || idade > 130) {
            System.out.println("Idade inválida!");
        } else {
            this.idade = idade;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public final String toString() {
        return "Nome: " + getNome() + "\nIdade: " + getIdade();
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getNomeCompleto() {
        return getNome() + " " + getSobrenome();
    }
}
