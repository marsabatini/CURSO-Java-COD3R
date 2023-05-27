/*

    Estrutura while.
    Enquanto estiver recebendo números positivos,
    imprime no console a soma dos números inseridos.
    Caso receba um número negativo, encerra-se o programa.

 */

package Modulo_04.exerciciosFinais;

import java.util.Scanner;

public class Exercicio07 {
    public static void main (String[] args){

        int somador = 0;
        int numeroRecebido = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Para somar, insira números positivos.");
        System.out.println("Para encerrar, insira um número negativo.");

        while(numeroRecebido >= 0){

            System.out.print("Digite o número: ");
            numeroRecebido = entrada.nextInt();

            if(numeroRecebido >= 0){
                somador += numeroRecebido;
                System.out.println("A soma total está em: " + somador);
            }
        }
        System.out.printf("Bye bye...");
        entrada.close();
    }
}
