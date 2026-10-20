import java.util.Scanner;

public class mainwhile {
    public static void main(String[] args) {

        int i = 5;
        /*while (i>0){
            System.out.println("Imprimo");
            i--;
        }
         */
        Scanner lector =new Scanner(System.in);
        i = 10;
        do {
            System.out.println("1-opcion1");
            System.out.println("2-opcion2");
            System.out.println("3-opcion3");
            System.out.println("4-opcion4");
            System.out.println("Indica opcion ");
            int opcion = lector.nextInt();
            switch (opcion){
                case 1-> "1-opcion1" {

                }
            }
            i--;
        }while (i>0);
    }
}
