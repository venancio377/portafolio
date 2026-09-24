public class Recursividad {

    public static void saludo(int total) {
        if (total <= 0)          // condición base
            return;
        else {                   // condición recursiva o repetitiva
            System.out.println("Hola");
            saludo(total - 1);
        }
    }

    public static void main(String[] a) {
        saludo(10);
    }
}