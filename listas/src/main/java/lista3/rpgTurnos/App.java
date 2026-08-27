package lista3.rpgTurnos;

import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Monstro monstro = new Monstro("mostro1", 5, 12);
        Heroi heroi = new Heroi("Arkad", 100, 8, 15);

        int vitorias = 0;

        while (heroi.estaVivo() && monstro.estaVivo()) {
            boolean gastouTurno = false;

            switch (menu()) {
                case 1 -> {
                    heroi.atacar(monstro);
                    gastouTurno = true;
                }
                case 2 -> {
                    heroi.usarPocao();
                    gastouTurno = true;
                }
                case 3 -> {
                    heroi.mostrarStatus();
                    monstro.mostrarStatus();
                }
            }


            if (!monstro.estaVivo()) {
                System.out.println("====================");
                System.out.println("    VOCÊ VENCEU!    ");
                System.out.println("====================");
                vitorias++;

                int op;

                do {

                    System.out.println("1 - Continuar a aventura");
                    System.out.println("2 - Encerrar o jogo");
                    System.out.print(": ");
                    op = sc.nextInt();

                    if (op == 1) {
                        int novoAtaqueMinimo = monstro.getAtaqueMinimo() + 3;
                        int novoAtaqueMaximo = monstro.getAtaqueMaximo() + 5;
                        int novaVida = 150 + (vitorias * 50);

                        monstro = new Monstro("mostro" + (vitorias + 1), novoAtaqueMinimo, novoAtaqueMaximo, novaVida);
                        heroi.upar();
                    }

                    if (op < 1 || op > 2) {
                        System.out.println("Opção inválida");
                    }

                } while (op < 1 || op > 2);
            } else if (gastouTurno) {
                monstro.atacar(heroi);
                if (!heroi.estaVivo()) {
                    System.out.println("====================");
                    System.out.println("    GAME OVER    ");
                    System.out.println("====================");
                }
            }

        }
    }


    static int menu() {
        int op;

        do {
            System.out.println("=====================");
            System.out.println("       BATALHA       ");
            System.out.println("=====================");

            System.out.println("1 - Atacar");
            System.out.println("2 - Usar poção");
            System.out.println("3 - Ver status");
            System.out.print(": ");

            op = sc.nextInt();
            if (op <= 0 || op > 3) {
                System.out.println("Opção inválida!");
            } else {
                break;
            }
        } while (true);

        return op;
    }
}
