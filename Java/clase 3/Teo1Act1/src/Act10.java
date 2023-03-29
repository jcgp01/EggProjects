import java.util.Scanner;

/*Realizar un programa que lea 4 números (comprendidos entre 1 y 20)
e imprima el número ingresado seguido de tantos asteriscos como indique
su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
*/
public class Act10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int max = 20;
        System.out.println("Escribe 4 numeros");

        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int num3 = leer.nextInt();
        int num4 = leer.nextInt();

        for (int i = 0; i <= 20; i++){
            if (i == num1) {
                imprimirAsteriscos(i);
            }
            if (i == num2) {
                imprimirAsteriscos(i);
            }
            if (i == num3) {
                imprimirAsteriscos(i);
            }
            if (i == num4) {
                imprimirAsteriscos(i);
            }
        }
    }

    //funcion que imprime los asteriscos
    private static void imprimirAsteriscos(int x) {
        for (int i = 0; i < x; i++){
            System.out.print(" * ");
        }
        System.out.println("\n");
    }
}


