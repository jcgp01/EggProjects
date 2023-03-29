import java.util.Scanner;

/*Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
*/
public class Act5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String socio;

        do{
            System.out.println("Que tipo de socio eres?");
            socio = leer.next();;
        }while ((!socio.equalsIgnoreCase("A")) && (!socio.equalsIgnoreCase("C")) && (!socio.equalsIgnoreCase("B") ));

        double costo = 100;

        if (socio.equalsIgnoreCase("A")){
            costo = costo - costo * 0.5;
        }
        else {
            if (socio.equalsIgnoreCase("B")) {
                costo = costo - costo * 0.35;
            }
        }
        System.out.println("El costo del tratamiento es: " + costo);
    }
}
