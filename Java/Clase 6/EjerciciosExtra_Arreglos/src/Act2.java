import java.util.Scanner;

/*Escriba un programa que averigüe si dos vectores de N
enteros son iguales (la comparación deberá detenerse en
cuanto se detecte alguna diferencia entre los elementos).*/
public class Act2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int tamanio;
        boolean b = true;

        System.out.println("Ingrese cuandtos numeros seran");
        tamanio = leer.nextInt();
        int[] vector1 = new int[tamanio];
        int[] vector2 = new int[tamanio];



        for (int i = 0; i < tamanio; i++){
            System.out.println("Ingrese num");
            vector1[i] = leer.nextInt();
            vector2[i] = leer.nextInt();
        }

        for (int i = 0; i < tamanio; i++){
            if (vector2[i] != vector1[i]){
                b = false;
                break;
            }
        }

        if (b) {
            System.out.println("Son iguales");
        }
        else {
            System.out.println("Son desiguales");
        }
    }
}
