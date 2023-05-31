package Modulo_07.oo.polimorfismo;

public class Pessoa {

    private double peso;

    Pessoa(double peso){
        setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void comer(Comida comida){
        this.peso += comida.getPeso();
    }

    public void setPeso(double peso) {
        if(peso >= 0) {
            this.peso = peso;
        }
    }
}
