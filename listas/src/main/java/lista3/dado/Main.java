package lista3.dado;

public class Main {
    public static void main(String[] args) {
        Dado dado = new Dado(6);

//        for (int i = 0; i < 10; i++) {
//            System.out.println(dado.rolar());
//        }

        Jogador sarah = new Jogador("Sarah");
        Jogador eduardo = new Jogador("Eduardo");

        sarah.jogar(dado);
        sarah.jogar(dado);
        sarah.jogar(dado);
        sarah.jogar(dado);
        sarah.jogar(dado);

        eduardo.jogar(dado);
        eduardo.jogar(dado);
        eduardo.jogar(dado);
        eduardo.jogar(dado);
        eduardo.jogar(dado);

        System.out.println("Eduardo: " + eduardo.getPontos());
        System.out.println("Sarah: " + sarah.getPontos());

        if (eduardo.getPontos() > sarah.getPontos()) {
            System.out.println("Eduardo Ganhou");
        }else if (sarah.getPontos() > eduardo.getPontos()) {
            System.out.println("Sarah Ganhou");
        }else {
            System.out.println("Empate");
        }

    }
}
