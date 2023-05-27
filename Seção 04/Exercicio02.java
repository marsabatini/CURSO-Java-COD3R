/*

    Programa informa se o ano atual é bissexto.

 */

package Modulo_04.exerciciosFinais;

import java.util.Calendar;

public class Exercicio02 {
    public static void main (String[] args) {

        Calendar anoAtual = Calendar.getInstance();

        System.out.println("O ano atual é: " + anoAtual.get(Calendar.YEAR));

        if((anoAtual.get(Calendar.YEAR) % 4) == 0){

            if((anoAtual.get(Calendar.YEAR) % 100) != 0) {

                if((anoAtual.get(Calendar.YEAR) % 400) == 0){
                    System.out.println("É um ano bissexto");
                }
                else{
                    System.out.println("Não é um ano bissexto");
                }
            }
            else{
                System.out.println("Não é um ano bissexto");
            }
        }
        else {
            System.out.println("Não é um ano bissexto");
        }
    }
}
