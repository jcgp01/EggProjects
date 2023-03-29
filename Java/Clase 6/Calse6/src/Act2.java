
import java.util.Scanner;
import java.security.SecureRandom;

/*Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario
un número a buscar en el vector. El programa mostrará dónde se encuentra el numero y si se
encuentra repetido*/
public class Act2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        SecureRandom random = new SecureRandom();
        int N = 10;
        int[] vector = new int[N];
        int cont = 0;

        for(int i = 0; i < vector.length; i++){
            vector[i] = random.nextInt(10);
        }

        System.out.println("Numero a buscar");
        int guess = leer.nextInt();

        for(int i = 0; i < vector.length; i++){
            if (guess == vector[i]){
                System.out.println("La posicion es: " + (i + 1));
                cont++;
            }
        }
        if (cont > 1){
            System.out.println("Esta repetido");
        }
        //for que muestra el arreglo

        for(int i = 0; i < vector.length; i++){
            System.out.println("Pos: " + i + "::::: Num: " + vector[i]);

        }
    }
}