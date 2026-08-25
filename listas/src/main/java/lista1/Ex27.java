package lista1;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.print("Quantidade: ");
        int quantidade = input.nextInt();
        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Infome o " + i + "° numero inteiro: ");
            int numero = input.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                zeros++;
            }
        }

        System.out.println("Positivos: " + positivos + " | Negativos: " + negativos + " | Zeros: " + zeros);
    }
}
