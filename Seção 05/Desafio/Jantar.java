package Modulo_05.Desafio;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Jantar {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.nomePessoa = "João";
        p1.pesoPessoa = 40.0;

        Comida c1 = new Comida();
        c1.nomeComida = "Feijão";
        c1.pesoComida = 5.0;

        System.out.println(p1.nomePessoa);
        System.out.println("A pessoa pesava: " + p1.pesoPessoa);
        System.out.println("Agora ela pesa: " + p1.comer(c1));

    }
}
