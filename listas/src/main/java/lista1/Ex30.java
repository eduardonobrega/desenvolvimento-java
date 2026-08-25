package lista1;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Informe um número inteiro");
        } else if (numero == 0) {
            System.out.println("0! = 1");
        } else if (numero == 1) {
            System.out.println("1! = 1");
        }
        else {
            System.out.print(numero + "! = ");
            int fatorial = 1;

            for  (int i = numero; i > 1; i--) {
                fatorial *= i;
                System.out.print(i + " x ");
            }

            System.out.println("1 = " + fatorial);
        }

    }
}
