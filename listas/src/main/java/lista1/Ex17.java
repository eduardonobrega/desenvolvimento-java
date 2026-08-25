package lista1;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero entre 1 e 7: ");
        int numero = input.nextInt();

        String dia = switch (numero) {
            case 1 -> "Domingo";
            case 2 -> "Segunda-feira";
            case 3 -> "Terca-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            case 7 -> "Sabado";
            default -> "Dia invalido";
        };

        System.out.println(dia);
    }
}
