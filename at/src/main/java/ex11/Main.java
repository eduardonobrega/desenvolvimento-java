package ex11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random gerador = new Random();
        Scanner ler = new Scanner(System.in);

        int[] sorteados = new int[6];
        int[] tentativas = new int[6];

        // Preenche com números unicos
        for (int i = 0; i < sorteados.length; i++) {
            int numeroSorteado;

            do {

                numeroSorteado = gerador.nextInt(60) + 1;

            } while (existeNoArray(sorteados, numeroSorteado));
            sorteados[i] = numeroSorteado;
        }

        System.out.println("Tente acertar os números sorteados");
        System.out.println("Entre 1 - 60");

        // tentativas do usuário
        for (int i = 0; i < tentativas.length; i++) {
            int tentativa;
            boolean numeroJaInserido = false;
            boolean foraDoIntervalo = false;
            do {
                System.out.print(i + 1 + "° tentativa: ");
                tentativa =  ler.nextInt();

                numeroJaInserido = existeNoArray(tentativas, tentativa);
                if (numeroJaInserido) {
                    System.out.println("Tente números diferentes!");
                }
                if (tentativa < 1 || tentativa > 60 ) {
                    foraDoIntervalo = true;
                    System.out.println("Números entre 1 e 60");
                }else {
                    foraDoIntervalo = false;
                }
            } while (numeroJaInserido || foraDoIntervalo);

            tentativas[i] = tentativa;
        }

        int acertos = 0;
        // ver quantas ele acertou
        for (int tentativa : tentativas) {
            if (existeNoArray(sorteados, tentativa)) {
                acertos++;
            }
        }

        // números sorteados
        for (int sorteado : sorteados) {
            System.out.print(sorteado + " ");
        }
        System.out.println("Acertos: " + acertos);
    }

    static boolean existeNoArray(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if  (arr[i] == n) {
                return true;
            }
        }

        return false;
    }
}
