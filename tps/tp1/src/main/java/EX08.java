import java.util.Scanner;

public class EX08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lado 1: ");
        double lado1 = sc.nextDouble();

        System.out.print("Lado 2: ");
        double lado2 = sc.nextDouble();

        System.out.print("Lado 3: ");
        double lado3 = sc.nextDouble();

        if (valido(lado1, lado2, lado3)) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Equilatero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Isosceles");
            }else {
                System.out.println("Escaleno");
            }
        }else {
            System.out.println("Não é um triângulo");
        }
        sc.close();
    }

    static boolean valido(double lado1, double lado2, double lado3) {
        return (lado1 < (lado2 + lado3)) && (lado2 < (lado3 + lado1)) && (lado3 < (lado1 + lado2));
    }
}
