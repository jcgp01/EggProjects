/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package practica.pkg1;

import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Frase");
        String frase = leer.next();
        
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
    }
    
}
