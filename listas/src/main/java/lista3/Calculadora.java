package lista3;

public class Calculadora {
    long fatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        }
        long resultado = 1;

        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }

        return resultado;
    }
}
