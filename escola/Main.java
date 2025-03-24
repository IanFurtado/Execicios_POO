package escola;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String continuar;

        do {
            System.out.println("Informe a matéria");
            String materia = entrada.nextLine();

            System.out.println("Informe o nome do aluno: ");
            String nome = entrada.nextLine();

            System.out.println("Informe a idade do aluno: ");
            byte idade = entrada.nextByte();
            entrada.nextLine();

            System.out.println("Informe a média anual do aluno: ");
            double nota = entrada.nextDouble();
            entrada.nextLine();

            Alunos alunos = new Alunos (materia, nome, idade, nota);

            System.out.println("\nDados do aluno:");
            alunos.exibirInfo();

            System.out.println("\nDeseja cadastrar outro aluno?");
            continuar = entrada.nextLine();
        } while (continuar.equalsIgnoreCase("Sim"));

        System.out.println("Sistema encerrado");
        entrada.close();
    }
}
