public class MaquinaDeVendas {
    final private String produto;
    final private double preco;
    private int estoque;
    private double saldo;

    public MaquinaDeVendas(String produto, double preco) {
        this(produto, preco, 10);
    }

    public MaquinaDeVendas(String produto, double preco, int estoque) {
        if (produto == null || produto.isBlank()) {
            throw new IllegalArgumentException("Nome é obrigatório!");
        }

        if (preco < 0) {
            throw new IllegalArgumentException("Preço deve ser positivo!");
        }

        if (estoque < 0) {
            throw new IllegalArgumentException("Estoque deve ser positivo!");
        }

        this.estoque = estoque;
        this.produto = produto;
        this.preco = preco;
        this.saldo = 0;
    }


    int getEstoque() {
        return this.estoque;
    }

    double getSaldo() {
        return this.saldo;
    }

    void inserirDinheiro(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser positivo!");
        }

        this.saldo += valor;
        System.out.println("Deposito Realizado com sucesso!");
    }

    boolean temEstoque() {
        return this.estoque > 0;
    }

    boolean temSaldoSuficiente() {
        return this.saldo >= this.preco;
    }

    void comprar() {
        if (!temEstoque()) {
            System.out.println("Produto esgotado.");
            return;
        }

        if (!temSaldoSuficiente()) {
            System.out.println("Saldo insuficiente!");
            return;
        }

        this.estoque--;
        this.saldo -= this.preco;
        System.out.println("Compra realizada com sucesso!");
    }

    double devolverDinheiro() {
        double devolucao = this.saldo;
        this.saldo = 0;

        return devolucao;
    }

    void reabastecer(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser positivo!");
        }

        this.estoque += quantidade;

        System.out.println("Maquina reabastecida com sucesso!");
    }

    void status() {
        System.out.println("Produto: " + this.produto);
        System.out.printf("Preço: R$ %.2f\n", this.preco);
        System.out.println("Estoque: " + this.estoque);
        System.out.printf("Saldo inserido: R$ %.2f\n", this.saldo);
    }
}
