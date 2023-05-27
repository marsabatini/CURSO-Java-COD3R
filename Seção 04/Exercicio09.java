/*

    Programa recebe 10 valores e imprime o maior.

 */

package Modulo_04.exerciciosFinais;

import java.util.Scanner;

public class Exercicio09 {
    public static void main (String[] args){

        int i = 0;
        int valorFinal = 0;
        int numero = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Programa de Comparação.");

    do{

        System.out.print("Digite o " + (i + 1) + "° número: ");
        numero = entrada.nextInt();

        if(numero > valorFinal){
            valorFinal = numero;
        }

        i++;

    } while (i != 10);

        System.out.print("O maior valor foi: " + valorFinal);

        entrada.close();
    }
}
