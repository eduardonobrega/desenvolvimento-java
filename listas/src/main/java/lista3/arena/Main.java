package lista3.arena;

public class Main {
    public static void main(String[] args) {
        Gladiador irineu = new Gladiador("Irineu", 10, 50);
        Gladiador betao = new Gladiador("betao", 10, 50);

        batalha(betao, irineu);
    }

    static void batalha(Gladiador g1, Gladiador g2) {
        int rodadas = 0;

        while (g1.estaVivo() && g2.estaVivo())  {
            rodadas++;

            System.out.printf("--- Rodada %d ---\n",  rodadas);
            if (rodadas % 2 == 0) {
                g1.atacar(g2);
                g2.mostrarStatus();
            }else {
                g2.atacar(g1);
                g1.mostrarStatus();
            }
            System.out.println("----------");
        }

        System.out.println("=== Fim ===");
        if (g1.estaVivo()) {
            System.out.println("Vencedor: " + g1.getNome() + " | vida: " + g1.getVida());
        }else {
            System.out.println("Vencedor: " + g2.getNome() + " | vida: " + g2.getVida());
        }
    }
}


