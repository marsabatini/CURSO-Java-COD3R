package Modulo_07.oo.polimorfismo;

public abstract class Comida {

    private double peso;

    Comida(double peso){
        setPesoA(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPesoA(double peso) {
        if(peso >= 0) {
            this.peso = peso;
        }
    }
}
