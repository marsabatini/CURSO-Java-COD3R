package Modulo_09.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class DesafioFilterBiblioteca {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String recebeNome;
        int opcao, recebeAno;

        DesafioFilter_Livro livro1 = new DesafioFilter_Livro("Assim falou Zaratustra", "Nietzsche", 1886, "alemão");
        DesafioFilter_Livro livro2 = new DesafioFilter_Livro("A hermenêutica do sujeito", "Foucault", 1974, "francês");
        DesafioFilter_Livro livro3 = new DesafioFilter_Livro("Terra sonâmbula", "Mia Couto", 1995, "sul-africano");

        List<DesafioFilter_Livro> livros = Arrays.asList(livro1, livro2, livro3);

        System.out.println("Bem-vindo à nossa biblioteca");
        System.out.println("Busca: ");
        System.out.println("\t1. Autor");
        System.out.println("\t2. Título");
        System.out.println("\t3. Ano de publicação");
        System.out.println("\t4. Nacionalidade");
        System.out.print("\nDigite sua opção: ");
        opcao = entrada.nextInt();
        entrada.nextLine();

        switch (opcao){

            case 1:
                System.out.print("Digite o nome: ");
                recebeNome = entrada.next();
                Predicate<DesafioFilter_Livro> porNome = pn -> pn.autor.contentEquals(recebeNome);

                Function<DesafioFilter_Livro, String> busca = a -> "\nAutor encontrado!\nSeu título é: " + a.titulo + "\nAno de pulicação: " + a.anoPublicacao + "\nNacionalidade: " + a.nacionalidade;

                livros.stream().filter(porNome).map(busca).forEach(System.out::println);
                break;

            case 2:
                break;

            case 3:
                System.out.print("Digite o ano: ");
                recebeAno = entrada.nextInt();

                Predicate<DesafioFilter_Livro> porAno = pa -> pa.anoPublicacao == recebeAno;

                Function<DesafioFilter_Livro, String> buscaAno = a -> "\nAno encontrado!\nAutor: " + a.autor + "\nTítulo: "+ a.titulo + "\nNacionalidade: " + a.nacionalidade;

                livros.stream().filter(porAno).map(buscaAno).forEach(System.out::println);

                break;



        }

//        recebeAno = entrada.nextInt();
//        Function<DesafioFilter_Livro, Integer> porAno = pa -> pa.anoPublicacao == recebeAno;

        entrada.close();

    }
}
