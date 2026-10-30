package colas;

/**
 * Cola FIFO sin límite de capacidad, basada en nodos enlazados.
 * @param <T> tipo de los elementos
 */
public class ColaEnlazada<T> {
    /** Primer nodo, de donde se elimina. */
    private Nodo<T> frente;
    /** Último nodo, donde se inserta. */
    private Nodo<T> fin;
    /** Cantidad actual de elementos. */
    private int tamanio;

    /** @return true si la cola no tiene elementos */
    public boolean estaVacia() {
        return frente == null;
    }

    /** @return cantidad de elementos en la cola */
    public int tamanio() {
        return tamanio;
    }

    /**
     * Agrega un valor al final de la cola.
     * @param valor elemento a insertar
     */
    public void encolar(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        if (estaVacia()) {
            frente = nuevo;
        } else {
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        tamanio++;
    }

    /**
     * Elimina y devuelve el elemento del frente.
     * @return el elemento que estaba al frente
     * @throws IllegalStateException si la cola está vacía
     */
    public T desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        T valor = frente.dato;
        frente = frente.siguiente;
        if (frente == null) {
            fin = null; // la cola quedó vacía
        }
        tamanio--;
        return valor;
    }

    /**
     * Consulta el elemento del frente sin eliminarlo.
     * @return el elemento al frente
     * @throws IllegalStateException si la cola está vacía
     */
    public T frente() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return frente.dato;
    }

    /**
     * Imprime los elementos del frente al final sin modificar la cola.
     * Recorre los nodos con una referencia auxiliar, de modo que
     * frente, fin y tamanio quedan intactos.
     */
    public void imprimirCola() {
        if (estaVacia()) {
            System.out.println("La cola está vacía");
            return;
        }
        Nodo<T> actual = frente;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    /**
     * Deja la cola sin elementos.
     * Al poner frente y fin en null, los nodos quedan sin referencias
     * y Java los libera de memoria.
     */
    public void vaciar() {
        frente = null;
        fin = null;
        tamanio = 0;
    }
}