package Modulo_06.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("O pequeno príncipe");
        livros.push("Dom Quixote");
        livros.push("O Hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());
        System.out.println("-----------\n");

        for(String livro: livros){
            System.out.println(livro);
        }

        System.out.println("-----------\n");
        System.out.println(livros.poll());

        System.out.println(livros.remove());
        System.out.println(livros.pop());

        System.out.println("-----------");

        for(String livro: livros){
            System.out.println(livro);
        }
    }
}
