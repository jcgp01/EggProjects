/*
 * Escribir un programa que pida tu nombre,
lo guarde en una variable y lo muestre por pantalla.
 */
package practica.pkg1;

import java.util.Scanner;

public class Ej2 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Escribir Nombre");
        String nombre = leer.next();
        
        System.out.println(nombre);
    }
    
}