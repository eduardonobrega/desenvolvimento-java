package lista1;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.print("Numero inteiro positivo: ");
        int numero = input.nextInt();
        int soma = 0;

        for (int i = 1; i <= numero; i++) {
            soma += i;
        }

        System.out.println(soma);
    }
}
