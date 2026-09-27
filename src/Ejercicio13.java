
import java.util.Scanner;public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese número " + i + ": ");
            suma += sc.nextDouble();
        }
        System.out.println("El promedio es: " + (suma / 5));
        sc.close();
    }
}
