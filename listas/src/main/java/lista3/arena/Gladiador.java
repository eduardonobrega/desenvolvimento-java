package lista3.arena;

import java.util.Random;

public class Gladiador {
    private String nome;
    private int vida;
    private int ataqueMinimo;
    private int ataqueMaximo;

    Random random = new Random();

    Gladiador(String nome, int ataqueMinimo, int ataqueMaximo) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome é obrigatório");
        }

        if (ataqueMinimo <= 0 || ataqueMaximo <= 0) {
            throw new IllegalArgumentException("Informe valaroes maiores que 0");
        }

        if (ataqueMinimo > ataqueMaximo) {
            throw new IllegalArgumentException("artaque Maximo deve ser maior que ataque minimo.");
        }

        this.nome = nome;
        this.ataqueMaximo = ataqueMaximo;
        this.ataqueMinimo = ataqueMinimo;
        this.vida = 100;
    }

    private int calcularAtaque() {
        int dano = random.nextInt(ataqueMaximo - ataqueMinimo + 1) + ataqueMinimo;
        int chance = random.nextInt(100) + 1;

        if (chance <= 20) {
            dano *= 2;
        }
        return dano;
    }

    private void receberDano(int dano) {
        if (dano > 0) {
            if (dano >= this.vida) {
                this.vida = 0;
            }else {
                this.vida -= dano;
            }

        }
    }

    void atacar(Gladiador adversario) {
        if (adversario.estaVivo()) {
            int dano = this.calcularAtaque();
            adversario.receberDano(dano);
            System.out.printf("%s atacou %s causando %d de dano.\n", this.nome,  adversario.nome, dano);
        }
    }

    boolean estaVivo() {return this.vida > 0;}

    void mostrarStatus() {
        if (this.estaVivo()) {
            System.out.println(this.nome + " possui " + this.vida + " de vida.");
        }else {
            System.out.println(this.nome + " está morto.");
        }
    }

    String getNome() {
        return this.nome;
    }
    int getVida() {
        return this.vida;
    }

}
