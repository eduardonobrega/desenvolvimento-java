package lista1;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe uma temperatura em Celsius: ");
        double temp = input.nextDouble();

        double fahrenheit = temp * 9 / 5 + 32;
        System.out.println("Fahrenheit: " + fahrenheit);

        input.close();
    }
}
