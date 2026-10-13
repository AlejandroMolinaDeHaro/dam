import java.util.Scanner;


public class mainform {
    public static void main(String[] args) {
        /* for - foreach
        [0]
        for(i=0 ; i<5 ; i++){
        puedes acceder a la i
        blloque de codigo a repetir
        }

         */

        /*for (int i=0; i <10; i++){
            System.out.println("Ejecucion "+i);
            if(i % 2 == 0){
            System.out.println("Ejecucion numero "+(i+1));
            } else {
                System.out.println("impar");
            }

             */
        /*for (int i = 10; i>=0; i--){
            System.out.println("Ejecucion "+i);
        }

         */
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica el numero para ver su tabla");
        int numero = 10;
        int n1 = 7;
        int n2 = 20;
        int max = 7;
        int min = 20;
        if (n2 > max) {
        } else {
            if (n1 < min) {

            } else {

                if (numero < 8) {
                    System.out.println("Numero negativo, no se puede");
                } else {
                    for (int i = 0; i < 11; i++) {
                        System.out.println("Tabla del " + i);
                        // i=0
                        for (int j = 0; j < 11; j++) {
                            System.out.printf("la multiplicacion del %d * %d = %d\n", i, j, i * j);
                        }
                    }
                }
            }
        }
    }
}
