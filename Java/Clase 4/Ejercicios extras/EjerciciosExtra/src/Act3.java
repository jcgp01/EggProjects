import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

/*Elaborar un algoritmo en el cuál se ingrese una letra
y se detecte si se trata de una vocal. Caso contrario
mostrar un mensaje. Nota: investigar la función equals()
de la clase String.*/
public class Act3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String vocal = leer.next();

        if ((vocal.equalsIgnoreCase("A")) || (vocal.equalsIgnoreCase("E")) || (vocal.equalsIgnoreCase("I")) || (vocal.equalsIgnoreCase("O")) || (vocal.equalsIgnoreCase("U"))) {
            System.out.println("Vocal");
        }
        else {
            System.out.println("No vocal");
        }
    }
}

