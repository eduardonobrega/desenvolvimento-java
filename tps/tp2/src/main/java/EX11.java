import java.util.Scanner;

public class EX11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor inicial: ");
        int inicial = sc.nextInt();

        System.out.print("Incremento: ");
        int incremento = sc.nextInt();
        System.out.print(inicial);
        for (int i = inicial + incremento; i <= 100; i += incremento) {
            System.out.print(", " + i);
        }
        System.out.println();
        sc.close();
    }
}
