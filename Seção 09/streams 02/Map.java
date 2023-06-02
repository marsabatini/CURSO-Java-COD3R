package Modulo_09.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");

//        public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
//        public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";


        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        System.out.println("Usando composição...");
        marcas.stream()
                .map(Utilitarios.maiuscula)
                .map(Utilitarios.primeiraLetra)
                .map(Utilitarios::grito)
                .forEach(print);

    }
}
