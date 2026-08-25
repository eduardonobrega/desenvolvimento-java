package lista1;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Idade: ");
        int idade = input.nextInt();

        if (idade >= 60) {
            System.out.println("ingresso de idoso");
        }
        else if (idade >= 13) {
            System.out.println("ingresso comum");
        }
        else if (idade >= 6) {
            System.out.println("ingresso infantil");
        }else {
            System.out.println("entrada gratuita");
        }
    }
}
