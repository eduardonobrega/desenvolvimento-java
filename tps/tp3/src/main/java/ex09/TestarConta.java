package ex09;

import ex08.Conta;

public class TestarConta {
    public static void main(String[] args) {
        Conta conta = new Conta("Eduardo", 123, "123-6");

        conta.exibirStatus();

        conta.depositar(500);
        conta.sacar(300);

        conta.exibirStatus();
    }
}
