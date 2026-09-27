import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        int cont = 0;
        double num;
        System.out.println("Ingrese números (0 para terminar):");
        num = sc.nextDouble();
        while (num != 0) {
            suma += num;
            cont++;
            num = sc.nextDouble();
        }
        if (cont > 0) {
            System.out.println("El promedio es: " + (suma / cont));
        } else {
            System.out.println("No se ingresaron números válidos.");
        }
        sc.close();
    }
}
