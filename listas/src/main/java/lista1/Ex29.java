package lista1;

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.print("Quantidade: ");
        int quantidade = input.nextInt();

        System.out.println("Infome a 1° nota: ");
        double primeira = input.nextDouble();

        double menor = primeira;
        double maior = primeira;
        double soma = primeira;

        for (int i = 2; i <= quantidade; i++) {
            System.out.println("Infome a " + i + "° nota: ");
            double nota = input.nextDouble();
            soma += nota;

            if (nota > maior) {
                maior = nota;
            } else if (nota < menor) {
                menor = nota;
            }
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + soma / quantidade);
    }
}
