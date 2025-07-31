package alura.exercicios2;

public class Clima {
    double temperatura;
    double umidade;
    boolean condicao;

    void exibaClima(){
        System.out.println("Temperatura: " + temperatura + "C");
        System.out.println("Umidade: " + umidade + "%");
//        System.out.println("Condição: " + condicao);
    }

    void verificacao(){
        if (temperatura < 30){
            System.out.println("Está frio");
        } else {
            System.out.println("Está Quente");
        }
    }

    void condicaoClima(){
        if(condicao == true){
            System.out.println("O tempo esta Ensolarado");
        } else {
            System.out.println("O tempo está nublado");
        }
    }


}
