package Modulo_05;

public class Principal {
        public static void main(String[] args) {

                Data data1 = new Data(2022, "Janeiro", 11);
                //data1.ano = 2022;
                //data1.mes = "Janeiro";
                //data1.dia = 10;

                Data data2 = new Data();
                //data2.ano = 2022;
                //data2.mes = "Setembro";
                //data2.dia = 7;


                Data data3 = new Data();
                data3.ano = 2022;
                data3.mes = "Dezembro";
                data3.dia = 25;

                System.out.println("Data de teste: " + data1.dia + " de " + data1.mes + " de " + data1.ano);
                System.out.println(data2.dia + " de " + data2.mes + " de " + data2.ano + " data tão festiva, mais uma piada nessa terra tão querida.");

                System.out.print("Novo formato: " + data3.obterData());
        }
}
