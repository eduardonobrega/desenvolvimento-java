package lista3;

public class Numero {
    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    String analizar() {
        if (this.valor > 0) {
            return "positivo";
        }
        if (this.valor < 0) {
            return "negativo";
        }

        return "zero";

    }

    boolean ehPar() {
        return this.valor % 2 == 0;
    }

    void mostrarParesAte(int limite) {
        for (int i = 0; i <= limite; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            };
        }
        System.out.println();
    }
}
