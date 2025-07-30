package alura.exercicios2;

public class Produto {
    String nome;
    double preco;
    int estoque;

    void exibaDetalhes(){
        System.out.println("=======================\n");
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço unitário: " + preco);
        System.out.println("Estoque: " + estoque);
        System.out.println("\n=======================");
    }
}
