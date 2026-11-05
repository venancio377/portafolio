public class BubbleSort {

    // Contadores, se reinician en cada prueba
    static int totalPasadas;
    static int totalComparaciones;
    static int totalIntercambios;

    // Equivale al algoritmo del pseudocodigo en PSeInt
    public static void bubbleSort(int[] arreglo) {
        int n = arreglo.length;
        int pasada = 0;
        boolean huboIntercambio = true;

        totalPasadas = 0;
        totalComparaciones = 0;
        totalIntercambios = 0;

        // Condicion de paro: n-1 pasadas como maximo, o antes si no hubo intercambios
        while (pasada < n - 1 && huboIntercambio) {
            pasada++;
            huboIntercambio = false;

            // Los ultimos (pasada - 1) elementos ya estan en su lugar
            for (int j = 0; j < n - pasada; j++) {
                totalComparaciones++;
                if (arreglo[j] > arreglo[j + 1]) {
                    int auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                    totalIntercambios++;
                    huboIntercambio = true;
                }
            }

            System.out.print("Pasada " + pasada + ": ");
            mostrarArreglo(arreglo);
        }

        totalPasadas = pasada;
    }

    // Imprime el arreglo en una sola linea, separado por espacios
    public static void mostrarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    // Ejecuta una prueba completa con un arreglo dado
    public static void probar(String titulo, int[] arreglo) {
        System.out.println("=== " + titulo + " ===");
        System.out.print("Original: ");
        mostrarArreglo(arreglo);
        bubbleSort(arreglo);
        System.out.println("Total de pasadas: " + totalPasadas);
        System.out.println("Total de comparaciones: " + totalComparaciones);
        System.out.println("Total de intercambios: " + totalIntercambios);
        System.out.println();
    }

    public static void main(String[] args) {
        probar("Arreglo de ejemplo", new int[]{34, 12, 25, 8, 19});
        probar("Arreglo ya ordenado", new int[]{8, 12, 19, 25, 34});
        probar("Arreglo en orden inverso", new int[]{34, 25, 19, 12, 8});
    }
}