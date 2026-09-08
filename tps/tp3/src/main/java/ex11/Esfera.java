package ex11;

public class Esfera {
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double calcularVolume() {
        return 4.0 / 3.0 * Math.PI * this.raio * this.raio * this.raio;
    }
}
