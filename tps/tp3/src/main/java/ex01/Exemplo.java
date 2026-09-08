/*
* Classe: são como um molde ou modelo usado para criar objetos a partir dela. Nela que definimos as caracteristicas e comportametos que aquele obejto terá.
* Objeto: é uma instância, ou seja, a materialização de uma classe. Podemos criar vários objetos a partir da mesma classe, e cada um terá sua própria identidade e seu próprio estado.
* Atributos: são as características que representam o estado de um objeto. Por exemplo, em uma classe Carro, podemos ter atributos como marca, modelo e ano.
* Métodos: são os comportamentos ou ações que um objeto pode realizar. "O queo objeto pode fazer ?" para carro: acelerar, freiar, exibir alerta
* */

package ex01;

public class Exemplo {
    public static void main(String[] args) {
        Carro carro = new Carro("Chevrolet", "Onix joy", 2018);

        carro.exibirInformacoes();
    }
}

class Carro {
    private String marca;
    private String modelo;
    private int anoModelo;

    public Carro(String marca, String modelo, int anoModelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoModelo = anoModelo;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.anoModelo);
    }
}
