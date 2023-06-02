package Modulo_09.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Reduce1 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma = (ac, n) -> ac + n;

        Integer total1 = nums.stream().reduce(soma).get();

        System.out.println(total1);

        //Parallel Stream passa o valor inicial para cada um dos números da lista
        Integer total2 = nums.parallelStream().reduce(100, soma);
        System.out.println(total2);

        //Stream passa o valor inicial apenas uma vez, somando-os
        Integer total3 = nums.stream().reduce(100, soma);
        System.out.println(total3);

        // Filter direto e ifPresent: mostra se o resultado estiver presente
        nums.stream()
                .filter(n -> n > 5)
                .reduce(soma)
                .ifPresent(System.out::println);

    }
}
