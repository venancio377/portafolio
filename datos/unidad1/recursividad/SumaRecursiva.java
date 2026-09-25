package datos.unidad1.recursividad;

public class SumaRecursiva {

    public static int sumaRecursiva(int[] datos, int tam) {

        if (tam <= 0) {
            return 0;
        } else {
            return datos[tam - 1] + sumaRecursiva(datos, tam - 1);
        }
    }

    public static void main(String[] a) {

        int[] data = {1, 2, 5, 8, 9, 10};
        int resultado = sumaRecursiva(data, data.length);

        System.out.println("La suma es: " + resultado);

    }
}