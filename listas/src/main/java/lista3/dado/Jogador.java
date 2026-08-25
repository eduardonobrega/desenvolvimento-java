package lista3.dado;

public class Jogador {
    private String nome;
    private int pontos;

    Jogador(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome é obrigatório");
        }
        this.nome = nome;
        this.pontos = 0;
    }
    void jogar(Dado dado) {
        this.pontos += dado.rolar();
    }

    int  getPontos() {
        return this.pontos;
    }
}
