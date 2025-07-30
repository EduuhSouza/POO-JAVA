package alura.exercicios2;

public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;
    int paginas;
    int idadeLivro;

    void exibaFicha(){
        System.out.println("________________________\n");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
        System.out.println("Ano em que foi publicado: " + anoPublicacao);
        System.out.println("\n________________________");
    }

    void calcula(){
        idadeLivro = 2025 - anoPublicacao;
        System.out.println("Este livro tem: " + idadeLivro + " anos");
    }

}
