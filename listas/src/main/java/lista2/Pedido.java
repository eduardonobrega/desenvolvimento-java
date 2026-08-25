package lista2;

public class Pedido {
    String produto;
    int quantidade;
    double precoUnitario;

    public Pedido(String produto, int quantidade, double precoUnitario) {
        if  (quantidade >= 0) {
            this.quantidade = quantidade;
        }
        this.produto = produto;
        this.precoUnitario = precoUnitario;
    }

    double calcularTotal() {
        return this.precoUnitario * this.quantidade;
    };

    void adicioarQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        }
    }

    void removerQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade -= quantidade;
        }
    }
    void exibirResumo() {
        System.out.println("Produto: " + this.produto);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Preço unitário: " + this.precoUnitario);
        System.out.println("Total: R$ " + this.calcularTotal());
    }
}
