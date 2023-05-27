/*

   Programa recebe duas notas parciais e calcula a média final.
   Se a nota do aluno for maior ou igual a 7.0, imprime no console "Aprovado",
   se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação";
   caso contrário, imprime no console "Reprovado".

 */


package Modulo_04.exerciciosFinais;

import java.util.Scanner;

public class Exercicio03 {
    public static void main (String[] args){

        double media = 0 , nota1 = 0, nota2 = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite as notas do aluno.");
        System.out.print("Nota 1: ");
        nota1 = entrada.nextDouble();

        System.out.print("Nota 2: ");
        nota2 = entrada.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media < 0 || media > 10.0){
            System.out.println("Nota inválida.");
        }
        else if (media >= 7.0){
            System.out.println("Aluno Aprovado.");
        }
        else if (media >= 4.0) {
            System.out.println("Aluno em Recuperação.");
        }
        else
            System.out.println("Aluno Reprovado.");

            entrada.close();
    }
}
