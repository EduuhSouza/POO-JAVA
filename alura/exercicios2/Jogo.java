package alura.exercicios2;

public class Jogo {
    String nome;
    String categoria;
    double somaAvaliacao;
    double totalAvaliacoes;

    void exibaFicha(){
        System.out.println("===============\n");
        System.out.println("Nome do jogo: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("\n===============");
    }

    void avalia(double nota){
        somaAvaliacao += nota;
        totalAvaliacoes++;
    }

    double retornaMedia(){
        return somaAvaliacao / totalAvaliacoes;
    }

}
