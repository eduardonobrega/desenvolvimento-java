package lista3.rpg1;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Personagem wendy = new Personagem("Wendy", 50);
        Personagem nina = new Personagem("Nina", 50);
        Random gerador = new Random();

        while (wendy.estaVivo() && nina.estaVivo()) {
            int resultado = gerador.nextInt(2) + 1;

            if (resultado == 1) {
                wendy.atacar(nina);
            }else {
                nina.atacar(wendy);
            }
        }

        if (wendy.estaVivo()) {
            System.out.println("Wendy Ganhou");
        } else  {
            System.out.println("Nina Ganhou");
        }
    }
}
