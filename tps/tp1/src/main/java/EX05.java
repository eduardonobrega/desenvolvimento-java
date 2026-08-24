import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Valor da compra: R$ ");
        double valorCompra = sc.nextDouble();
        double valorComDesconto;
        double desconto = 0;

        if  (valorCompra > 1000) {
            desconto = 0.1;
        }
        else if (valorCompra >= 500) {
            desconto = 0.05;
        }

        valorComDesconto = valorCompra - valorCompra * desconto;

        System.out.printf("Valor original: R$ %.2f\n", valorCompra);
        System.out.printf("Desconto aplicado: %.0f%%\n", desconto * 100);
        System.out.printf("Valor final: R$ %.2f\n", valorComDesconto);
        sc.close();
    }
}
