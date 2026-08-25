package lista2;

public class Calculadora {

    double somar(double num1, double num2){
        return num1 + num2;
    }

    double subtrair(double num1, double num2){
        return num1 - num2;
    }

    double multiplicar(double num1, double num2){
        return num1 * num2;
    }

    double dividir(double num1, double num2){
        if (num2 <= 0){
            System.out.println("Divisor maior e diferente de 0");
            return 0;
        }
        return num1 / num2;
    }
}
