import java.util.Scanner;

/*Dado un tiempo en minutos, calcular su equivalente en días y horas.
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe
calcular su equivalente: 1 día, 2 horas.*/
public class Act1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese los minutos");
        int min = leer.nextInt();

        int hs = min / 60;
        min = min % 60;

        int dias = hs / 24;
        hs = hs % 24;

        System.out.println(dias + ":" + hs);

    }
}
