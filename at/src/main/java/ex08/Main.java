package ex08;

public class Main {
    public static void main(String[] args) {
        Gerente g = new Gerente("Eduardo", 5000);
        Estagiario e = new Estagiario("Maria", 1000);

        System.out.println(g.getSalarioBase());
        System.out.println(e.getSalarioBase());
    }
}
