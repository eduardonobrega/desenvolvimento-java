package lista2;

public class Pessoa {
    String nome;
    int idade;

    Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    void apresentar() {
        System.out.println("Nome: " + this.nome + ", Idade: " + this.idade);
    }

    void fazerAniversario(){
        System.out.println("Agora tenho " + ++this.idade + " anos.");
    }
}
