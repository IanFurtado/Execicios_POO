package POO.heranca2;

public class veiculo {

    private String marca;
    private int anofabricacao;

    public veiculo(){}

    public veiculo (String marca, int anofabricacao) {
        this.marca = marca;
        this.anofabricacao = anofabricacao;
    }
    public String getMarca () {
        return marca;
    }

    public void setMarca (String marca) {
        this.marca = marca;
    }



    public String exibir () {
        return "\n" + marca + "\nAno de fabricação: " + anofabricacao;
    }
}