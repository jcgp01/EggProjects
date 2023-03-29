import java.util.Scanner;

/*Realizar un algoritmo que calcule la suma de todos los elementos
de un vector de tamaño N, con los valores ingresados por el usuario.
 */
public class Act01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int tamanio, aux = 0;
        System.out.println("Ingrese cuandtos numeros seran");
        tamanio = leer.nextInt();
        int[] vector = new int[tamanio];



        for (int i = 0; i < tamanio; i++){
            System.out.println("Ingrese num");
            vector[i] = leer.nextInt();
            aux += vector[i];
        }

        System.out.println("vector");
        for (int i = 0; i < tamanio; i++){
            System.out.print(vector[i] + ", ");
        }
        System.out.println("La suma es " + aux);
    }
}
