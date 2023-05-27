/*

    Jogo da adivinhação.
    Advinha um número entre 0 - 100.
    Armazena um número aleatório em uma variável.
    O Jogador tem 10 tentativas para adivinhar o número gerado.
    Ao final de cada tentativa, imprime a quantidade de tentativas restantes
    e se o número inserido é maior ou menor do que o número armazenado.

 */

package Modulo_04.exerciciosFinais;

import java.util.Random;
import java.util.Scanner;

public class Exercicio06 {
    public static void main (String[] args){

        int numeroJogado, contador;

        Scanner entrada = new Scanner(System.in);

        Random random = new Random();
        int numeroAleatorio = random.nextInt(0, 100);

        // System.out.print(numeroAleatorio);

        System.out.println("Bem-vindo ao jogo do Só-sei-que-nada-sei.");
        System.out.println("Você tem 10 tentativas para advinhar.");

        System.out.print("Tentativa 1: ");
        numeroJogado = entrada.nextInt();

        if (numeroJogado == numeroAleatorio){
            System.out.printf("Parabéns, acertou de primeira!!!");
        }
        else if (numeroJogado != numeroAleatorio) {
            for(contador = 2; contador <= 10; contador++) {

                System.out.println("Você errou! Tente novamente.");
                System.out.print("Tentativa " + contador + ": ");
                numeroJogado = entrada.nextInt();

                if (numeroJogado == numeroAleatorio){
                    System.out.print("Parabéns, acertou!");
                    break;
                }
                else if (numeroJogado > numeroAleatorio){
                    System.out.println("Você digitou um número maior!");
                    System.out.println("Agora possui apenas " + (10 - contador) + " tentativas.");
                }
                else if (numeroJogado < numeroAleatorio) {
                    System.out.println("Você digitou um número menor!");
                    System.out.println("Agora possui apenas " + (10 - contador) + " tentativas.");
                }
            }
        }
        else
            System.out.println("Infelizmente, você perdeu.");

        entrada.close();

    }
}
