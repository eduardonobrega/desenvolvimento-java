package lista3.cofrinho;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();



        int op;

        do {
            System.out.println("1 - Depositar");
            System.out.println("2 - Retirar");
            System.out.println("3 - Consultar saldo");
            System.out.println("0 - Sair");
            System.out.print(": ");
            op = sc.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.print("Valor: ");
                    double valor = sc.nextDouble();
                    cofrinho.depositar(valor);
                }
                case 2 -> {
                    System.out.print("Valor: ");
                    double valor = sc.nextDouble();
                    cofrinho.retirar(valor);
                }
                case 3 -> System.out.printf("R$ %.2f\n", cofrinho.consultarSaldo());

                case 0 -> {}
                default ->  System.out.println("Opção inválida");
            }
        }while (op != 0);

    }
}
