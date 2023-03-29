import java.util.Scanner;

/*Escriba un programa que valide si una nota está entre 0 y 10,
sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la
nota sea correcta.*/
public class Act8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int nota = 11;

        do{
            System.out.println("Ingrese nota");
            nota = leer.nextInt();
        } while ((nota > 10) || (nota < 1));
    }
}
