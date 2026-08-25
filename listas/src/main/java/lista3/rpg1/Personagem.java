package lista3.rpg1;

public class Personagem {
    private String nome;
    private int vida;
    private int ataque;

    Personagem(String nome) {
        this(nome, 10);
    }
    Personagem(String nome, int ataque) {
        this(nome, ataque, 100);
    }
    Personagem(String nome, int ataque, int vida) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome é obrigatório");
        }

        if (vida <= 0) {
            throw new IllegalArgumentException("Vida invalida");
        }
        if (ataque <= 0) {
            throw new IllegalArgumentException("Ataque invalido");
        }

        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }

    void atacar(Personagem alvo) {
        if (estaVivo()) {
            alvo.receberDano(this.ataque);
        }
    }

    private void receberDano(int dano) {
        if (dano >= this.vida) {
            this.vida = 0;
        }else {
            this.vida -= dano;
        }
    }

    boolean estaVivo() {
        return this.vida > 0;
    }
}
