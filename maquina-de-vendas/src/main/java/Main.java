import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MaquinaDeVendas maquina = new MaquinaDeVendas("Café Gelado", 7, 5);

        int opcao;

        for (int i = 0; i < 3; i++) {

            do {
                showMenu();
                opcao = sc.nextInt();
                switch (opcao) {
                    case 1 -> {
                        System.out.print("Valor: R$ ");
                        double valor = sc.nextDouble();
                        maquina.inserirDinheiro(valor);
                    }
                    case 2 -> maquina.comprar();
                    case 3 -> System.out.printf("Saldo atual: R$ %.2f\n", maquina.getSaldo());
                    case 4 -> System.out.println("Estoque atual: " + maquina.getEstoque());
                    case 5 -> System.out.printf("Valor devolvido: R$ %.2f\n", maquina.devolverDinheiro());
                    case 6 -> {
                        System.out.print("Quantidade: ");
                        int quantidade = sc.nextInt();
                        maquina.reabastecer(quantidade);
                    }
                    case 7 -> maquina.status();
                    case 0 -> maquina.devolverDinheiro();
                    default -> System.out.println("Opção inválida.");
                }
            } while (opcao != 0);

        }
    }

    static void showMenu() {
        System.out.println();
        System.out.println("=========================");
        System.out.println("    MÁQUINA DE VENDAS    ");
        System.out.println("=========================");
        System.out.println();
        System.out.println("Produto: Café Gelado");
        System.out.println("Preço: R$ 7.00");
        System.out.println();
        System.out.println("1 - Inserir dinheiro");
        System.out.println("2 - Comprar");
        System.out.println("3 - Ver saldo");
        System.out.println("4 - Ver estoque");
        System.out.println("5 - Devolver dinheiro");
        System.out.println("6 - Reabastecer");
        System.out.println("7 - Mostrar informações");
        System.out.println("0 - Sair");
        System.out.println();
        System.out.print("Escolha: ");
    }
}
