package lista1;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = input.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Par");
        }else {
            System.out.println("Impar");
        }

        input.close();
    }
}
