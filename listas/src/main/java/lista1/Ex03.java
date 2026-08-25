package lista1;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        System.out.print("Digite outro numero: ");
        int numero2 = input.nextInt();

        System.out.printf("%d + %d = %d\n", numero, numero2, (numero + numero2));
        System.out.printf("%d - %d = %d\n", numero, numero2, (numero - numero2));
        System.out.printf("%d x %d = %d\n", numero, numero2, (numero * numero2));
        System.out.printf("%d / %d = %f\n", numero, numero2, ((double) numero / (double) numero2));
        System.out.printf("resto da divisão = %d\n",  (numero % numero2));

        input.close();
    }
}
