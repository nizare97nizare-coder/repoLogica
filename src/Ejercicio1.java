
import  java.util.Scanner;
public class Ejercicio1 {

    /*
        Programe un algoritmo que diga si un estudiante gano o perdio una asignatura,para ganar
       debe ser mayor que 3.0
    */
    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);


        System.out.println("ingrese la nota obtenida");
        double nota = dato.nextDouble();

        System.out.println(evaluarEstado(nota));
    }
    public static String evaluarEstado(double nota) {

        if (nota > 3.0) {
            return "aprobo";
        } else {
            return "perdio";

        }

    }
}
