package lista1;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero1 = input.nextInt();

        System.out.print("Digite outro numero: ");
        int numero2 = input.nextInt();

        System.out.print("Digite outro numero: ");
        int numero3 = input.nextInt();

        if (numero1 == numero2 && numero2 == numero3) {
            System.out.println("Os números são iguais.");
        } else {
            int maior = numero1;

            if (numero2 > maior) {
                maior = numero2;
            }

            if (numero3 > maior) {
                maior = numero3;
            }

            System.out.println("Maior: " + maior);
        }




        input.close();
    }
}
