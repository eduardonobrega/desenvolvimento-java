package ex03;

public class Produto {
    public String nome;
    public double preco;
    public int quantidadeEmEstoque;


    public void alterarPreco(double preco){
        if (preco > 0) {
            this.preco = preco;
        }
    }

    public void alterarQuantidad(int quantidade){
        if (quantidade > 0) {
            this.quantidadeEmEstoque = quantidade;
        }
    }

    public void exibirInformacoes() {
        System.out.println(this.nome + " | R$ " + this.preco  + " | "  + this.quantidadeEmEstoque + " em estoque");
    }

}
