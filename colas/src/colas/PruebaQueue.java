package colas;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/** Prueba de la interfaz Queue con LinkedList y ArrayDeque. */
public class PruebaQueue {
    public static void main(String[] args) {
        Queue<String> cola = new ArrayDeque<>();
        // Prueba también: Queue<String> cola = new ArrayDeque<>();
        cola.offer("Ana");
        cola.offer("Luis");
        cola.offer("María");
        System.out.println(cola.peek());  // Ana (no la elimina)
        System.out.println(cola.poll());  // Ana (la elimina)
        System.out.println(cola.size());  // 2
        System.out.println(cola);         // [Luis, María]
    }
}