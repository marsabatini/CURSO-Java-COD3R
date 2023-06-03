package Modulo_12;

public class CaixaObjetoTeste {

    public static void main(String[] args) {

        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.guardar(2.3); // double -> converte para classe Double

        Double coisaA = (Double) caixaA.abrir();
        System.out.println(coisaA);

        CaixaObjeto caixaB = new CaixaObjeto();
        caixaB.guardar("Olá");

        String coisaB = (String) caixaB.abrir();
        System.out.println(coisaB);

    }
}
