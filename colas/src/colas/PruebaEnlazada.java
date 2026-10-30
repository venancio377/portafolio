package colas;

public class PruebaEnlazada {
    public static void main(String[] args) {
        ColaEnlazada<String> nombres = new ColaEnlazada<>();
        nombres.encolar("Ana");
        nombres.encolar("Luis");
        nombres.encolar("María");
        System.out.println(nombres.desencolar());
        System.out.println(nombres.frente());
        System.out.println(nombres.tamanio());
    }
}