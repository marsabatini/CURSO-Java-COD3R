package Modulo_07.oo.composicao;

public class CarroTeste {
    public static void main(String[] args) {

        Carro c1 = new Carro();
        System.out.println(c1.estaLigado());

        c1.ligar();
        System.out.println(c1.estaLigado());

        System.out.println(c1.motor.giros());

        c1.acelar();
        c1.acelar();
        c1.acelar();
        c1.acelar();

        System.out.println(c1.motor.giros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();

        // Faltou o encapsulamento
        // c1.motor.fatorInjecao = -30;

        System.out.println(c1.motor.giros());

        // Relação bidirecional
        System.out.println(c1.motor.carro.motor.carro.motor.giros());
    }
}
