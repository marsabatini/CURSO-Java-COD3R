package Modulo_07.oo.encapsulamento;

public class PessoaTeste {

    public static void main (String args[]){

        Pessoa p1 = new Pessoa("João", "Ribeiro", 30);
        p1.setIdade(-40);

        System.out.println(p1.getIdade());
        System.out.println((p1)); //chama o toString
        System.out.println(p1.nomeCompleto());

    }
}
