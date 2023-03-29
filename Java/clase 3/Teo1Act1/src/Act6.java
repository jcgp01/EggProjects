import java.util.Scanner;
/*Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno de ellos es mayor a 25.*/
public class Act6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese numeros");

        int num1 = leer.nextInt();
        int num2 = leer.nextInt();

        if (num1 > 25){
            if (num2 > 25){
                System.out.println("Ambos valores son mayores a 25");
            }
            else {
                System.out.println("El numero 1 es mayoer a 25");
            }
        }
        if (num2 > 25){
            System.out.println("Ambos valores son mayores a 25");
        }
    }
}
