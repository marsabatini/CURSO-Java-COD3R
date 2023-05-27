/*

    Programa recebe um número e verifica
    se ele é um número primo.

 */


package Modulo_04.exerciciosFinais;

import java.util.Scanner;

public class Exercicio04 {
    public static void main (String[] args) {

        int contador, numeroInformado, divisor = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Verificador de número primo.");
        System.out.print("Digite um número: ");
        numeroInformado = entrada.nextInt();

        for (contador = 2; contador < numeroInformado; contador++) {
            if (numeroInformado % contador == 0){
                divisor++;
            }
        }

        if (divisor == 2){

            System.out.println("O número " + numeroInformado + " é um primo.");
        }

        else
            System.out.println("O número " + numeroInformado + " não é um primo.");

        entrada.close();

    }
}
