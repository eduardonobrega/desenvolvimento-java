package lista1;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        System.out.println("Antecessor: " + (numero - 1));
        System.out.println("Sucessor: " + (numero + 1));

        input.close();
    }
}
