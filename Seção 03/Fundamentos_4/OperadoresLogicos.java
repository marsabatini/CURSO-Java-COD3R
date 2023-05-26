package Modulo_03.Fundamentos_4;

public class OperadoresLogicos {
    public static void main (String args[]){

     boolean trabalho1 = false;
     boolean trabalho2 = false;

     if (trabalho1 && trabalho2){
         System.out.println("Parabéns, o trabalho na Terça e na Quinta foram realizados.");
         System.out.println("Vocês comprarão uma TV de 50 polegadas e tomarão sorvete\n");
     }
     else if (trabalho1 || trabalho2){
         System.out.println("Apenas um trabalho foi realizado.");
         System.out.println("Vocês comprarão uma TV de 32 polegadas e tomarão sorvete.\n");
     }
     else if (!(trabalho1 && trabalho2)){
         System.out.println("Infelizmente, nenhum trabalho foi realizado.");
         System.out.println("Vocês não comprarão uma TV nem tomarão sorvete.");
         System.out.println("Mas ficarão mais saudáveis física e intelecutalmente!");
     }
    }
}
