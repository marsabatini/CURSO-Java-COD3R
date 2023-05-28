package Modulo_05.Desafio;

public class Pessoa {

   String nomePessoa;
   double pesoPessoa;


   double comer(Comida resultado){


       this.pesoPessoa += resultado.pesoComida;

       return this.pesoPessoa;
   }
}
