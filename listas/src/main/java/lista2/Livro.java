package lista2;

public class Livro {
    String titulo;
    String autor;
    int numeroPaginas;
    boolean emprestado;

    Livro(String titulo, String autor, int numeroPaginas, boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.emprestado = emprestado;
    }

    void emprestar(){
        if (emprestado){
            System.out.println("Livro já está emprestado");
        }else {
            this.emprestado = true;
            System.out.println("Livro emprestado com sucesso");
        }
    }

    void devolver(){
        if (emprestado){
            System.out.println("Livro devolvido com sucesso");
            this.emprestado = false;
        }
        else  {
            System.out.println("Livro não está emprestado");
        }
    }

    void exibirInformacoes(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Numero Paginas: " + this.numeroPaginas);
        System.out.println("Emprestado: " + this.emprestado);
    }
}
