package lista1;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Produto: ");
        String produto = input.nextLine();

        System.out.print("Preço unitario: ");
        double preco = input.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = input.nextInt();

        System.out.println("Produto: " + produto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Total: " + (preco * quantidade));

        input.close();
    }
}
