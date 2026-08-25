package lista3;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    double calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    boolean estaAprovado(double mediaBase) {
        return this.calcularMedia() >= mediaBase;
    }

    String getNome() {
        return this.nome;
    }
}
