package biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 

        System.out.println("Informe o nome do livro:");
        String nome = entrada.nextLine();

        System.out.println("Informe o autor do livro:");
        String autor = entrada.nextLine();

        System.out.println("Informe o ano de publicação do livro:");
        int publicacao = entrada.nextInt();

        entrada.nextLine();

        System.out.println("Informe o preço do livro;");
        double preco = entrada.nextDouble();

        Livro livro = new Livro(nome, autor, publicacao, preco);

        System.out.println("\nDados:");
        livro.exibirInfo();

        entrada.nextLine();

        System.out.println("Deseja atualizar o preço do livro?");
        String resposta = entrada.nextLine();

        if (resposta.equalsIgnoreCase("Sim")) {
            System.out.println("Informe o novo preço:");
            double novoPreco = entrada.nextDouble();
            System.out.println("\n");
            livro.autualizarPreco(novoPreco);
            livro.exibirInfo();
        }
        entrada.close();
    }
}
