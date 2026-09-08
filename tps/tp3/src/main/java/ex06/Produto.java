package ex06;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    // O construtor faz com que seja obrigatório criar um produto já com esses valores definidos, e faz a validação
    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome é obrigatório");
        }

        if (preco < 0) {
            throw new IllegalArgumentException("Preco precisar ser um valor maior que zero");
        }

        if (quantidadeEmEstoque < 0) {
            throw new IllegalArgumentException("Quantidade em estoque precisa ser um valor maior que zero");
        }

        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }


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
