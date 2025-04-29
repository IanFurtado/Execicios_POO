package POO.heranca2;

public class carro extends veiculo{
    private int numeroAssentos;

    public carro(String marca, int anofabricacao){
        super(marca, anofabricacao);
    }

    @Override
    public String exibir() {
        return super.exibir() + "\nNumero de assentos: " + numeroAssentos;
    }
}