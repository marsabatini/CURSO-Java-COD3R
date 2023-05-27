/*

    Programa recebe um número e verifica
     se ele está entre 0 e 10 e se é par

 */

package Modulo_04.exerciciosFinais;

import java.util.Scanner;

public class Exercicio01 {
    public static void main (String[] args){

        int valor = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite um número: " + entrada + "\n");
        valor = entrada.nextInt();

        if(valor >= 0 && valor <= 10){
            if (valor % 2 == 0){
                System.out.println("Esse é um valor par.");
            }
            else {
                System.out.println("Esse é um valor ímpar.");
            }
        }
        else {
            System.out.println("Esse valor não está entre 0 e 10.");
        }

        entrada.close();
    }
}
