package lista1;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.print("Numero inteiro positivo: ");
        int numero = input.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
    }
}
