package lista1;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = input.nextInt();

        System.out.print("Digite outro numero: ");
        int numero2 = input.nextInt();

        if (numero > numero2) {
            System.out.println(numero + " é maior que " + numero2);
        }else if  (numero < numero2) {
            System.out.println(numero2 + " é menor que " + numero);
        }else {
            System.out.println("Os números são iguais.");
        }

        input.close();
    }
}
