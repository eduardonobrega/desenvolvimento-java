package lista1;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.print("Numero inteiro positivo: ");
        int numero = input.nextInt();
        int soma = 0;

        for (int i = 2; i <= numero; i += 2) {
            soma += i;
        }

        System.out.println(soma);
    }
}
