import java.security.SecureRandom;
import java.util.Scanner;

/*Recorrer un vector de N enteros contabilizando cuántos números
son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).*/
public class Act3 {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] vector = new int[10];

        for(int i = 0; i < vector.length; i++){
            vector[i] = random.nextInt(100000);
        }
///////////////////////////////////////////////
        for (int i = 0; i < vector.length; i++) {
            int largoNum = 0;
            float aux = vector[i];
            while (aux > 1) {
                aux = aux / 10;
                largoNum++;
            }
            System.out.println("El numero " + vector[i] + "tiene " + largoNum + " numeros");
        }
    }
}
