package Modulo_06.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioAula123 {

    public static void main (String[] args){

        int quantidadeNotas = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas notas deseja informar?");
        System.out.print("Quantidade de notas: ");
        quantidadeNotas = entrada.nextInt();

        double[] notasAluno = new double[quantidadeNotas];

        for (int i = 0; i < quantidadeNotas; i++){
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notasAluno[i] = entrada.nextDouble();
        }

        double soma = 0;
        for(double i: notasAluno){
            soma += i;
        }

        System.out.println();
        System.out.println("Você digitou " + quantidadeNotas + " notas.");
        System.out.println("As notas digitadas foram: " + Arrays.toString(notasAluno));
        System.out.println("A soma das notas é: " + soma);
        System.out.println("A média das notas é: " + (soma/quantidadeNotas));
        entrada.close();
    }
}
