package Modulo_03.Fundamentos_5;

import java.util.Scanner;

public class DesafioModulo {
    public static void main (String[] args){

        char entrada;
        int parc1, parc2;
        int resultado;

        Scanner teclado = new Scanner(System.in);


        System.out.println("Bem-vindo à calcultadora 1.0\n");
        System.out.println("Por favor, escolha um dos seguintes operadores:");
        System.out.println("Operador\t\t\tSímbolo");
        System.out.println("Soma\t\t\t--> +");
        System.out.println("Subtração\t\t--> -");
        System.out.println("Multiplicação\t--> *");
        System.out.println("Divisão\t\t\t--> /");
        System.out.print("Digite o símbolo do operador acima: ");


        entrada = teclado.next().charAt(0);

        if (entrada == '+'){
            System.out.print("Digite o primeiro valor: ");
            parc1 = teclado.nextInt();
            System.out.print("Digite o segundo valor: ");
            parc2 = teclado.nextInt();
            resultado = parc1 + parc2;
            System.out.println("O valor da soma foi: " + resultado);
        }
        else if (entrada == '-') {

            System.out.print("Digite o primeiro valor: ");
            parc1 = teclado.nextInt();
            System.out.print("Digite o segundo valor: ");
            parc2 = teclado.nextInt();

            resultado = parc1 - parc2;
            System.out.println("O valor da subtração foi: " + resultado);
        }
        else if (entrada == '*') {

            System.out.print("Digite o primeiro valor: ");
            parc1 = teclado.nextInt();
            System.out.print("Digite o segundo valor: ");
            parc2 = teclado.nextInt();

            resultado = parc1 * parc2;
            System.out.println("O valor da multiplição foi: " + resultado);
        }
        else if (entrada == '/') {

            System.out.print("Digite o primeiro valor: ");
            parc1 = teclado.nextInt();
            System.out.print("Digite o segundo valor: ");
            parc2 = teclado.nextInt();

            resultado = parc1 / parc2;
            System.out.println("O valor da divisão foi: " + resultado);
        }
        else System.out.printf("Operador inválido.");
        teclado.close();
    }
}
