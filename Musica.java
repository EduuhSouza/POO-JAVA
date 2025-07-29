public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int avaliacao;
    double mediaAvaliacao;

    void exibeFichaTecnica(){
        System.out.println("\n_____________________");
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("_____________________\n");
    }

    void avaliacao(double nota){
        avaliacao += nota;
        mediaAvaliacao++;
    }

    double retornaMedia(){
        return avaliacao / mediaAvaliacao;
    }
}
