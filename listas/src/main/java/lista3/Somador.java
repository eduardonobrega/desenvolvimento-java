package lista3;

public class Somador {
    int somarAte(int numero) {
        int soma = 0;
        for (int i = 1; i <= numero; i++) {
            soma += i;
        }
        return soma;
    }
}
