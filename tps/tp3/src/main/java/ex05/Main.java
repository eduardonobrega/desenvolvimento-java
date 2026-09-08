package ex05;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Mouse");
        produto.setPreco(50);
        produto.setQuantidadeEmEstoque(2);

        System.out.println(produto.getNome() + " R$ " + produto.getPreco() +  " | " + produto.getQuantidadeEmEstoque());

        // esses métodos gets e sets são uteis, pois com os metodos get's conseguimos visualizar as informações da nossa classe
        // e com o métodos set's podemos adicionar validações e permiter que o usuário altere o estado do objeto.
    }
}
