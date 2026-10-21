package objetos;

public class Livro {

    String titulo;
    String autor;
    int numeroPaginas;
    boolean emprestado = false;

    public void emprestar() {
        if (emprestado) {
            System.out.println("O livro \"" + titulo + "\" já está emprestado!");
        } else {
            emprestado = true;
            System.out.println("Você emprestou o livro: \"" + titulo + "\" com sucesso!");
        }
    }

    public void devolver() {
        if (!emprestado) {
            System.out.println("O livro \"" + titulo + "\" não está emprestado para ser devolvido!");
        } else {
            emprestado = false;
            System.out.println("Você devolveu o livro: \"" + titulo + "\" com sucesso!");
        }
    }

    public void exibirInformacoes() {
        System.out.println("\n--- INFORMAÇÕES DO LIVRO ---");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + numeroPaginas);
        System.out.println("Status: " + (emprestado ? "Emprestado" : "Disponível"));
        System.out.println("----------------------------\n");
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}