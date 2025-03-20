package mercado;

public class Produto {
    private String nome;
    private int preco;

    public Produto (String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco (int preco) {
        this.preco = preco;
    }

    public Produto atualizarPreco (int novoPreco) {
        this.preco = novoPreco;
        return this;
    }

    public void exibirInfo () {
        System.out.println("Nome: " + nome + " Preço: " + preco);
    }
}