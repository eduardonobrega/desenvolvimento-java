package lista1;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int a = input.nextInt();
        System.out.print("Digite outro numero: ");
        int b = input.nextInt();

        int aux = a;
        a = b;
        b = aux;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        input.close();
    }
}
