import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);

        System.out.println("CALCULADORA");

        System.out.println("ingrese la operacion que desea realizar");
        System.out.println("1)suma 2)resta 3)multiplicacion 4)divison");
        int operacion = dato.nextInt();


        System.out.println("ingrese el primer numero");
        double a = dato.nextDouble();

        System.out.println("ingrese el segundo numero");
        double b = dato.nextDouble();


        if(operacion==1){
            System.out.println(Calculadora.sumar(a,b));
        }else if(operacion==2){
            System.out.println(Calculadora.restar(a,b));
        }else if (operacion==3){
            System.out.println(Calculadora.multiplicar(a,b));
        } else if (operacion==4) {
            System.out.println(Calculadora.division(a,b));
        }


    }
}