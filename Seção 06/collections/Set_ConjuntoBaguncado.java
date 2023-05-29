package Modulo_06.collections;

import java.util.HashSet;
import java.util.Set;

public class Set_ConjuntoBaguncado {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        // não aceita tipos primitivos
        conjunto.add(1.2); // --> converte double em Double
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        //.size() --> para ver o tamanho do conjunto
        System.out.printf("Tamanho é %d\n", conjunto.size());

        // se houver o elemento para remover, retorna true; se não, retorna false
        System.out.println(conjunto.remove("Teste")); // serve para remover algum elemento do conjunto
        System.out.printf("Tamanho é %d\n", conjunto.size()); // note que subtraiu um elemento: de 5 para 4

        //.contains() --> serve para ver se um elemento contém algo
        System.out.println(conjunto.contains('x')); //se houver, retorna true; se não, retorna false
        System.out.println("-------------");

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);
        System.out.println("-------------");

        // União de conjuntos
        conjunto.addAll(nums); // soma o conjunto nums ao conjunto conjunto
        System.out.println(conjunto); // note que ele não mantém ordem de inclusão
        System.out.println("-------------");

        conjunto.remove(2);
        conjunto.remove(3);
        System.out.println(conjunto);

        //Intersećão de conjuntos
        conjunto.retainAll(nums);
        System.out.println(conjunto); // mostra apenas os resultados em comum entre os dois conjuntos
        System.out.println("-------------");

        // Limpa o conjunto
        conjunto.clear();
        System.out.println(conjunto);

    }
}
