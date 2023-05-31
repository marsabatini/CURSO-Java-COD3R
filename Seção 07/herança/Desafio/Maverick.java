package Modulo_07.oo.heranca.Desafio;

public class Maverick extends Carro implements Esportivo, Luxo{

    private boolean ligarTurbo = false;
    private boolean ligarAr = false;

    public Maverick(){
        this(350);
    }

    public Maverick(int velocidadeMaxima){
        super(velocidadeMaxima);
        setDelta(20);
    }

    @Override
    public void ligarTurbo(){
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo(){
       ligarTurbo = false;
    }

    @Override
    public void ligarArCondicionado() {
        ligarAr = true;
    }

    @Override
    public void desligarArCondicionado() {
        ligarAr = false;
    }

    @Override
    public int getDelta() {
        if(ligarTurbo && !ligarAr) {
            return 35;
        } else if (ligarTurbo && ligarAr){
            return 30;
        } else if (!ligarTurbo && !ligarAr){
            return 20;
        } else {
            return 15;
        }
    }
}
