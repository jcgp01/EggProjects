import java.util.Scanner;

/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo
de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un
formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter
tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().*/
public class Act7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        String letra;
        int contador1 = 0;
        int contador2 = 0;
        do {
            System.out.println("Ingrese una frase");
            frase = leer.next();
            int largo = frase.length();

            if (largo > 5) { //largo
                System.out.println("Incorrecto");
                contador2++;
            }
            else {  //primera letra
                letra = frase.substring(0, 1);

                if (!letra.equalsIgnoreCase("X")) {
                    System.out.println("Incorrecto");
                    contador2++;
                }
                else {  //ultima letra
                    int i = 0;
                    int j = 1;
                    do {
                        if (i < largo - 1){
                            letra = frase.substring(i, j);
                            i++;
                            j++;
                        }
                        else {
                            letra = frase.substring(i);
                        }
                    } while ((i <= largo - 1) && (letra.equals(" ")));
                    if (!letra.equalsIgnoreCase("O")) {
                        System.out.println("Incorrecto");
                        contador2++;
                    }
                    else{
                        contador1++;
                    }
                }
            }
            if (frase.equals("&&&&&")){
                contador2--;
            }
        }while (!frase.equals("&&&&&"));
        System.out.println("\nLos ingresos corrector fueron: " + contador1);
        System.out.println("\nLos ingresos incorrectos fueron: " + contador2);

    }
}
