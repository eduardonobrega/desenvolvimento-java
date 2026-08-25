package lista2;

public class Produto {
    String nome;
    double preco;

    Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    void exibirDados(){
        System.out.println("Nome do produto: " + this.nome + " Preco: " + this.preco);
    }

    void aumentarPreco(double pecentual){
        this.preco += this.preco * pecentual / 100;
    }
}
