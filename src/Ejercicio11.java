import java.util.Scanner;

public class Ejercicio11 {
    Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese m: ");
    int m = sc.nextInt();
        System.out.print("Ingrese n: ");
    int n = sc.nextInt();

    int suma = 0;
    int inicio = Math.min(m, n);
    int fin = Math.max(m, n);

        for (int i = inicio; i <= fin; i++) {
        suma += i;
    }
        System.out.println("La suma es: " + suma);
        sc.close();
}
}
