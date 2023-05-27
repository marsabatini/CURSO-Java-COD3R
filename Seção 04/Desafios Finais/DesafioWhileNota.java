package Modulo_04;

import java.util.Scanner;

public class DesafioWhileNota {
    public static void main (String[] args) {

        double nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0;
        double media = 0;
        int quantidadeNotas = 0;
        int contador = 1;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Para sair, digite \"-1\"");
        System.out.println("Para calcular a média, digite as notas bimestrais.");

        while ((nota1 != -1) || (nota2 != -1) || (nota3 != -1) || (nota4 != -1)){

            System.out.println("Digite as notas do aluno " + contador);
            System.out.print("Primeiro bimestre: ");
            nota1 = entrada.nextDouble();
            System.out.print("Segundo bimestre: ");
            nota2 = entrada.nextDouble();
            System.out.print("Terceiro bimestre: ");
            nota3 = entrada.nextDouble();
            System.out.print("Quarto bimestre: ");
            nota4 = entrada.nextDouble();

            media = (nota1 + nota2 + nota3 + nota4)/4;

            if (media < 0 && media > 10){
                System.out.println("Nota inválida" + "\n");
            }
            else if (media >= 7){
                System.out.println("Aluno aprovado.");
                System.out.println("A média do aluno foi " + media + "\n");
            }
            else {
                System.out.println("Aluno reprovado");
                System.out.println("A média do aluno foi " + media + "\n");
            }

            contador++;

        }
        System.out.printf("O total de notas digitadas foram: " + quantidadeNotas);

        entrada.close();
    }
}
