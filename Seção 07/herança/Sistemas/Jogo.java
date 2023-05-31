package Modulo_07.oo.heranca.Sistemas;

import Modulo_07.oo.heranca.Heroi;
import Modulo_07.oo.heranca.Monstro;

public class Jogo{

    public static void main (String args[]){

        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi(10, 11);

        heroi.x = 10;
        heroi.y = 11;

        System.out.println("Vida do monstro: " + monstro.vida);
        System.out.println("Vida do heroi: " + heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println();
        System.out.println("---- Após ataque ----");
        System.out.println("Vida do monstro: " + monstro.vida);
        System.out.println("Vida do heroi: " + heroi.vida);

    }
}
