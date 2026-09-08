package ex05;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;


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

    // Métodos Get
    public String getNome() {
        return this.nome;
    }
    public double getPreco() {
        return this.preco;
    }
    public int getQuantidadeEmEstoque() {
        return this.quantidadeEmEstoque;
    }

    // Métodos Set
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }



}
