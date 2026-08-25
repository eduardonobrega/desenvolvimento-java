package lista2;

public class Cronometro {
    int segundos;

    void avancar() {
        this.segundos++;
    }
    void avancar(int quantidade) {
        if (quantidade > 0) {
            this.segundos += quantidade;
        }
    }

    void zerar() {
        this.segundos = 0;
    }
    void exibirTempo() {
        System.out.println("Minutos: " + this.segundos / 60);
        System.out.println("Segundos: " + this.segundos % 60);
    }
}
