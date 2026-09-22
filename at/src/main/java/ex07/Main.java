package ex07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Matricula do aluno: ");
        String matricula = sc.nextLine();

        System.out.print("1° nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("2° nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("3° nota: ");
        double nota3 = sc.nextDouble();

        Aluno a1 = new Aluno(nome, matricula, nota1, nota2, nota3);
        System.out.printf("Média: %.1f\n", a1.calcularMedia());
        a1.verificaAprovacao();
    }
}
