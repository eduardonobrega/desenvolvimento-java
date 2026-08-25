package lista2;

public class Temperatura {
    double celsius;

    double converterParaFahrenheit() {
        return celsius * 1.8 + 32;
    }
    double converterParaKelvin() {
        return celsius + 273.15;
    }
    void exibirConversoes() {
        System.out.println("Fahrenheit: " + converterParaFahrenheit());
        System.out.println("Celsius: " + converterParaKelvin());
    }
}
