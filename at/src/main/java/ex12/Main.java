package ex12;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] mensagensUser1 = new String[5];
        String[] mensagensUser2 = new String[5];

        System.out.print("Digite o nome do primeiro usuário: ");
        String user1 = input.nextLine();

        System.out.print("Digite o nome do segundo usuario: ");
        String user2 = input.nextLine();

        for (int i = 0; i < 5; i++) {
            System.out.print(user1 + ", digite sua mensagem: ");
            mensagensUser1[i] = input.nextLine();

            System.out.print(user2 + ", digite sua mensagem: ");
            mensagensUser2[i] = input.nextLine();
        }

        System.out.println("===== Histórico de Mensagens =====");
        for (int i = 0; i < 5; i++) {
            System.out.println(user1 + ": " + mensagensUser1[i]);
            System.out.println(user2 + ": " + mensagensUser2[i]);
            System.out.println();
        }

        System.out.println("Obrigado por utilizarem o sistema! Boa sorte para vocês! \uD83D\uDE80");
    }
}
