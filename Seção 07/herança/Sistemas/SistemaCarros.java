package Modulo_07.oo.heranca.Sistemas;

import Modulo_07.oo.heranca.Desafio.Carro;
import Modulo_07.oo.heranca.Desafio.Fusca;
import Modulo_07.oo.heranca.Desafio.Maverick;

public class SistemaCarros {
    public static void main(String[] args) {


//        System.out.println(" --- Carro genérico --- ");
//        Carro carro = new Carro(10);
//        carro.acelerar();
//        carro.acelerar();
//        carro.acelerar();
//        carro.frear();
//        carro.frear();
//        System.out.println("Carro genérico: " + carro);

        Carro fusca = new Fusca();
        System.out.println("\n --- Fusca mil graus --- ");
        fusca.acelerar();
        System.out.println("Fusca acelerando: " + fusca);

        Maverick maverick = new Maverick(450);
        System.out.println("\n --- Maverick V8 --- ");
        maverick.acelerar();
        maverick.acelerar();
        System.out.println(maverick);
        maverick.ligarTurbo();
        System.out.println(maverick);
        maverick.velocidadeDoAr();
        System.out.println(maverick.velocidadeDoAr());

    }
}
