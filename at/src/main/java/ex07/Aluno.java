package ex07;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas = new double[3];

    public Aluno(String nome, String matricula, double nota1,  double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        notas[0] = nota1;
        notas[1] = nota2;
        notas[2] = nota3;
    }

    double calcularMedia() {
        return (notas[0] + notas[1] + notas[2]) / 3;
    }

    void verificaAprovacao() {
        if (calcularMedia() >= 7) {
            System.out.println("Aprovado");
        }else  {
            System.out.println("Reprovado");
        }
    }
}
