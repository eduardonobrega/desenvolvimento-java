import java.util.Scanner;

public class EX07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o salário bruto anual: R$ ");
        double salario = sc.nextDouble();

        double imposto;

        if (salario <= 30000) {
            imposto = 0;
        } else if (salario <= 50000) {
            imposto = (salario - 30000) * 0.10;
        } else if (salario <= 80000) {
            imposto = 20000 * 0.10;
            imposto += (salario - 50000) * 0.20;
        } else {
            imposto = 20000 * 0.10;
            imposto += 30000 * 0.20;
            imposto += (salario - 80000) * 0.30;
        }

        double salarioLiquido = salario - imposto;

        System.out.printf("Salário bruto anual: R$ %.2f%n", salario);
        System.out.printf("Imposto de renda: R$ %.2f%n", imposto);
        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);

        sc.close();

    }
}
