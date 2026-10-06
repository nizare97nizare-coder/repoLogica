public class Calculadora {

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {

        if (b == 0) {
           System.out.println("error matematico");
           return 0;
        } else {
            return a / b;
        }
    }
}



