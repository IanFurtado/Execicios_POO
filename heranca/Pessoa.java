public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(){}

    public Pessoa (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setIdade (int idade) {
        this.idade = idade;
    }

    public String getNome () {
        return nome;
    }

    public int getIdade () {
        return idade;
    }

    public String show () {
        return "Olá meu nome é " + nome + " e tenho "  + idade + " anos";
    }
}