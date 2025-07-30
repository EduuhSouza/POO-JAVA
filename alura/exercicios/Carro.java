package alura.exercicios;

public class Carro {
    String nome;
    int anoDeLancamento;
    String marca;
    String ipvaPago;
    double somaDasAvaliacao;
    int totalDeAvaliacao;

    void exibeFichaTecnica(){
        System.out.println("***********************\n");
        System.out.println("Modelo do carro: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
//        System.out.println("O IPVA está: " + ipvaPago);
        System.out.println("\n***********************");
    }

    void avalia(double nota){
        somaDasAvaliacao += nota;
        totalDeAvaliacao++;
    }

    double pegaMedia(){
        return  somaDasAvaliacao / totalDeAvaliacao;
    }
}
