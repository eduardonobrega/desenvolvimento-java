package lista1;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome =  input.nextLine();

        System.out.print("Idade: ");
        int idade =  input.nextInt();

        System.out.printf("Olá, %s! Você tem %d anos.", nome, idade);

        input.close();
    }
}
