package lista1;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        double numero = input.nextInt();

        System.out.print("Operação: [+, -, *, /] ");
        char op = input.next().charAt(0);

        System.out.print("Digite outro numero: ");
        double numero2 = input.nextInt();

        Double resultado = switch (op) {
            case '+' -> numero + numero2;
            case '-' -> numero - numero2;
            case '*' -> numero * numero2;
            case '/' -> numero2 == 0.0 ? null : numero / numero2;
            default -> null;
        };

        if (resultado != null) {
            System.out.println("Sucesso: " + resultado);
        } else {
            System.out.println("Erro: Operação inválida ou divisão por zero.");
        }


    }
}
