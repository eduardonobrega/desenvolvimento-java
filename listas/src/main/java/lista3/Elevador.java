package lista3;

public class Elevador {
    private int andarAtual;
    private int totalAndares;

    Elevador(int totalAndares) {
        if  (totalAndares <= 0) {
            throw new IllegalArgumentException("Total de andares inválido!");
        }

        this.totalAndares = totalAndares;
        this.andarAtual = 1;
    }

    void subir() {
        if (this.andarAtual < this.totalAndares) {
            this.andarAtual++;
        }else {
            System.out.println("Você já está no topo");
        }
    }

    void descer() {
        if (this.andarAtual > 1) {
            this.andarAtual--;
        }else {
            System.out.println("Você já está no terreo");
        }
    }
}
