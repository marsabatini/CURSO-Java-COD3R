package Modulo_07.Desafio1;

public class Principal {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Marco");

        Compra compra1 = new Compra();
        compra1.adicionarItem("Notebook", 1200.00, 3);
        compra1.adicionarItem(new Produto("Caneta", 3.0), 5);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno", 50.00, 10);
        compra2.adicionarItem(new Produto("Impressora", 350.0), 5);

        cliente.compras.add(compra1);
        cliente.compras.add(compra2);

        System.out.println(cliente.obterValorTotal());

    }
}
