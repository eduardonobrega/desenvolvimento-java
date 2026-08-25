package lista1;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ano: ");
        int ano = sc.nextInt();

        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println(ano + " -> bissexto");
        }else {
            System.out.println(ano + " -> não bissexto");
        }
    }
}
