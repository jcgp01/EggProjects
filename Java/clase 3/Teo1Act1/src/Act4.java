import java.util.Scanner;

/*
Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime ambas variables por pantalla.
Recomendamos que hagan el siguiente experimento: tipear en minúsculas la palabra sout y apenas terminamos
de escribirla tocar el botón tab o mejor dicho tabular.
Esto nos va a generar un System.out.println() para poder escribir lo que queramos.
*/
public class Act4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String name = "Juan Carlos";
        int edad = 24;

        System.out.println(name + "\n" + edad);
    }
}
