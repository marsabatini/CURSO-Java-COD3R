package Modulo_06.arrays;

public class Foreach {
    public static void main (String[] args){

        double[] notas = { 9.9, 8.7, 7.2, 9.4 };

        for(int i = 0; i < notas.length; i++){
            System.out.print(notas[i] + " ");
        }

        System.out.println();

        //Foreach --> esse laço acessa todos os arrays um de cada vez
        for(double nota: notas){
            System.out.print(nota + " ");
        }
    }
}
