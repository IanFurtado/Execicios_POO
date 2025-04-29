package POO.heranca2;

public class Main {

    public static void main(String[] args) {


        carro c = new carro("Fiat", 2013);
        motos m = new motos("Honda", 2025);

        c.setMarca("Fiat");

        m.setMarca("Honda");

        System.out.println(c.exibir());
        System.out.println(m.exibir());
    }
}
