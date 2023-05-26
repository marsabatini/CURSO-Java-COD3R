package Modulo_03.Fundamentos_2;

import java.util.Scanner;

/*
    Programa realiza a média de três salário, convertendo a String em double e substituindo a vírgula por ponto.
 */

public class SegundoProgConversaoStrinNumero {

    public static void main (String[] args){

        String salario1;
        String salario2;
        String salario3;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro salário: ");
        salario1 = teclado.nextLine();
        double conversao1 = Double.parseDouble(salario1.replace(",","."));

        System.out.println("Digite o segundo salário: ");
        salario2 = teclado.nextLine();
        double conversao2 = Double.parseDouble(salario2.replace(",","."));

        System.out.println("Digite o terceiro salário: ");
        salario3 = teclado.nextLine();
        double conversao3 = Double.parseDouble(salario3.replace(",","."));

        double media = conversao1 + conversao2 + conversao3;
        System.out.printf("A média do salário é %.2f", media/3);

        teclado.close();

    }
}
