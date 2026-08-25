package lista1;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Idade: ");
        int idade = input.nextInt();

        if (idade >= 18) {
            System.out.print("Tem habilitação? [s/n] ");
            char resposta = input.next().charAt(0);
            if (resposta == 's' || resposta == 'S') {
                System.out.println("Pode dirigir!");
            }
            else {
                System.out.println("Não pode dirigir!");
            }
        } else  {
            System.out.println("Não pode dirigir!");
        }
    }
}
