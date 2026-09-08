package ex08;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Conta {
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataAbertura;

    public Conta(String titular, int numero, String agencia) {
        if (titular == null || agencia == null || titular.isBlank() || agencia.isBlank()) {
            throw new IllegalArgumentException("Titular e agencia são obrigatorios");
        }

        if (numero < 0 || numero > 9999) {
            throw new IllegalArgumentException("Número da conta inválido");
        }

        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = agora.format(formatador);

        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = 0;
        this.dataAbertura = dataFormatada;
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public double calcularRendimento() {
        return this.saldo * 0.1;
    }

    public void exibirStatus() {
        System.out.println("============================");
        System.out.println("Titular: " + this.titular);
        System.out.println("Numero: " + this.numero + " | Agencia: " + this.agencia);
        System.out.println("Data de Abertura: " + this.dataAbertura);
        System.out.printf("Saldo: R$ %.2f\n", this.saldo);
        System.out.println("============================");

    }
}
