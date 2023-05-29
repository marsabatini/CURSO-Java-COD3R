package Modulo_06.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Aula125_Matriz {
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos alunos têm na turma?");
        System.out.print("Quantidade de alunos: ");
        int quantidadeAlunos = entrada.nextInt();

        System.out.println("Quantas notas por aluno?");
        System.out.print("Quantidade de notas: ");
        int quantidadeNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[quantidadeAlunos][quantidadeNotas];
        double total = 0;

        for(int a = 0; a < notasDaTurma.length; a++){
            for (int n = 0; n < notasDaTurma[a].length; n++){
                System.out.printf("Informe a nota do aluno %d do aluno %d: ", n + 1, a + 1);
                notasDaTurma[a][n] = entrada.nextDouble();
                total += notasDaTurma[a][n];
            }
        }

        double media = total / (quantidadeAlunos * quantidadeNotas);
        System.out.println("A média da turma é: " + media);

        for(double[] notasDoAluno: notasDaTurma){
            System.out.print(Arrays.toString(notasDoAluno));
        }

        entrada.close();
    }
}
