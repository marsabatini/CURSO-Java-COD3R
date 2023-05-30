package Modulo_07.oo.abstrato;

public class Cachorro extends Mamifero {

    @Override
    public String mover() {
        return "Usando as patas;";
    }

    @Override
    public String mamar() {
        return "Tomando leite";
    }
}
