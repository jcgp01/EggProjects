import java.util.Scanner;

/*Escriba un programa que lea 20 números. Si el número leído es igual a
cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".
El programa deberá calcular y mostrar el resultado de la suma de los
números leídos, pero si el número es negativo no debe sumarse. Nota: recordar
el uso de la sentencia break.*/
public class Act9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num = 1;
        int max = 20;
        int suma = 0;

        while ((max != 0) && (num != 0)) {
            System.out.println("Ingrese numero");
            num = leer.nextInt();
            if (num == 0){
                System.out.println("Se capturó el numero cero");
            }
            else {
                suma = suma + num;
            }
            max--;
        }
        System.out.println("La suma es: " + suma);

    }
}
