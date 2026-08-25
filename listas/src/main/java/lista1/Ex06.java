package lista1;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1° Nota: ");
        double nota1 = input.nextDouble();

        System.out.print("2° Nota: ");
        double nota2 = input.nextDouble();

        System.out.print("3° Nota: ");
        double nota3 = input.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("Media: %.1f\n", media);
        input.close();
    }
}
