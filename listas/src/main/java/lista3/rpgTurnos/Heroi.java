package lista3.rpgTurnos;

import java.util.Random;

public class Heroi {
    private String nome;
    private int vida;
    private int vidaMaxima;
    private int ataqueMinimo;
    private int ataqueMaximo;
    private int pocoes;

    private final Random random = new Random();

    public Heroi(String nome, int vidaMaxima, int ataqueMinimo, int ataqueMaximo) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome é obrigatório");
        }

        if (vidaMaxima <= 0 || ataqueMinimo <= 0 || ataqueMaximo <= 0) {
            throw new IllegalArgumentException("Informe apenas valoers maiores que 0");
        }

        if (ataqueMinimo > ataqueMaximo) {
            throw new IllegalArgumentException("Ataque minimo deve ser menor que o máximo");
        }

        this.nome = nome;
        this.vidaMaxima = vidaMaxima;

        this.ataqueMinimo = ataqueMinimo;
        this.ataqueMaximo = ataqueMaximo;

        this.vida = vidaMaxima;
        this.pocoes = 3;
    }

    void atacar(Monstro monstro) {

        if (monstro.estaVivo()) {
            int dano = random.nextInt(this.ataqueMaximo - this.ataqueMinimo + 1) + this.ataqueMinimo;

            monstro.receberDano(dano);
        }

    }

    void receberDano(int dano){
        if (dano > 0) {
            if (dano >= this.vida) {
                this.vida = 0;
            }else {
                this.vida -= dano;
            }
        }
    }

    void usarPocao() {
        if (this.pocoes > 0 && this.vida < this.vidaMaxima) {
            int novaVida = this.vida + 20;

            this.vida = Math.min(novaVida, this.vidaMaxima);
            this.pocoes--;
        }
    }

    boolean estaVivo() { return vida > 0; }

    void mostrarStatus() {
        System.out.println(this.nome + " | <3 " + this.vida + " | P " + this.pocoes);
    }

    void upar() {
        this.vidaMaxima += 20;
        this.vida = vidaMaxima;
        this.ataqueMaximo += 10;
    }

}
