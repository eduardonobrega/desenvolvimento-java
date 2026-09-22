package ex03;

import java.util.Scanner;

public class Imposto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Salário Mensal: R$ ");
        double salarioMensal = sc.nextDouble();
        double salarioAnual = salarioMensal * 12;

        if (salarioAnual > 22_847.76) {
            double taxa = 7.5;

            if (salarioAnual > 45_012.60) {
                taxa = 27.5;
            } else if (salarioAnual > 33_919.80) {
                taxa = 15;
            }

            double imposto = salarioAnual * taxa / 100;
            double salarioLiquido = salarioAnual - imposto;

            System.out.printf("Imposto: R$ %.2f%n", imposto);
            System.out.printf("Salário liquido anual: R$ %.2f%n", salarioLiquido);

        }else {
            System.out.println("Você está isento de impostos");
            System.out.printf("Salário liquido anual:  R$ %.2f\n", salarioAnual);
        }

        sc.close();
    }
}
