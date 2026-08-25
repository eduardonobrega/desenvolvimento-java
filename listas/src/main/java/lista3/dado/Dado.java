package lista3.dado;

import java.util.Random;

public class Dado {
    private int lados;

     Dado(int lados) {
        if (lados < 1) {
            this.lados = 6;
        } else {
            this.lados = lados;
        }
    }

    int rolar() {
        Random random = new Random();
        return random.nextInt(this.lados) + 1;
    }
}
