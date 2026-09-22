package ex04;
import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Valor do Emprestimo: R$ ");
        double valor = sc.nextDouble();

        System.out.print("Parcelas: (6x - 48x): ");
        int parcelas = sc.nextInt();

        if  (parcelas >= 6 && parcelas <= 48) {
            double juros = valor * 0.03 * parcelas;
            double emprestimo = valor + juros;
            double valorParcela = emprestimo / parcelas;
            System.out.printf("Emprestimo: R$ %.2f\n", emprestimo);
            System.out.printf("Valor da parcela: R$ %.2f %dx\n", valorParcela  , parcelas);
        }else {
            System.out.println("Quantidade de parcelas inválidas");
        }

        sc.close();
    }
}
