import java.util.Scanner;

/*
* Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
* El programa deberá después mostrar el resultado de la suma
* */
public class Main {
    public static void main(String[] args) {
        //Aca se crea una importante variable que se usara para leer
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int suma = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + suma);
    }
}