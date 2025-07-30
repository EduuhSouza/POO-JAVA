package alura.exercicios2;

public class Porta {
    String cor;
    String material;
    boolean status;

    void verificacao(){
        if (status == true){
            System.out.println("A porta está aberta");
        } else {
            System.out.println("A porta está fechada");
        }
    }
}
