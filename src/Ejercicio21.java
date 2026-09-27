import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        int cont = 0;
        while (cont < 10) {
            System.out.print("Ingrese número " + (cont + 1) + ": ");
            suma += sc.nextDouble();
            cont++;
        }
        System.out.println("El promedio es: " + (suma / 10));
        sc.close();
    }
}
