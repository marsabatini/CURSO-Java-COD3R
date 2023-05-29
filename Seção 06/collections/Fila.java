package Modulo_06.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Ana");        // o add retorna erro se não conseguir adicionar na fila
        fila.offer("Bia");  // o offer retorna false se não conseguir adicionar na fila
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Gui");

        // peek: pega o primeiro elemento da fila
        System.out.println("\n---- peek() ----");
        System.out.println(fila.peek()); // peek: retorna null se não tiver ninguém
        System.out.println(fila.peek()); // continua retornar o primeiro porque não o exclui da fila
        System.out.println("------------");

        // element: pega o primeiro elemento da fila
        System.out.println("\n---- element() ----");
        System.out.println(fila.element()); // element: retorna erro se não tiver ninguém
        System.out.println(fila.element()); // continua retornar o primeiro porque não o exclui da fila
        System.out.println("------------");

        // poll: pega o primeiro elemento da fila
        System.out.println("\n---- poll() ----");
        System.out.println(fila.poll()); // poll: retorna null se não tiver ninguém
        System.out.println(fila.poll()); // retorna o próximo elemento da fila
        System.out.println("------------");

    }
}
