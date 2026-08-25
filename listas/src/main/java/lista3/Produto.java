package lista3;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    Produto(String nome, double preco) {
        this(nome, preco, 0);
    }

    Produto(String nome, double preco, int quantidade) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome é obrigatório");
        }

        if (preco <= 0) {
            throw new IllegalArgumentException("Preço inválido!");
        }

        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade inválida!");
        }

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    double valorEstoque() {
        return this.preco * this.quantidade;
    }

    void adicionarEstoque(int quantidade) {
        if (quantidade <= 0) {
            throw  new IllegalArgumentException("Quantidade deve ser maior que zero!");
        }
        this.quantidade += quantidade;
    }

    boolean removerEstoque(int quantidade) {
        if (quantidade <= 0) {
            return false;
        }
        if (quantidade > this.quantidade) {
            return false;
        }

        this.quantidade -= quantidade;
        return true;
    }
}

