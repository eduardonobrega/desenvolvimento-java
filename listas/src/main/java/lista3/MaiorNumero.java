package lista3;

public class MaiorNumero {
    private int n1;
    private int n2;
    private int n3;

    MaiorNumero(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    int encontrarMaior() {
        int maior = this.n1;

        if (this.n2 > maior) {
            maior = this.n2;
        }

        if (this.n3 > maior) {
            maior = this.n3;
        }

        return maior;
    }
}
