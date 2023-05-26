package Modulo_03.Fundamentos_5;

import java.util.Scanner;

public class DesafioResposta {
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Informe o segundo número: ");
        double num2 = entrada.nextDouble();

        System.out.print("Informe o símbolo da operação: ");
        String op = entrada.next();

        //Lógica
        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);

        entrada.close();
    }
}
