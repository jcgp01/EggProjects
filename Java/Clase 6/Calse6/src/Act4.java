import java.security.SecureRandom;
import java.util.Scanner;
/*Realizar un programa que rellene un matriz de 4 x 4 de
valores aleatorios y muestre la traspuesta de la matriz.
La matriz traspuesta de una matriz A se denota por B y
se obtiene cambiando sus filas por columnas (o viceversa).*/
public class Act4 {
    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        SecureRandom random = new SecureRandom();

        for(int i = 0; i < matriz[0].length; i++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j] = random.nextInt(10);
            }
        }

        System.out.println("Matriz normal \n\n");

        for(int i = 0; i < matriz[0].length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }

        System.out.println("Matriz traspuesta \n\n");

        for(int i = 0; i < matriz[0].length; i++){
            for(int j = matriz.length - 1; 0 <= j; j--){
                System.out.print(matriz[j][i]);
            }
            System.out.println("");
        }
    }
}
