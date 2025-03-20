package biblioteca;

public class Livro {

    String nome;
    String autor;
    int publicacao;
    double preco;

    public Livro (String nome, String autor, int publicacao, double preco){
        this.nome = nome;
        this. autor = autor;
        this.publicacao = publicacao;
        this.preco = preco;
    }

    public String getNome () {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }
 
    public String getAutor() {
        return autor;
    }

    public void setAutor (String autor) {
        this.autor = autor;
    }

    public int getPublicacao () {
        return publicacao;
    }

    public void setPublicacao (int publicacao) {
        this.publicacao = publicacao;
    }

    public double getPreco () {
        return preco;
    }

    public void setPreco (double preco) {
        this.preco = preco;
    }

    public Livro autualizarPreco (double novoPreco) {
        this.preco = novoPreco;
        return this;
    }

    public void exibirInfo () {
        System.out.println("Nome do livro: " + nome + "\nAutor: " + autor + "\nData de publicação: " + publicacao + "\nPreço:" + preco);
    }
}