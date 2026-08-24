import java.util.Scanner;

public class EX12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Frase: ");

        String frase = input.nextLine();
        String[] palavras = frase.trim().split("\\s+");

        int quantidade = 0;

        for (int i = 0; i < palavras.length; i++) {
            quantidade++;
        }

        System.out.println("Quantidade de palavras: " + quantidade);
        input.close();
    }
}
