package Exercicio03;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opc = 0;
        Funcionario f = new Funcionario();

        while (opc != 3) {
            System.out.println("Menu \n" +
                    "1. Criar Funcionário\n" +
                    "2. Mostrar Folha de Pagamento \n" +
                    "3. Sair");
            opc = Integer.parseInt(teclado.nextLine());

            switch (opc) {
                case 1:
                    System.out.println("Qual seu cracha?");
                    f.setCracha((int) Double.parseDouble(teclado.nextLine()));

                    System.out.println("Qual seu Nome?");
                    f.setNome(teclado.nextLine());

                    System.out.println("Qual seu Vinculo?");
                    f.setTipoVinculo(teclado.nextLine());

                    System.out.println("Qual seu Salário?");
                    f.setSalario((int) Double.parseDouble(teclado.nextLine()));

                    System.out.println("Qual seu valor/Hora?");
                    f.setValorHora((int) Double.parseDouble(teclado.nextLine()));

                    System.out.println("Quantas horas?");
                    f.setQtdHora((int) Double.parseDouble(teclado.nextLine()));

                    System.out.println("quanto é o desconto?");
                    f.setValorDesconto((int) Double.parseDouble(teclado.nextLine()));

                    break;
                case 2:
                    System.out.println(f.Imprimir());
                    break;
                case 3:
                    System.out.println("Sistema encerrado!");
                    break;
                default:
                    System.out.println("Acão Inválida");
            }

        }

    }

}