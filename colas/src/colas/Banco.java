package colas;

import java.util.Scanner;

/**
 * Simulación de una fila de banco con un solo cajero.
 * Usa ColaEnlazada para atender a los clientes en orden de llegada.
 */
public class Banco {
    /**
     * Muestra el menú en un ciclo hasta que el usuario elija salir.
     * @param args argumentos de línea de comandos (no se usan)
     */
    public static void main(String[] args) {
        ColaEnlazada<String> fila = new ColaEnlazada<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Llega un cliente");
            System.out.println("2. Atender al siguiente cliente");
            System.out.println("3. Ver quién sigue");
            System.out.println("4. Ver cantidad en espera");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpia el salto de línea pendiente

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del cliente: ");
                    String nombre = sc.nextLine();
                    fila.encolar(nombre);
                    System.out.println(nombre + " se unió a la fila.");
                    break;
                case 2:
                    if (fila.estaVacia()) {
                        System.out.println("No hay clientes en espera");
                    } else {
                        System.out.println("Atendiendo a: " + fila.desencolar());
                    }
                    break;
                case 3:
                    if (fila.estaVacia()) {
                        System.out.println("No hay clientes en espera");
                    } else {
                        System.out.println("Sigue: " + fila.frente());
                    }
                    break;
                case 4:
                    System.out.println("Clientes en espera: " + fila.tamanio());
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 5);

        sc.close();
    }
}