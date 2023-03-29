/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package practica.pkg1;

import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Grados Celcius");
        
        int c = leer.nextInt();
        
        int f = 32 + (9 * c / 5);
        
        System.out.println(c + " grados celcius son " + f + " grados fahrenheit");
    }
    
}
