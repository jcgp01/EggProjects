import java.util.Scanner;

/*Crea un procedimiento EsMultiplo que reciba los dos números
pasados por el usuario, validando que el primer número múltiplo
del segundo e imprima si el primer número es múltiplo del segundo,
sino informe que no lo son.*/
public class TeoAct2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese nums");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();

        EsMultiplo(num1, num2);
    }

    private static void EsMultiplo(int x, int y) {
        if (y % x == 0){
            System.out.println("Es multiplo");
        }
        else{
            System.out.println("No es multiplo");
        }

    }

}
