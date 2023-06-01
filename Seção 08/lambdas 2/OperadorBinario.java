package Modulo_08.lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {

        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2)/2;
        System.out.println(media.apply(9.8, 5.7));

        BiFunction<Double, Double, String> resultado1 = (n1, n2) -> ((n1 + n2)/2) >= 7 ? "Aprovado" : "Reprovado";
        System.out.println("Primeiro resultado: " + resultado1.apply(9.7, 5.1));
        System.out.println("");

        BiFunction<Double, Double, String> resultado2 = (n3, n4) -> {
            double notaFinal = (n3 + n4)/2;
            return notaFinal >= 7 ? "Aprovado" : "Reprovado";
        };
        System.out.println("Segundo resultado: " + resultado2.apply(9.7, 4.1));

        //Funcion recebe um valor Double do BinaryOperator
        System.out.println("\nFunction:");
        Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
        System.out.println("Terceiro resultado: " + media.andThen(conceito).apply(9.7, 4.1));

    }
}
