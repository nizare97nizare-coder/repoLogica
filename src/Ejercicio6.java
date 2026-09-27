import java.util.Scanner;

public class Ejercicio6 {

    /*
    cree un progrma que lea un numero y muestre si este es divisible entre cinco o no
     */


    public static void main(String[] args) {


        Scanner dato= new Scanner(System.in);

        System.out.println("ingrese un numero");
        int numero = dato.nextInt();


        System.out.println("el numero "+ numero + definirNumero(numero));



    }

    public static String definirNumero(int numero){

        if(numero%5==0){

            return " El numero es divisible en 5";
        }else{
            return  " El numero no es divisble en 5";
        }


    }
}
