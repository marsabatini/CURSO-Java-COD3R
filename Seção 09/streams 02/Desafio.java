package Modulo_09.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;


public class Desafio {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Consumer<Integer> print = System.out::println;

        //--------------------------------------
        System.out.println("\nLista: ");
        UnaryOperator<Integer> lista = n -> Integer.valueOf(n.toString());
        nums.stream().map(lista).forEach(print);

        //--------------------------------------
        System.out.println("\nConversão em binários:");
        UnaryOperator<Integer> binario = n -> Integer.parseInt(Integer.toBinaryString(n));
        nums.stream().map(binario).forEach(print);

        //--------------------------------------
        System.out.println("\nInversão da string:");
        UnaryOperator<String> inverter = i -> new StringBuilder(i).reverse().toString();
        nums.stream().map(Integer::toBinaryString).map(inverter).forEach(System.out::println);

    }
}
