package colas;

public class Main {
    public static void main(String[] args) {
        ColaArreglo cola = new ColaArreglo(3);
        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);

        System.out.println("Sale: " + cola.desencolar());
        cola.encolar(40); // reutiliza la posición 0
        System.out.println("Frente: " + cola.frente());
        System.out.println("Tamaño: " + cola.tamanio());
        System.out.println("¿Llena? " + cola.estaLlena());
    }
}