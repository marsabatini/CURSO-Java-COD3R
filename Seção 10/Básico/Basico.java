package Modulo_10.Basico;

import Modulo_10.Aluno;

public class Basico {

    public static void main(String[] args) {

        Aluno a1 = null;

        try{
            imprimirNomeAluno(a1);
        } catch (Exception excecao){
            System.out.println("Ocorreu um erro ao imprimir o nome do aluno.");
        }

        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e){
            System.out.println("Seguinte erro: " + e.getMessage());
        }

        System.out.println("Fim!");

    }

    public static void imprimirNomeAluno(Aluno aluno){
        System.out.println(aluno.nome);
    }
}
