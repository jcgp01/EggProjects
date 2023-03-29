import java.util.Scanner;

/*Realizar un programa que llene una matriz de tamaño NxM con
valores aleatorios y muestre la suma de sus elementos.*/
public class Act5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int j;
        String[] arreglo = new String[5];
            String palabra;
            do {
                System.out.println("Ingrese frase de hasta 5 letras");
                palabra = leer.next();
                if (palabra.length() > 5) {
                    System.out.println("La palabra no es del largo correcto");
                }
            } while ((palabra.length() > 5) || (palabra.length() < 3));
            for (int i = 0; i < 5; i++) {
                j = i + 1;
                switch (palabra.length()){
                    case 3:
                        arreglo[i] = palabra.substring(i, j);
                        arreglo[3] = "0";
                        arreglo[4] = "0";
                        break;
                    case 4:
                        arreglo[i] = palabra.substring(i, j);
                        arreglo[4] = "0";
                        break;
                    case 5:
                        arreglo[i] = palabra.substring(i);
                        break;
                }
            }

        for (int i = 0; i < 5; i++) {
            System.out.println(arreglo[i]);
        }
/*
        int[][] vector = new int[5][4];
        llenaArreglo(vector);
        mostrarArreglo(vector);
        System.out.println("La suma es: " + mostrarSuma(vector));
    }

    private static int mostrarSuma(int[][] vector) {
        int aux = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                aux += vector[i][j];
            }
        }
        return aux;
    }

    private static void mostrarArreglo(int[][] vector) {
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(vector[i][j] + ", ");
            }
            System.out.println();
        }
    }

    private static void llenaArreglo(int[][] vector) {
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                vector[i][j] = (int)Math.floor(Math. random() * 10);
            }
        }
        */
    }
}
