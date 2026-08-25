package lista3;

public class Comparador {
    private int n1;
    private int n2;

    public Comparador(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    int maior() {
        if (this.n1 > this.n2) {
            return this.n1;
        }

        return this.n2;
    }

}
