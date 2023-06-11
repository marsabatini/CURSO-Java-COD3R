package br.com.sabatini.cm;

import br.com.sabatini.cm.Modelo.Tabuleiro;
import br.com.sabatini.cm.Visao.TabuleiroConsole;

public class Aplicacao {
    public static void main(String[] args){

        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);

        new TabuleiroConsole(tabuleiro);

    }
}
