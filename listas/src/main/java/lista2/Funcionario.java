package lista2;

public class Funcionario {
    String nome;
    double salario;

    Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    void aumentarSalario(double percentual){
        salario += salario * percentual / 100;
    }
    double calcularSalarioAnual(){
        return salario * 12;
    }

    void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
        System.out.println("Salario anual: " + calcularSalarioAnual());
    }
}
