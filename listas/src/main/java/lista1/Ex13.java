package lista1;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Média: ");
        double media = input.nextDouble();

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação!");
        }else {
            System.out.println("Reprovado");
        }
    }
}
