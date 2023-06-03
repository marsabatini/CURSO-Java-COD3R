package Modulo_12.Generics;

public class CaixaTeste {

    public static void main(String[] args) {

        System.out.println("Objeto com String");
        Caixa<String> caixaA = new Caixa<>();
        caixaA.guardar("Segredo!");
        System.out.println(caixaA.abrir());

        String coisaA = caixaA.abrir();
        System.out.println(coisaA);


        System.out.println("\nObjeto com Double");
        Caixa<Double> caixaB = new Caixa<>();
        caixaB.guardar(3.1415);
        System.out.println(caixaB.abrir());

        Double coisaB = caixaB.abrir();
        System.out.println(coisaB);

    }
}
