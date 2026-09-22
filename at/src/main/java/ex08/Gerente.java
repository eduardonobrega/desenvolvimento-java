package ex08;

public class Gerente extends Funcionario {
    Gerente(String nome, double salarioBase) {
        super(nome, salarioBase * 1.20);
    }
}
