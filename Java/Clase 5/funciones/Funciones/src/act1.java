import java.util.Scanner;

/*Crea una aplicación que le pida dos números al usuario y este
pueda elegir entre sumar, restar, multiplicar y dividir. La
aplicación debe tener una función para cada operación matemática
y deben devolver sus resultados para imprimirlos en el main. */
public class act1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Numero 1");
        int num1 = leer.nextInt();

        System.out.println("Que operacion quiere hacer?");
        String op = leer.next();

        System.out.println("Numero 2");
        int num2 = leer.nextInt();
        op.equalsIgnoreCase("No");
        switch (op){
            case "+":
                System.out.println(sumar (num1, num2));
            break;

            case "-":
                System.out.println(restar (num1, num2));
            break;

            case "*":
                System.out.println(mult (num1, num2));
            break;

            case "/":
                System.out.println(div (num1, num2));
            break;
            default:
                System.out.println("Error");
        }
    }

    private static int sumar (int x, int y){
        return x + y;
    }

    private static int restar (int x, int y){
        return x - y;
    }

    private static int mult (int x, int y){
        return x * y;
    }

    private static float div (int x, int y){
        if (y == 0){
            System.out.println("Error");
            return 99999999;
        }
        else {
            float num1, num2;
            num1 = x;
            num2 = y;
            return num1 / num2;
        }

    }
}
