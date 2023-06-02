package Modulo_09.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        Consumer<String> print = System.out::print;
        Consumer<Integer> println = System.out::print;

        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");

        langs.forEach(print);

        String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };

        Stream.of(maisLangs).forEach(print);

        // Stream a partir de Array
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 0, 3).forEach(print);

        // Stream a partir das Colletions
        List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);

        // Stream de forma infinita
//        Stream.generate(() -> "a").forEach(print);
//        Stream.iterate(0 , n -> n + 1).forEach(println);


    }
}
