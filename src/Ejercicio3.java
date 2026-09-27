import  java.util.Scanner;

public class Ejercicio3 {

    /*
    cree un prorama que lea la edad del usuario e imprima un mensaje que diga si es mayor de edad o no
     */


    public static void main(String[] args) {

        Scanner dato= new Scanner(System.in);

        System.out.println("ingrese su nombre");
        String nombre = dato.nextLine();

        System.out.println("ingrese su edad");
        int edad = dato.nextInt();

        System.out.println(nombre + definirEdad(edad));



    }

    public static String definirEdad (int edad){

        if(edad>=18){
            return  " es mayor de edad ";
        }
        else{
            return " es menor de edad ";
        }
    }



}
