package ex12;

import ex11.Circulo;
import ex11.Esfera;

public class TestaFiguras {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3.0);
        Esfera esfera = new Esfera(5.0);

        System.out.printf("Area do circulo: %.2f\n", circulo.calcularArea());
        System.out.printf("Volume da esfera: %.2f\n", esfera.calcularVolume());


    }
}
