import java.util.Scanner;

/*Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que
solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas
del curso.
*/
public class Act4 {
    public static void main(String[] args) {
        int Max = 2;
        double[] vector = new double[Max];


        llenaArreglo(vector, Max);
        mostrarArreglo(vector, Max);
        System.out.println("Aprobados: " + cantAprobs(vector, Max));
        System.out.println("Desaprobados: " + cantDesprobs(vector, Max));
    }

    private static int cantDesprobs(double[] arreglo, int Max) {
        int aux = 0;
        for(int i = 0; i < Max; i++){
            if (arreglo[i] < 7){
                aux++;
            }
        }
        return aux;
    }

    private static int cantAprobs(double[] arreglo, int Max) {
        int aux = 0;
        for(int i = 0; i < Max; i++){
            if (arreglo[i] >= 7){
                aux++;
            }
        }
        return aux;
    }

    private static void mostrarArreglo(double[] arreglo, int Max) {
        for(int i = 0; i < Max; i++){
            System.out.print(arreglo[i] + ", ");
        }
    }

    private static void llenaArreglo(double[] arreglo, int Max) {
        Scanner leer = new Scanner(System.in);
        int integrador1, integrador2, prac1, prac2;

        for(int i = 0; i < Max; i++){
            System.out.println("Nota primer trabajo práctico evaluativo");
            prac1 = leer.nextInt();
            System.out.println("Segundo trabajo práctico evaluativo");
            prac2 = leer.nextInt();
            System.out.println("Primer Integrador");
            integrador1 = leer.nextInt();
            System.out.println("Segundo integrador");
            integrador2 = leer.nextInt();
            arreglo[i] = (prac1 * 0.1 + prac2 * 0.15 + integrador1 * 0.25 + integrador2 * 0.5) / 4;
        }
    }
}
