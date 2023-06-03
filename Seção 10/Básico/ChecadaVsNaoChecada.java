package Modulo_10.Basico;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) {

        try{
        geraErro1();
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        try {
            geraErro2();
        } catch (Throwable e){
            System.out.println(e.getMessage());
        }

        System.out.println("Fim");

    }

    // Exce��o N�O checada / N�O verificada
    static void geraErro1(){
        throw new RuntimeException("#1: Ocorreu um erro bem legal");
    }

    // Exce��o chegada / ou verificada
    static void geraErro2() throws Exception{
        throw new Exception("#2: Ocorreu um erro bem legal");
    }
}
