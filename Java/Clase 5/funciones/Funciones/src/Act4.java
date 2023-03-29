import java.util.Scanner;

/*Crea una aplicación que nos pida un número por teclado y con una función
se lo pasamos por parámetro para que nos indique si es o no un número primo,
debe devolver true si es primo, sino false.

Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
*/
public class Act4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese numero");
        int num = leer.nextInt();

        System.out.println(primo(num));
    }

    private static boolean primo(int x) {
        int cont = 1;
        for (int i = 1 ; i < x ; i++){
            if (x % i == 0){
                cont++;
            }
        }
        return cont <= 2;
    }
}
