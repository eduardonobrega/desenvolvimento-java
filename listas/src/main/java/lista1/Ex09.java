package lista1;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = input.nextInt();
        if (numero > 0) {
            System.out.println("Positivo");
        } else if (numero < 0) {
            System.out.println("Negativo");
        }else {
            System.out.println("Zero");
        }

        input.close();
    }
}
