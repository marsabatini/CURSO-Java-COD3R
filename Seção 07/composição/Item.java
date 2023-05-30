package Modulo_07.oo.composicao;

import Modulo_05.Desafio.Comida;

public class Item {

    String nome;
    int quantidade;
    double preco;

    Compra compra;

    Item(String nome, int quantidade, double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
}
