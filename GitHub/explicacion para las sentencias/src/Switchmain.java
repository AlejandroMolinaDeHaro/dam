import java.util.Scanner;

public class Switchmain {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        /*
        System.out.println("Indica el numero que quieres evaluar");
        int numero = lector.nextInt();
        String mensaje;
        switch (numero) {

            // aqui no se escribe nada


            case 1:
                // aqui se hace lo que quieras
                System.out.println("Variable con valor 1");
                mensaje = "opcion 1";
                break;
            case 2:
                System.out.println("Variable con valor 2");
                mensaje = "opcion 2";
                break;
            case 3:
                System.out.println("Variable con valor 3");
                mensaje = "opcion 3";
                break;
            case 4:
                System.out.println("Variable con valor 4");
                mensaje = "opcion 4";
                break;
            case 5,6,7,8,9:
                System.out.println("Variable conjunta");
                mensaje = "opcion conjunta";
                break;
            default:
                System.out.println("Variable no conteplada");
                mensaje = "no conteplado";
                break;
        }

        System.out.println("El mensaje es"+mensaje);
         */
        /*
        System.out.println("introduce nombre");
        String nombre = lector.next();
        String mensaje = null;
        switch (nombre){
            case "Alejandro"-> {
                int dato = 10;
                mensaje = "nombre Alejandro";
                    System.out.println("El nombre introducido es Alejandro");
            }
            case "Maria"-> {
                int dato = 10;
                mensaje = "nombre Maria";
                    System.out.println("El nombre introducido es Maria");
            }
            default -> {
                mensaje = "nombre sin completar";
                    System.out.println("El nombre no contempado ");
            }
        }
        System.out.println(dato);
         */
        /*
        System.out.println("1 opcion 1");
        System.out.println("2 opcion 2");
        System.out.println("3 opcion 3");
        System.out.println("4 opcion 4");
        System.out.println("que opcion quieres realizar");
        int opcion = lector.nextInt();
        switch (opcion){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                break;
        }

         */
        System.out.println("indica la calificacion");
        char calificacion = lector.next().charAt(0);
        String mensaje = null;
        switch (calificacion){
            case 'A' ->{
                mensaje = "excelente";
            }
            case 'B' ->{
                mensaje = "Muy bien";
            }
            case 'C' ->{
                mensaje = "Bien";
            }
            case 'D' ->{
                mensaje = "regular";
            }
            case 'E' ->{
                mensaje = "mal ";
            }
            case 'F' ->{
                mensaje = "Muy mal";
            }
        }
        System.out.println("terminada la evaluacion");
        lector.close();
    }
}
