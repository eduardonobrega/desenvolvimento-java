package lista2;

public class Carro {
    String modelo;
    int velocidade;

    void acelerar(int valor){
        velocidade += valor;
    }

    void frear(int valor){
        if (velocidade >= valor){
            velocidade -= valor;
        }
        else {
            System.out.println("Valor inválido");
        }
    }

    void exibirVelocidade(){
        System.out.println("Velocidade: " + velocidade);
    }

}
