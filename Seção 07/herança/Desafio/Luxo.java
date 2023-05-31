package Modulo_07.oo.heranca.Desafio;

public interface Luxo {

    void ligarArCondicionado();

    void desligarArCondicionado();

    default int velocidadeDoAr(){
        return 1;
    }
}
