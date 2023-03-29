import java.util.Scanner;

/*Escriba un programa que lea números enteros. Si el número
es múltiplo de cinco debe detener la lectura y mostrar la
cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio
anterior los números negativos no deben sumarse. Nota:
recordar el uso de la sentencia break.*/
public class Act8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num;
        int i = 0;
        int par = 0, impar = 0;

        do{
            System.out.println("Numero");
            num = leer.nextInt();

            if((num%2) == 0){
                par++;
            }
            else {
                impar++;
            }
            i++;
        }while((num % 5) != 0);

        System.out.println("Leidos: " + i);
        System.out.println("Pares: " + par);
        System.out.println("Impares: " + impar);
    }
}
