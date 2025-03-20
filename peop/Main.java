package peop;

import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        
        Pessoa pessoa = new Pessoa(nome, idade);

        
        System.out.println("\nInformações iniciais:");
        pessoa.exibirInfo();

        System.out.print("\nDeseja atualizar sua idade? (1 = Sim, 0 = Não): ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.print("Digite a nova idade: ");
            int novaIdade = scanner.nextInt();
            pessoa.atualizarIdade(novaIdade); // Atualizando a idade
        }

        System.out.println("\nInformações atualizadas:");
        pessoa.exibirInfo();

        scanner.close(); // Fechando o Scanner
    }
}
