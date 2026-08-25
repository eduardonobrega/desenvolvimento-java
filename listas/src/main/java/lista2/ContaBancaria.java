package lista2;

public class ContaBancaria {
    String titular;
    double saldo;

    void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Depositado com sucesso");
        }
    }

    void sacar(double valor){
        if  (saldo >= valor){
            saldo -= valor;
            System.out.println("Sacado com sucesso");
        }
    }

    void exibirSaldo(){
        System.out.println("Saldo: R$ " + saldo);
    }
}
