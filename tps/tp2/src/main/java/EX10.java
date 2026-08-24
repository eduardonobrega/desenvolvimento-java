import java.util.Random;
import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        // Gera de 0 a 99 e soma 1 (resultado: 1 a 100)
        int numeroAleatorio = random.nextInt(100) + 1;
        int tentativa;
        int quantTentativas = 0;

        do {
            quantTentativas++;
            System.out.print(quantTentativas + "° tentativa: ");
            tentativa = input.nextInt();

            if (tentativa == numeroAleatorio) {
                System.out.println("Parabéns, você acertou!");
            } else if (tentativa < numeroAleatorio) {
                System.out.println("Tente um número maior");
            } else {
                System.out.println("Tente um número menor");
            }
        }while (tentativa != numeroAleatorio);
        input.close();
    }
}
