package Modulo_08.lambdas;


import java.text.NumberFormat;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;


public class Desafio {

    public static void main(String[] args) {



//        Locale meuLocal = new Locale("pt", "BR");
//        double precoReal = p.preco * (1 - p.desconto);
//        double valorDoImposto = precoReal;
//        double valorComFrete = precoReal;
//
////      String numeroFormatado = NumberFormat.getCurrencyInstance(meuLocal).format("R$ #.##0,##");
//
//
//        System.out.println("Pre?o inicial: " + NumberFormat.getCurrencyInstance(meuLocal).format(p.preco));
//        System.out.println("Pre?o com desconto: " + NumberFormat.getCurrencyInstance(meuLocal).format(precoReal));
//
//        Function<Double, String> impostoMuncipal = precoImposto -> precoImposto >= 2500 ? String.valueOf(valorDoImposto / 8.5) : "Isento";
//
//        System.out.println("Imposto Municipal: " + impostoMuncipal.apply(valorDoImposto));
////        System.out.println(numeroFormatado(Double.parseDouble(impostoMuncipal.apply(valorDoImposto))));
//
//        Function<Double, Double> valorFrete = frete -> p.preco >= 3000 ? valorComFrete + 100.00 : valorComFrete + 50.00;
//
//        System.out.println("Valor do frete: " + valorFrete.apply(valorComFrete));


        Function<Produto, Double> precoFinal = p -> p.preco * (1 - p.desconto);

        UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;

        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;

        UnaryOperator<Double> arredondar = preco -> Double.parseDouble( String.format("%.2f", preco));

        Function<Double, String> formatar = preco -> ("R$ " + preco).replace(".", ",");

        Produto p = new Produto("iPad", 3235.89, 0.13);

        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);

        System.out.println("O pre?o final é " + preco);

    }
}

