import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1° nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("2° nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("3° nota: ");
        double nota3 = sc.nextDouble();

        System.out.print("4° nota: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Media: " + media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        }else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
