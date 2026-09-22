package ex09;

public class ContaBancaria {
    String titular;
    private double saldo;

    ContaBancaria(String titular) {
        this(titular, 0);
    }

    ContaBancaria(String titular, double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo inválido");
        }

        this.titular = titular;
        this.saldo = saldo;
    }

    void depositar(double valor) {
        if (valor > 0)  {
            this.saldo += valor;
        }
    }

    void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            this.saldo -= valor;
        }
    }

    void exibirSaldo() {
        System.out.printf("Saldo: R$ %.2f\n", this.saldo);
    }
}
