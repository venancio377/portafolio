package colas;

/**
 * Nodo de una lista enlazada que guarda un dato de tipo T.
 * @param <T> tipo del dato almacenado
 */
public class Nodo<T> {
    /** Valor almacenado en el nodo. */
    T dato;
    /** Referencia al nodo siguiente. */
    Nodo<T> siguiente;

    /**
     * Crea un nodo con el dato indicado.
     * @param dato valor a guardar
     */
    Nodo(T dato) {
        this.dato = dato;
    }
}