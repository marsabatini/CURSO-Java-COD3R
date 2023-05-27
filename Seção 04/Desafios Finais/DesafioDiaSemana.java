package Modulo_04;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main (String[] args){

        String dia;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o dia da semana: ");

        dia = entrada.nextLine();

        if (dia.equalsIgnoreCase("domingo")) {
            System.out.print("Você escolheu o dia 1 da semana");
        }
        else if (dia.equalsIgnoreCase("segunda") || dia.equalsIgnoreCase("segunda-feira")) {
            System.out.print("Você escolheu o dia 2 da semana");
        }
        else if (dia.equalsIgnoreCase("terca") || dia.equalsIgnoreCase("terca-feira")) {
            System.out.print("Você escolheu o dia 3 da semana");
        }
        else if (dia.equalsIgnoreCase("quarta") || dia.equalsIgnoreCase("quarta-feira")) {
            System.out.print("Você escolheu o dia 4 da semana");
        }
        else if (dia.equalsIgnoreCase("quinta") || dia.equalsIgnoreCase("quinta-feira")) {
            System.out.print("Você escolheu o dia 5 da semana");
        }
        else if (dia.equalsIgnoreCase("sexta") || dia.equalsIgnoreCase("sexta-feira")) {
            System.out.print("Você escolheu o dia 6 da semana");
        }
        else if (dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("sábado")) {
            System.out.print("Você escolheu o dia 7 da semana");
        }
        else
            System.out.print("Dia inválido");

        entrada.close();
    }
}
