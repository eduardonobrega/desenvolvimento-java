package lista2;

public class Circulo {
    double raio;

    double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }

    double calcularCircuferencia() {
        return  2 * Math.PI * raio;
    }
}
