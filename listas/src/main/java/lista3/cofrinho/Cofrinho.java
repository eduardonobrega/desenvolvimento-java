package lista3.cofrinho;

public class Cofrinho {
    private double saldo;

    Cofrinho() {
        this(0);
    }
    Cofrinho(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo deve ser positivo");
        }

        this.saldo = saldo;
    }

    void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    boolean retirar(double valor) {
        if (valor <= 0) {
            return false;
        }

        if (valor > this.saldo) {
            return false;
        }

        this.saldo -= valor;
        return true;
    }

    double consultarSaldo() {
        return this.saldo;
    }
}
