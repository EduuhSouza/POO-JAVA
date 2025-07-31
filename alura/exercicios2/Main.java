package alura.exercicios2;

public class Main {
    public static void main(String[] args) {
//        EXERCICIO 1 PORTA
//        Porta porta = new Porta();
//        porta.cor = "Camaleão";
//        porta.material = "Madeira";
//        porta.status = false;
//
//        porta.verificacao();

//        EXERCICIO 2 LIVRO
//        Livro livro = new Livro();
//
//        livro.titulo = "AAAA";
//        livro.autor = "Fulano de tal";
//        livro.paginas = 666;
//        livro.anoPublicacao = 2019;
//
//        livro.exibaFicha();
//        livro.calcula();

//        EXERCICIOS 3 CLIMA
//        Clima climaHoje = new Clima();
//        climaHoje.condicao = "Ensolarado";
//        climaHoje.temperatura = 35;
//        climaHoje.umidade = 76;
//
//        climaHoje.exibaClima();
//        climaHoje.verificacao();


//        EXERCICIO 4 PRODUTO
//        Produto produto = new Produto();
//
//        produto.nome = "Camiseta Imperius";
//        produto.estoque = 100;
//        produto.preco = 79.99;
//        produto.percentualDesconto = 2000;
//
//        produto.exibaDetalhes();
//        System.out.println("Valor total em estoque: R$ " + produto.valorTotalEstoque());
//
//        System.out.println("Valor com desconto: R$ " + produto.descontoProduto());

//        EXERCICIO 5 JOGO
          Jogo jogo = new Jogo();

          jogo.nome = "The last of Us";
          jogo.categoria = "Ficção cienfitica";

          jogo.avalia(10);
          jogo.avalia(10);
          jogo.avalia(10);

        jogo.exibaFicha();
        System.out.println("Media das avaliações: " + jogo.retornaMedia());

    }
}
