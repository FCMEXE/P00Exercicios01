package Exercicio02;

import java.util.Scanner;


public class Menu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Aluno a = new Aluno();
        int opcao = 0;


        while (opcao != 3) {
            System.out.println("""
                          Menu\s
                          1. Criar aluno\s
                          2. Mostrar Aluno\s
                          3. Encerrar sessão\s
                          -->
                    """);
            opcao = Integer.parseInt(teclado.nextLine());

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o RA do aluno:");
                    a.setRa(teclado.nextLine());

                    System.out.println("Digite o nome do aluno:");
                    a.setNome(teclado.nextLine());

                    System.out.println("Digite nota da AC1 aluno:");
                    a.setAC1((int) Double.parseDouble(teclado.nextLine()));

                    System.out.println("Digite nota da AC2 aluno:");
                    a.setAC2((int) Double.parseDouble(teclado.nextLine()));

                    System.out.println("Digite nota da AG aluno:");
                    a.setAG((int) Double.parseDouble(teclado.nextLine()));

                    System.out.println("Digite nota da AF aluno:");
                    a.setAF((int) Double.parseDouble(teclado.nextLine()));
                }
                case 2 -> System.out.println(a.imprimir());

                case 3 -> System.out.println("Programa será encerrado!");

                default -> System.out.println("Operação Inválida!");
            }
        }
    }
}