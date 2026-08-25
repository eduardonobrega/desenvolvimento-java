package lista1;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Salario: ");
        double salario = sc.nextDouble();

        double porcentagem = 0.05;

        if (salario < 0) {
            System.out.println("Salario negativo");
            return;
        }
        else if (salario <= 2000) {
            porcentagem = 0.15;
        }
        else if (salario <= 5000) {
            porcentagem = 0.10;
        }

        double novoSalario = salario * (porcentagem + 1) ;

        System.out.printf("R$ %.2f | %.1f%% | R$ %.2f%n", salario, porcentagem * 100, novoSalario);

    }
}
