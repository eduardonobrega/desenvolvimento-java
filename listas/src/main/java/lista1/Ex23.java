package lista1;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.print("Numero inteiro positivo: ");
        int numero = input.nextInt();

//        for (int i = 1; i <= numero; i++) {
//            if (i % 2 == 0){
//                System.out.println(i);
//            }
//        }

        for  (int i = 2; i <= numero; i += 2) {
            System.out.println(i);
        }
    }
}
