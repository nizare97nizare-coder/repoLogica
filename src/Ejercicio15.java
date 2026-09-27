import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de estudiantes (n): ");
        int nEstudiantes = sc.nextInt();

        for (int i = 1; i <= nEstudiantes; i++) {
            System.out.println("Estudiante " + i + ":");
            double sumaNotas = 0;
            for (int j = 1; j <= 3; j++) {
                System.out.print("  Ingrese nota " + j + ": ");
                sumaNotas += sc.nextDouble();
            }
            System.out.println("  Promedio del estudiante " + i + ": " + (sumaNotas / 3));
        }
        sc.close();
    }
}
