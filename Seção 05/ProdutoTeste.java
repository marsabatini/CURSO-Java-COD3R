package Modulo_05;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Notebook"; // acessa o atributo
        p1.preco = 4356.89;
        //p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Caneta";
        p2.preco = 12.56;
        //p2.desconto = 0.29;

        Produto p3 = new Produto("Notebook", 4356.89);
        p3.nome = "Livro";
        p3.preco = 30.00;
        Produto.desconto = 0.50; // acessa o atributo desconto da classe Produto

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.preco * (1 - Produto.desconto);                        // aqui, faz a onta manualmente
        double precoFinal2 = p2.precoComDesconto(10.0);                                // aqui, chama o método precoComDesconto
        double precoFinal3 = p2.precoComDesconto(30.0);                                // aqui, chama o método precoComDesconto
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
        System.out.printf("Média do primeiro carrinho = R$ %.2f.\n", mediaCarrinho);

        double mediaCarrinho2 = (precoFinal1 + precoFinal2 + precoFinal3) / 3;
        System.out.printf("Média do segundo carrinho = R$ %.2f.\n", mediaCarrinho2);
    }
}
