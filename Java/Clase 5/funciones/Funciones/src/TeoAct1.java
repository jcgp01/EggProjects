/*Escribir un programa que procese una secuencia de caracteres
ingresada por teclado y terminada en punto, y luego codifique
la palabra o frase ingresada de la siguiente manera: cada vocal
se reemplaza por el carácter que se indica en la tabla y el resto
de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
a = @
e = #
i = $
o = %
u = *

Realice un subprograma que reciba una secuencia de caracteres y
retorne la codificación correspondiente. Utilice la estructura “según”
para la transformación.
*/

import java.util.Scanner;

public class TeoAct1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese frase.");
        String msg = leer.nextLine();

        reescribir(msg);
    }

    private static void reescribir(String x) {
        String c;
        for (int  i = 0; i < x.length() ; i++){
            c = x.substring(i, i+1);
            switch (c){
                case "a":
                    System.out.print("@");
                break;
                case "A":
                    System.out.print("@");
                    break;

                case "e":
                    System.out.print("#");
                break;
                case "E":
                    System.out.print("@");
                    break;

                case "i":
                    System.out.print("$");
                break;
                case "I":
                    System.out.print("@");
                    break;

                case "o":
                    System.out.print("%");
                break;
                case "O":
                    System.out.print("@");
                    break;

                case "u":
                    System.out.print("*");
                break;
                case "U":
                    System.out.print("@");
                    break;

                default:
                    System.out.print(c);
            }

        }
    }
}
