import java.util.Scanner;

/*Realice un programa que calcule y visualice el valor máximo,
el valor mínimo y el promedio de n números (n>0). El valor de n
se solicitará al principio del programa y los números serán
introducidos por el usuario. Realice dos versiones del programa,
una usando el bucle “while” y otra con el bucle “do - while”.*/
public class Act7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Cuantas numeros?");
        int j = leer.nextInt();
        int mayor = 0, menor = 11;
        float prom = 0;
        int i = 0;
        int num = 0;

        while  (i < j){
             num = leer.nextInt();

            if (num > mayor){
                mayor = num;
            }
            if (num < menor){
                menor = num;
            }

            prom = prom + num;
            i++;
        }
        prom = prom / num;
        System.out.println("El promedio es " + prom);
        System.out.println("El mayor es " + mayor);
        System.out.println("El promedio es " + menor);

        do {
            num = leer.nextInt();

            if (num > mayor){
                mayor = num;
            }
            if (num < menor){
                menor = num;
            }

            prom = prom + num;
            i++;
        } while  (i < j);
        prom = prom / num;
        System.out.println("El promedio es " + prom);
        System.out.println("El mayor es " + mayor);
        System.out.println("El promedio es " + menor);
    }
}
