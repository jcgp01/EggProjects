/*Crear una función rellene un vector con números aleatorios,
pasándole un arreglo por parámetro. Después haremos otra
función o procedimiento que imprima el vector.
 */
public class Act3 {
    public static void main(String[] args) {

        int[] vector = new int[5];
        llenaArreglo(vector);
        mostrarArreglo(vector);
    }

    private static void mostrarArreglo(int[] arreglo) {
        for(int i = 0; i < 5; i++){
            System.out.print(arreglo[i] + ", ");
        }
    }

    private static void llenaArreglo(int[] arreglo) {
        for(int i = 0; i < 5; i++){
            arreglo[i] = (int)Math.floor(Math. random() * 10);
        }
    }

}
