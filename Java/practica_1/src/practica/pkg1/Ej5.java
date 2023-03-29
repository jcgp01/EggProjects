/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
package practica.pkg1;
import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Numero");
        
        int num = leer.nextInt();
        
        int doble = num * 2;
        System.out.println("El doble es: " + doble);
        
        int triple = num * 3;
        System.out.println("El triple es: " + triple);
        
        System.out.println("La raiz es: " + Math.sqrt(num));
    }
    
}
