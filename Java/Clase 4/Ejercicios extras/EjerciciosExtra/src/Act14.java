import java.util.Scanner;

/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de
familias y para cada familia la cantidad de hijos para averiguar la
media de edad de los hijos de todas las familias.*/
public class Act14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int numF, numH, media,suma=0, edad = 0, aux = 0;

        System.out.println("Cantidad de familia");
        numF = leer.nextInt();
        System.out.println("cantidad hijos: ");
        do {
            System.out.print((aux + 1) + " Familia: ");
            numH = leer.nextInt();
            for (int i = 0; i < numH; i++) {
                System.out.print((i + 1) + " Hijo su edad: ");
                edad = leer.nextInt();
                edad += edad;
            }
            suma+=edad;
            numH += numH;
            aux++;
        } while (aux < numF);
        media = suma / numH;
        System.out.println("El total de hijo son: " + numH);
        System.out.println("El promedio de edades son: " + media);
    }

}
