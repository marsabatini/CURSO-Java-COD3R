package Modulo_07.oo.heranca.Desafio;

public class Carro {

    public final int VELOCIDADE_MAXIMA;
    protected int velocidade;
    private int delta = 5;

    protected Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar(){

        if(velocidade + getDelta() > VELOCIDADE_MAXIMA){
            velocidade = VELOCIDADE_MAXIMA;
        } else {
            velocidade += getDelta();
        }
    }

    public void frear(){

        if(velocidade >= 5) {
            this.velocidade -= 5;
        } else
            velocidade = 0;
    }

    public String toString(){
        return "Velocidade atual é: " + velocidade;
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}
