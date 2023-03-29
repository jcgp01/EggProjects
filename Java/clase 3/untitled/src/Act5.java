import java.util.Scanner;

/*Escriba un programa en el cual se ingrese un valor límite positivo,
 y a continuación solicite números al usuario hasta que la suma de
 los números introducidos supere el límite inicial.*/
public class Act5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        int suma = 0;
        int aux = 0;
        while (num >= suma){
            System.out.println("Ingrese un numero a sumar");
            aux = leer.nextInt();
            suma = aux + suma;
        }

    }
}
