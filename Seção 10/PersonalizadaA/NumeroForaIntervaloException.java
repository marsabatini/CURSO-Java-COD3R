package Modulo_10.PersonalizadaA;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends RuntimeException{

    private String nomeDoAtributo;

    public NumeroForaIntervaloException(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O n�mero %s est� fora do intervalo.", nomeDoAtributo);
    }
}
