import java.util.Scanner;

/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class Act4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Grados centígrados");
        int celsius = leer.nextInt();

        int far = 32 + (9 * celsius / 5);

        System.out.println(celsius + " grados celsius son " + far + " grados fahrenheit.");
    }
}
