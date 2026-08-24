import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dolar = 0.19;
        double euro = 0.17;
        double libra = 0.14;

        System.out.print("R$: ");
        double valor = sc.nextDouble();

        System.out.println("Converter para:");
        System.out.println("1 - DÓLAR");
        System.out.println("2 - EURO");
        System.out.println("3 - LIBRA");
        System.out.print(": ");
        int op = sc.nextInt();


        switch (op) {
            case 1 -> System.out.printf("R$ %.2f -> $ %.2f", valor, valor * dolar);
            case 2 -> System.out.printf("R$ %.2f -> € %.2f", valor, valor * euro);
            case 3 -> System.out.printf("R$ %.2f -> £ %.2f", valor, valor * libra);
            default -> System.out.println("Opção inválida!");
        }

        sc.close();
    }
}
