package Modulo_07.oo.heranca.Desafio;

public class Fusca extends Carro{


    public Fusca(){
        this(140);
    }

    public Fusca(int velocidadeMaxima){
        super(velocidadeMaxima);
        setDelta(10);
    }
//    public void acelerar() {
//        super.acelerar();
//    }
}
