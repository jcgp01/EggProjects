//Crear un programa que dado un número determine si es par o impar.


import java.util.Scanner;

public class Act1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num = leer.nextInt();

        if ((num % 2) == 0) {
            System.out.println("El numero ingresado es par");
        }
        else {
            System.out.println("El numero ingresado es impar");
        }

    }
}
