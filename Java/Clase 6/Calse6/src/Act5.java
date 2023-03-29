import java.security.SecureRandom;
import java.util.Scanner;
/*Realizar un programa que rellene un matriz de 4 x 4 de
valores aleatorios y muestre la traspuesta de la matriz.
La matriz traspuesta de una matriz A se denota por B y
se obtiene cambiando sus filas por columnas (o viceversa).*/
public class Act5 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        SecureRandom random = new SecureRandom();
        boolean salida = true;

        for(int i = 0; i < matriz[0].length; i++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j] = random.nextInt(10);
                //matriz[i][j] = 1;
            }
        }

        System.out.println("\n\nMatriz normal ");

        for(int i = 0; i < matriz[0].length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n\nMatriz traspuesta");

        for(int i = 0; i < matriz[0].length; i++){
            for(int j = matriz.length - 1; 0 <= j; j--){
                System.out.print(matriz[j][i]);
            }
            System.out.println();
        }

        for(int i = 0; i < matriz[0].length; i++){
            for(int j = matriz.length - 1; 0 <= j; j--){
                if (matriz[i][j] != matriz[j][i]) {
                    salida = false;
                    break;
                }
            }
        }
        if (salida){
            System.out.println("La matriz es antisimetrica ");
        }
        else {
            System.out.println("La matriz no es antisimetrica ");
        }
    }
}
