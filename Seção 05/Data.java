package Modulo_05;

public class Data {

    int ano;

    String mes;

    int dia;

    Data(){
        //ano = 1970;
        //mes = "Janeiro";
        //dia = 01;
        this(01, "Janeiro", 1970);
    }
    Data(int ano, String mes, int dia){

        this.ano = ano;
        this.mes = mes;
        this.dia = dia;

    }

    String obterData (){

        return String.format("%d de %s de %d", dia, mes , ano);
    }
}
