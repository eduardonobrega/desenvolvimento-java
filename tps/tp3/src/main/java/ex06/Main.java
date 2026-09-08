package ex06;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Teclado", 149.99, 20);
        produto.exibirInformacoes();

        // O construtor facilita a criação de objetos, pois torna obrigatório informar os atributos na criação do objeto,
        // se usassemos somentes settes poderiamos esquecer de definir algum atributo

    }
}
