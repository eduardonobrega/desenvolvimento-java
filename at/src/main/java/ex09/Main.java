package ex09;

public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("Eduardo");
        c1.exibirSaldo();
        c1.depositar(500);
        c1.exibirSaldo();
        c1.sacar(200);
        c1.exibirSaldo();
    }
}
