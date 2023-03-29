import java.sql.SQLOutput;
import java.util.Scanner;

/*
* Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
* */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Frase");

        String frase = leer.next();

        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
}