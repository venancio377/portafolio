public class EjercicioArreglos {

    static final int X = 6;

    public static double promedioPositivas(int[] temps) {
        int suma = 0;
        int contador = 0;

        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > 0) {
                suma += temps[i];
                contador++;
            }
            if (temps[i] < 0) {
                System.out.println("Temperatura bajo cero en el indice: " + i);
            }
        }

        if (contador == 0) {
            return 0;
        }
        return (double) suma / contador;
    }

    public static void analizarMatriz(int[][] m) {
        System.out.println("Stock total por sucursal:");
        for (int i = 0; i < m.length; i++) {
            int total = 0;
            for (int j = 0; j < m[i].length; j++) {
                total += m[i][j];
            }
            System.out.println("Sucursal " + (i + 1) + ": " + total);
        }

        System.out.print("Diagonal principal: ");
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i][i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("===== FASE 1 =====");
        int[] temperaturas = {12, -3, 4, 8, -1, X, 15, 2};
        double promedio = promedioPositivas(temperaturas);
        System.out.println("Promedio de temperaturas positivas: " + promedio);

        System.out.println("\n===== FASE 2 =====");
        int[][] inventario = {
            {10, 20,    15, 5},
            {8,  X + 5, 12, 30},
            {25, 14,    0,  18},
            {2,  9,     11, 40}
        };
        analizarMatriz(inventario);

        System.out.println("\n===== FASE 3 =====");
        int[][][] naves = new int[2][3][3];

        for (int e = 0; e < 2; e++) {
            for (int p = 0; p < 3; p++) {
                for (int a = 0; a < 3; a++) {
                    naves[e][p][a] = e + p + a + X;
                }
            }
        }

        System.out.println("Coordenadas [e][p][a] con valor par:");
        for (int e = 0; e < 2; e++) {
            for (int p = 0; p < 3; p++) {
                for (int a = 0; a < 3; a++) {
                    if (naves[e][p][a] % 2 == 0) {
                        System.out.println("[" + e + "][" + p + "][" + a + "] = "
                                + naves[e][p][a]);
                    }
                }
            }
        }
    }
}