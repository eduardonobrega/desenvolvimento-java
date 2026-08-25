package lista2;

public class Filme {
    String titulo;
    int duracaoMinutos;
    int nota;

    Filme(String titulo, int duracaoMinutos) {
        this.titulo = titulo;
        this.duracaoMinutos = duracaoMinutos;
    }
    void exibirDuracaoEmHoras() {
        System.out.println(duracaoMinutos / 60.0);
    }

    void exibirInformacoes() {
        int horas = duracaoMinutos / 60;
        int minutosRestantes = duracaoMinutos % 60;

        System.out.println("Duração: " + horas + " horas e " + minutosRestantes + " minutos.");
    }

    void avaliar(int nota) {
        if (nota > 0 && nota < 10) {
            this.nota = nota;
        }else {
            System.out.println("Nota inválida!");
        }
    }

    String VerAvaliação() {
        return switch (this.nota) {
            case 0, 1, 2, 3 -> "ruim";
            case 4, 5, 6 -> "Mediano";
            case 7, 8, 9 -> "Bom";
            default ->  "Otimo";
        };
    }
}
