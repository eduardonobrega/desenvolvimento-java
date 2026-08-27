package lista3.rpgTurnos;

import java.util.Random;

public class Monstro {
    private String nome;
    private int vida;
    private int ataqueMinimo;
    private int ataqueMaximo;

    private final Random random = new Random();

    public Monstro(String nome, int ataqueMinimo, int ataqueMaximo) {
        this(nome, ataqueMinimo, ataqueMaximo, 150);
    }

    public Monstro(String nome, int ataqueMinimo, int ataqueMaximo, int vida) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome é obrigatório");
        }

        if (ataqueMinimo <= 0 || ataqueMaximo <= 0 ||  vida <= 0) {
            throw new IllegalArgumentException("Informe apenas valoers maiores que 0");
        }

        if (ataqueMinimo > ataqueMaximo) {
            throw new IllegalArgumentException("Ataque minimo deve ser menor que o máximo");
        }


        this.nome = nome;
        this.ataqueMinimo = ataqueMinimo;
        this.ataqueMaximo = ataqueMaximo;
        this.vida = vida;
    }

    void atacar(Heroi heroi) {
        if (heroi.estaVivo()) {
            int dano = random.nextInt(this.ataqueMaximo - this.ataqueMinimo + 1) + this.ataqueMinimo;

            heroi.receberDano(dano);
        }
    }

     void receberDano(int dano) {
        if (dano > 0) {
            if (dano >= this.vida) {
                this.vida = 0;
            }else {
                this.vida -= dano;
            }
        }
    }

    boolean estaVivo() { return vida > 0; }

    void mostrarStatus() {
        System.out.println(this.nome + " | <3 " + this.vida);
    }

    public int getAtaqueMaximo() {
        return ataqueMaximo;
    }

    public int getAtaqueMinimo() {
        return ataqueMinimo;
    }
}
