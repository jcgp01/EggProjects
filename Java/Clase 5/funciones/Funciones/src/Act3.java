import com.sun.media.sound.SoftTuning;

import java.util.Scanner;

/*Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, *estas
pueden ser a dólares, yenes o libras. La función tendrá como parámetros,
la cantidad de euros y la moneda a convertir que será una cadena, este
no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/
public class Act3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Introducir la cantidad de euros");
        int euros = leer.nextInt();

        System.out.println("A que moneda desea cambiar?");
        String cambio = leer.next();

        conversor(cambio, euros);

    }
    private static void conversor(String moneda, int x){
        switch (moneda){
            case "libras":
                System.out.println(x + " euros son " + (x * 0.86) + " libras");
            break;

            case "dolar":
                System.out.println(x + " euros son " + (x * 1.28611) + " dolar");
            break;

            case "yenes":
                System.out.println(x + " euros son " + (x * 129.852) + " yenes");
            break;

            default:
                System.out.println("Moneda inexistente");
        }
    }
}
