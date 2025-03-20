package mercado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do produto");
        String nome = entrada.nextLine();
        System.out.println("Digite o preço do produto");
        int preco = entrada.nextInt();

        Produto produto = new Produto(nome, preco);

        System.out.println("Dados:");
        produto.exibirInfo();

        entrada.nextLine();

        System.out.println("Deseja atualizar o preço do produto?");
        String resposta = entrada.nextLine();

        if (resposta.equalsIgnoreCase("Sim")) {
            System.out.println("Digite o novo preço: ");
            int novoPreco = entrada.nextInt();
            produto.atualizarPreco(novoPreco);
            System.out.println("Preço atualizado: ");
            produto.exibirInfo();
        }

        entrada.close();
    }
}

