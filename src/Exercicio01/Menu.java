package Exercicio01;
import java.util.Scanner;
class Menu {
    public static void main(String[]args){

        Scanner Teclado = new Scanner(System.in);
        int valor = 0;
        Aluno a = new Aluno();
while(valor != 3) {
    System.out.println(
            """
                    Menu\s
                    1. Criar pessoa\s
                    2. Mostrar pessoa\s
                    3. Sair\s
                    """
    );
    valor = Integer.parseInt(Teclado.nextLine());

    switch (valor) {
        case 1 -> {
            System.out.println("Digite o nome");
            a.setNome(Teclado.nextLine());
            System.out.println("Digite o CPF");
            a.setCpf(Teclado.nextLine());
            System.out.println("Digite o sexo");
            a.setSexo(Teclado.nextLine().charAt(0));
            System.out.println("Digite a idade");
            a.setIdade(Integer.parseInt(Teclado.nextLine()));
        }
        case 2 -> System.out.println(a.imprimir());
        case 3 -> System.out.println("Programa será Fechado!");
        default -> System.out.println("Operação invalida");
    }
}

    }
}


