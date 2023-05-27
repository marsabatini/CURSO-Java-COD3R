package Modulo_04;


public class DesafioLacoSemNumero {
    public static void  main (String[] args){


        // Versão A

        String valor = "#";

        char contadorAlf = 'a';
        char contadorFil = 'e';

        System.out.println("Versão A:");

        for (contadorAlf = 'a'; contadorAlf <= contadorFil; contadorFil--){

            System.out.println(valor);
            valor += "#";

        }

        //Versão B

        String valor2;

        System.out.println("\nVersão B:");

        for(valor2 = "#"; !valor2.equals("######"); valor2+="#"){

            System.out.println(valor2);
        }

    }
}
