
import  java.util.Scanner;

public class Ejercicio2 {

    /*
    en una empresa se haran aumentos segun la categoria, programe un algoritmo que calcule el nuevo salario
    segun su categoria, CAT1=15% , CAT2= 25% , CAT3 =45%

     */


    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);



        System.out.println("ingrese su nombre");
        String nombre = dato.nextLine();

        System.out.println("ingrese su categoria");
        int categoria = dato.nextInt();

        System.out.println("ingrese su salario");
        double salario= dato.nextDouble();

        double nuevoSalario= calcularAumento(salario,categoria);

        System.out.println(" señor(a) " + nombre + " su salario anterior era " + salario
        + " su nuevo salario es " + nuevoSalario + " su categoria es " +categoria);



    }

    public static double calcularAumento(double salario, int categoria) {


        switch (categoria) {

            case 1:
                salario= (salario*1.15);

            break;

            case 2:
                salario = (salario* 1.25);

            break;

            case 3:
                salario = (salario * 1.45);

            break;

            default:
                System.out.println("categoria no existente");
                break;


        }

        return salario;


    }


}