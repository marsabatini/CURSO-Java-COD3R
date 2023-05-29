package Modulo_06.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_ConjuntoComportado {
    public static void main (String[] args){

        Set<String> listaAprovados = new HashSet<String>(); // Esse Set não respeita a ordem de inserção

        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for(String candidato: listaAprovados){
            System.out.println(candidato); // note que a ordem impressa está bagunçada
        }

        System.out.println("\n------------\n");

        // Pode começar tbem com SortedSet<>
        Set<String> listaAprovadosRespeitada = new TreeSet<String>();

        listaAprovadosRespeitada.add("Ana");
        listaAprovadosRespeitada.add("Carlos");
        listaAprovadosRespeitada.add("Luca");
        listaAprovadosRespeitada.add("Pedro");

        for(String candidato: listaAprovadosRespeitada){
            System.out.println(candidato); // note que a ordem impressa está bagunçada
        }

        System.out.println("\n------------\n");

        Set<Integer> nums = new HashSet<>(); // note que o Integer corresponde ao tipo primitivo int
        nums.add(1);
        nums.add(12);
        nums.add(6);
        nums.add(10);

        for(int n: nums){
            System.out.println(n);
        }

    }
}
