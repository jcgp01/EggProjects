import java.util.Scanner;

/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 * * * *
 *     *
 *     *
 * * * *
 */
public class Act8 {
   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Lado");
        int lado = leer.nextInt();

        for (int i = 0; i == lado-1; i++){
            for (int j = 0; j == lado-1; j++){
                if ((i == 0) || (i == lado-1)){
                    System.out.print(" *");
                }
                else{
                    if ((j == 0) || (j == lado-1)){
                        System.out.print(" *");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.print("\n\n");
        }
    }
   /*public static void main(String[] args) {
       Scanner scan = new Scanner(System.in).useDelimiter("\n");
       System.out.print("Por favor ingrese el tamaño del cuadrado: ");
       int n = scan.nextInt();

       if (n >= 0 && n <= 50) {
           //Linea superior
           for (int i = 0; i < n; i++) {
               System.out.print("*");
           }
           System.out.println();

           //centro de la forma
           for (int i = 0; i < n - 2; i++) {
               System.out.print("*");
               for (int j = 0; j < n - 2; j++) {
                   System.out.print(" ");
               }
               System.out.println("*");
           }

           //Linea inferior
           for (int i = 0; i < n; i++) {
               System.out.print("*");
           }
       } else {
           System.out.println("Error. El dato a ingresar de "
                   + "estar entre 0 y 50");
       }

   }*/
}
