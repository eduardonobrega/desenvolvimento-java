package lista1;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (i * numero));
        }
    }
}
