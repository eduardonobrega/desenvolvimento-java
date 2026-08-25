package lista3;

public class ContaBancaria {
    private String titular;
    private double saldo;

    ContaBancaria(String titular) {
        if (titular == null || titular.isBlank()) {
            throw new IllegalArgumentException("TItular é obrigatório");
        }
        this.titular = titular;
        this.saldo = 0;
    }

    void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    boolean sacar(double valor) {
        if (valor <= 0) {
            return false;
        }

        if (this.saldo < valor) {
            return false;
        }

        this.saldo -= valor;
        return true;
    }
}
