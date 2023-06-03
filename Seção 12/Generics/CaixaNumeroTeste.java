package Modulo_12.Generics;

public class CaixaNumeroTeste {

    public static void main(String[] args) {

        Caixa<Double> caixaA = new Caixa<>();
        caixaA.guardar(2.3);
        System.out.println(caixaA.abrir());

        Caixa<Integer> caixaB = new Caixa<>();
        caixaB.guardar(123);
        System.out.println(caixaB.abrir());

    }
}
