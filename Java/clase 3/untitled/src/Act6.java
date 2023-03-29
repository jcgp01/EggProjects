import java.util.Scanner;

/*Realizar un programa que pida dos números enteros positivos por teclado
y muestre por pantalla el siguiente menú:El usuario deberá elegir una
opción y el programa deberá mostrar el resultado por pantalla y luego
volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.*/
public class Act6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int opc;
        int num1;
        int num2;

        do {
            System.out.println("Ingrese los nuemros");
            num1 = leer.nextInt();
            num2 = leer.nextInt();

            System.out.println("      MENU      ");
            System.out.println("      1. SUMAR      ");
            System.out.println("      2. RESTAR      ");
            System.out.println("      3. MULTIPLICAR      ");
            System.out.println("      4. DIVIDIR      ");
            System.out.println("      5. SALIR      ");
            System.out.println("      ELEGIR OPCION      ");

            opc = leer.nextInt();

            if (opc <= 5 || opc >= 1) {
                int cuenta;
                switch (opc) {
                    case 1:
                        cuenta = num1 + num2;
                        System.out.println("\n\n\n");
                        System.out.println("Resultado: " + cuenta + "\n");
                        break;

                    case 2:
                        cuenta = num1 - num2;
                        System.out.println("\n\n\n");
                        System.out.println("Resultado: " + cuenta + "\n");
                        break;

                    case 3:
                        cuenta = num1 * num2;
                        System.out.println("\n\n\n");
                        System.out.println("Resultado: " + cuenta + "\n");
                        break;

                    case 4:
                        if (num2 == 0) {
                            System.out.println("ERROR");
                        } else {/////////////////////////problema aqui.
                            double cuentaDiv = num1 / num2;
                            System.out.println("\n\n\n");
                            System.out.println("Resultado: " + cuentaDiv + "\n");
                        }
                        break;

                    case 5:
                        System.out.println("Saliendo.");
                        break;

                    default:
                        System.out.println("Opcion incorrecta");
                }
            }
        }while (opc != 5);
    }
}
