import java.util.Scanner;

/*Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
public class Act1 {
    public static void main(String[] args) {

        // Creo un arreglo llamado vector con dimensión 5 que
        // solo pueda alojar números enteros
        int[] vector = new int[100];

        for (int i = 0; i < vector.length; i++){
            vector[i] = i + 1;
        }

        for (int i = vector.length - 1; i >= 0; i--){
            if (i == 0){
                System.out.println(vector[i]);
            }
            else {
                System.out.print(vector[i] + ", ");
            }
        }
    }
}
