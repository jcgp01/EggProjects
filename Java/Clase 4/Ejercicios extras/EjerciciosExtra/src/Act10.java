import java.util.Scanner;
/*Realice un programa para que el usuario adivine el resultado
de una multiplicación entre dos números generados aleatoriamente
entre 0 y 10. El programa debe indicar al usuario si su respuesta
es o no correcta. En caso que la respuesta sea incorrecta se debe
permitir al usuario ingresar su respuesta nuevamente. Para realizar
este ejercicio investigue como utilizar la función Math.random() de
Java.*/
public class Act10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double num1, num2, producto;
        int numU;
        num1 = Math.round((Math.random() * 10));
        num2 = Math.round((Math.random() * 10));
        producto = num1* num2;
        System.out.println(producto);
        do {
            System.out.println("Ingrese un número entre 0 y 100");
            numU = leer.nextInt();
        } while (producto != numU);

        System.out.println("Adivinó el resultado del producto");

    }
}
/*
Otra forma de resolverlo
    Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Ingrese el numerado: ");
                int numerador = scan.nextInt();
                System.out.print("Ingrese el divisor: ");
                int divisor = scan.nextInt();
                int cociente = 0, residuo = 0;

                do {
                residuo = numerador - divisor;
                numerador = residuo;
                cociente++;
                } while (divisor <= residuo);

                System.out.println("residuo es " + residuo + " " + "y el cociente es " + cociente);
                num = (int) (Math.random() * 25 + 1);
*/