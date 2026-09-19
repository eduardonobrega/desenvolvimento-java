package ex02;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        while (true) {

            System.out.print("Senha: ");
            String senha = sc.nextLine();

            if (senha.length() < 8) {
                System.out.println("Senha deve ter no minimo 8 caracteres");
                System.out.println("Tente novamente");
                continue;
            }

            int quantUpper = 0;
            int quantNumber = 0;
            int quantEspecial = 0;

            String simbolos = "@#$&?!";

            for (char letra : senha.toCharArray()) {
                if (Character.isUpperCase(letra)) {
                    quantUpper++;
                } else if (Character.isDigit(letra)) {
                    quantNumber++;
                } else if (simbolos.indexOf(letra) != -1) {
                    quantEspecial++;
                }
            }


            if (quantUpper == 0) {
                System.out.println("Sua senha deve ter ao menos uma letra maiúscula!");
            } else if (quantNumber == 0) {
                System.out.println("Sua senha deve ter ao menos um número!");
            } else if (quantEspecial == 0) {
                System.out.println("Sua senha deve conter ao menos um caractere especial (" + simbolos + ")!");
            }else {
                break;
            }
            System.out.println("Tente novamente!");
        }
        System.out.println("Senha criada com sucesso!");
        sc.close();
    }
}
