package ex04;

import ex03.Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Teclado";
        produto.preco = 149.99;
        produto.quantidadeEmEstoque = 20;

        produto.alterarPreco(150);
        produto.alterarQuantidad(50);
        produto.exibirInformacoes();
    }
}
