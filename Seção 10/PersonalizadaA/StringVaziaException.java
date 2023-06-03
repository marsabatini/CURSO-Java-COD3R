package Modulo_10.PersonalizadaA;

public class StringVaziaException extends Throwable {
    private String nomeDoAtributo;

    public StringVaziaException(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo %s está vazio", nomeDoAtributo);
    }
}
