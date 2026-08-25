package lista1;

import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio = sc.nextInt();
        int fim = sc.nextInt();

        int primos = 0;
        for  (int i = inicio; i <= fim; i++) {

        }


    }

    boolean numeroPrimo(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        return false;
    }
}
