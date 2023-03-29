import java.util.Scanner;

/*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a
medida que el usuario las va ingresando, construya una “sopa de letras para niños”
de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal
en una fila que será seleccionada de manera aleatoria. Una vez concluida la
ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio
del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes
funciones de Java substring(), Length() y Math.random().*/
public class Act6 {
    public static void main(String[] args) {

        String[][] vector = new String[20][20];

        llenaArreglo(vector);

    }

    private static void llenaArreglo(String[][] vector) {
        String[] arreglo = new String[5];
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String palabra;

        //obtengo la palabra
        do {
            System.out.println("Ingrese frase de hasta 5 letras");
            palabra = leer.next();
            if (palabra.length() > 5){
                System.out.println("La palabra no es del largo correcto");
            }
        }while ((palabra.length() > 5) || (palabra.length() < 3));
        //pongo la palabra en el arreglo
        for(int i = 0; i < 20; i++){
            arreglo[i] = palabra.substring(i);
        }
        //pongo la palabra en el arreglo
        for(int i = 0; i < 20; i++){
            for (int j= 0; j < 20; j++){

            }
        }
    }
}
