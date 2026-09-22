package ex06;

public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("QOF3F53", "Onix", 2018, 200_000);
        Veiculo v2 = new Veiculo("PCY4D51", "Tracker", 2025, 80_000);

        v1.registrarViagem(480);
        v2.registrarViagem(1800);

        v1.exibirDetalhes();
        System.out.println();
        v2.exibirDetalhes();
    }
}
