import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char respuesta = 'N';
        while (respuesta != 'S' && respuesta != 's') {
            System.out.print("¿Desea salir? (S/N): ");
            respuesta = sc.next().charAt(0);
        }
        System.out.println("Programa detenido.");
        sc.close();
    }
}
