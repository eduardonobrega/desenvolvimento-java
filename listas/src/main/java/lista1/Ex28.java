package lista1;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.print("Quantidade: ");
        int quantidade = input.nextInt();

        System.out.println("Infome o 1° numero inteiro: ");
        int maior = input.nextInt();

        for (int i = 2; i <= quantidade; i++) {
            System.out.println("Infome o " + i + "° numero inteiro: ");
            int numero = input.nextInt();

            if  (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("Maior:  " + maior);
    }
}
