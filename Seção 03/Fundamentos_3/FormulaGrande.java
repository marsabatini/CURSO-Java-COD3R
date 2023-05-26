package Modulo_03.Fundamentos_3;



public class FormulaGrande {

    public static void main (String[] args){

        double primeiraParte = ((3 + 2) * 6);
        double priParteElevada = Math.pow(primeiraParte, 2)/ (3 * 2);

        double segundaParte = ((1 - 5) * (2 - 7) / 2);
        double segParteElevada = Math.pow(segundaParte, 2);

        double subDuasPartes = priParteElevada - segParteElevada;
        double subDuasPartesElevadas = Math.pow(subDuasPartes, 3);

        double resultadoParcial = Math.pow(10, 3);
        double resultadoFinal = subDuasPartesElevadas / resultadoParcial;

        System.out.println("O resultado é: " + priParteElevada);
        System.out.println("O resultado é: " + segParteElevada);
        System.out.println("O resultado final parcial é: " + subDuasPartesElevadas);
        System.out.println("O resultado final é : " + resultadoFinal);


    }
}
