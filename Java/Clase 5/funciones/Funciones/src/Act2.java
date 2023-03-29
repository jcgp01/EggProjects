import java.util.Scanner;

/*Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique
si son mayores o menores de edad.


Después de cada persona, el
programa debe preguntarle al usuario si quiere seguir mostrando
personas y frenar cuando el usuario ingrese la palabra “No”.*/
public class Act2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String salida = "perro";

        do{
            datos();
            System.out.println("Seguir?");
            salida = leer.next();
        }while(!salida.equalsIgnoreCase("No"));


    }
    private static void datos(){
        Scanner leer = new Scanner(System.in);

        System.out.println("Nombre");
        String name = leer.next();

        System.out.println("Edad");
        int edad = leer.nextInt();

        if (edad > 18){
            System.out.println("El nombre de la persona es " + name + ", y tiene " + edad + " anios, y es mayor.");
        }
        else{
            System.out.println("El nombre de la persona es " + name + ", y tiene " + edad + " anios, y es menor.");
        }

    }
}
