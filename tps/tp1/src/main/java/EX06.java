import java.util.Scanner;

public class EX06 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Informe um ano: ");
        int ano = input.nextInt();

        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println("Ano bissexto!");
        }else {
            System.out.println("Ano não bissexto!");
        }

        input.close();
    }
}
