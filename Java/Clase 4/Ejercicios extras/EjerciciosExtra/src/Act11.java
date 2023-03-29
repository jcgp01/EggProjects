import java.util.Scanner;

/*Escribir un programa que lea un número entero
y devuelva el número de dígitos que componen ese número.
Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos
matemáticamente utilizando el operador de división.
Nota: recordar que las variables de tipo entero truncan los números o resultados.*/
public class Act11 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        int aux  = 0;
        do {
            num /= 10;
            aux ++;
        } while (num != 0);

        System.out.println("La cantidad de digitos es de " + aux);
    }
}
