import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe seu nome completo: ");
        String nome = input.nextLine();

        System.out.print("Informe sua idade: ");
        int idade = input.nextInt();
        input.nextLine();

        System.out.print("Nome do pai: ");
        String pai = input.nextLine();

        System.out.print("Nome da mãe: ");
        String mae = input.nextLine();

        String maior = nome;

        if (pai.length() > maior.length()) {
            maior = pai;
        }
        if (mae.length() > maior.length()) {
            maior = mae;
        }

        System.out.println("==============");
        System.out.println("Nome: " + nome + " | Idade: " + idade);
        System.out.println("pai: " + pai);
        System.out.println("mae: " + mae);

        System.out.println("Nome mais longo: " + maior);
        input.close();
    }
}
