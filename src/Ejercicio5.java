import java.util.Scanner;

public class Ejercicio5 {

    /*
    cree un programa que lea un numero y muestre si este es par o impar
     */


    public static void main(String[] args) {

        Scanner dato= new Scanner(System.in);

        System.out.println("ingrese un numero");
        int numero = dato.nextInt();

        System.out.println(" el numero " + numero + definirPar(numero));




    }

    public static String definirPar (int numero){

        if(numero%2==0){
            return " es par";
        }
        else{
            return " es impar";
        }
    }


}


