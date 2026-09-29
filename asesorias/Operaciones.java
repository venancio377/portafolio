public class Operaciones {

    public double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Operaciones op = new Operaciones();
        System.out.println("10 / 2 = " + op.division(10, 2));
    }
}