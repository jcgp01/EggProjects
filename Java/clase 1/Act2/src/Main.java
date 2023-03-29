import java.util.Scanner;

/*
* Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
* */
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un nombre");
        String nombre = ("Juan Carlos");

        System.out.println(nombre);
    }
}