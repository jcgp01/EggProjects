import java.util.Scanner;

/*Leer la altura de N personas y determinar el promedio de estaturas
que se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.*/
public class Act6 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Cuantas personas?");
        int j = leer.nextInt();
        int mayor = 0, menor = 0, igual = 0;
        float promMay = 0, promMen = 0;
        float altura;

        for (int i = 0; i < j; i++){
            System.out.println("Altura");
            altura = leer.nextFloat();

            if (altura == 1.60){
                igual++;
            }else {
                if (altura > 1.6000001){
                    mayor++;
                    promMay = promMay + altura;
                }else{
                    if (altura < 1.60){
                        menor++;
                        promMen = promMen + altura;
                    }
                }
            }
        }
        promMen = promMen / menor;
        promMay = promMay / mayor;

        System.out.println("El promedio de las personas mayores es: " + promMay + "\n" + "El promedio de los menores es: " + promMen);
    }
}
