package lista2;

public class Lampada {
    boolean ligada;

    void ligar() {
        ligada = true;
    }
    void desligar() {
        ligada = false;
    }
    void alternar() {
        ligada = !ligada;
    }
    void exibirEstado() {
        if (ligada) {
            System.out.println("A lâmpada está ligada.");
        }
        else  {
            System.out.println("A lâmpada está desligada.");
        }
    }
}
