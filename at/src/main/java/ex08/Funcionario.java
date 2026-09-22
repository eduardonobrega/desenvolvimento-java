package ex08;

public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    double getSalarioBase() {
        return this.salarioBase;
    }

}
