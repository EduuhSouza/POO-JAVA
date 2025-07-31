package alura.exercicios2;

public class Produto {
    String nome;
    double preco;
    int estoque;
    double desconto;
    int percentualDesconto;

    void exibaDetalhes(){
        System.out.println("=======================\n");
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço unitário: " + preco);
        System.out.println("Estoque: " + estoque);
        System.out.println("\n=======================");
    }

    double valorTotalEstoque(){
        return preco * estoque;
    }

        double descontoProduto() {
           desconto = preco - (percentualDesconto / 100);
           preco -= desconto;

           return desconto;

    }

}
