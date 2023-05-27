/*

      Programa recebe uma palavra e imprime no console letra por letra.

 */

package Modulo_04.exerciciosFinais;

import java.util.Scanner;

public class Exercicio08 {
    public static void main (String[] args) throws InterruptedException {

        Scanner entrada = new Scanner(System.in);


        System.out.println("Bem-vindo ao soletrando...");
        System.out.print("Por favor, digite uma palavra: ");
        String palavra = entrada.nextLine();
        char soletrando[] = palavra.toCharArray();

        System.out.println("A palavra digitada foi: " + palavra);
        System.out.print("Processando.");
        new Thread().sleep(500);
        System.out.print(".");
        new Thread().sleep(500);
        System.out.print(".");
        new Thread().sleep(500);
        System.out.print(".");
        new Thread().sleep(500);
        System.out.print(".");
        new Thread().sleep(500);
        System.out.print(".\n");


        for (int i =0; i < soletrando.length; i++){

            System.out.println("\t--> " + soletrando[i]);
            new Thread().sleep(500);

        }

        entrada.close();
    }
}
