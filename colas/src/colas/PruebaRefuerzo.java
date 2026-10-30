package colas;

/** Prueba de los ejercicios de refuerzo imprimirCola() y vaciar(). */
public class PruebaRefuerzo {
    public static void main(String[] args) {
        ColaEnlazada<String> cola = new ColaEnlazada<>();
        cola.encolar("Ana");
        cola.encolar("Luis");
        cola.encolar("María");

        System.out.print("Cola: ");
        cola.imprimirCola();
        System.out.println("Tamaño después de imprimir: " + cola.tamanio());

        cola.vaciar();
        System.out.println("¿Vacía tras vaciar? " + cola.estaVacia());
        System.out.println("Tamaño: " + cola.tamanio());
        cola.imprimirCola();
    }
}