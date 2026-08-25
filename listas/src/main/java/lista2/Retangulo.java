package lista2;

public class Retangulo {
    double largura;
    double altura;

    Retangulo (double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    double calcularArea(){
        return largura * altura;
    }

    double carcularPerimetro(){
        return (largura + altura) * 2;
    }

    void exibirDados(){
        System.out.println("Largura: " + this.largura);
        System.out.println("Altura: " + this.altura);
    }
}
