package POO.heranca2;

public class motos extends veiculo {
    private int cilindrada;

    public motos (String marca, int anofabricacao) {
        super(marca, anofabricacao);
    }

    @Override
    public String exibir () {
        return super.exibir() + "\nCilindradas: " + cilindrada;
    }
}
