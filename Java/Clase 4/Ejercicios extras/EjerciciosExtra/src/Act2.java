import java.util.Scanner;

/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle
un valor diferente a cada una. A continuación, realizar las
instrucciones necesarias para que: *B tome el valor de C*, *C tome el
valor de A*, *A tome el valor de D* y *D tome el valor de B*. Mostrar los
valores iniciales y los valores finales de cada variable. Utilizar
sólo una variable auxiliar.
 */
public class Act2 {
    public static void main(String[] args) {

        int a = 0, b = 4, c = 5, d = 90;

        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("D: " + d);

        int aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;



        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("D: " + d);
    }
}
