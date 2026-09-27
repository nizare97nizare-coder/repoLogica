import  java.util.Scanner;

public class Ejercicio4 {

    /*
    cree un programa que lea los tres angulos internos de un triangulo y
    muestre si los angulos corresponden a un triangulo o no
     */


    public static void main(String[] args) {

        Scanner dato= new Scanner(System.in);

        System.out.println("ingrese el angulo 1");
        int angulo1= dato.nextInt();

        System.out.println("ingrese el angulo 2");
        int angulo2= dato.nextInt();

        System.out.println("ingrese el angulo 3");
        int angulo3= dato.nextInt();

        System.out.println(definirTriangulo(angulo1,angulo2,angulo3));


    }

    public static String definirTriangulo (int angulo1, int angulo2,int angulo3){

        if((angulo1+angulo2+angulo3==180)){
            return " si es un triangulo";
        }
        else{
            return  " no es un triangulo";
        }

    }
}
