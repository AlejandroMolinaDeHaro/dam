import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        System.out.println("Programa exceptcions");
        //Scanner scanner = new Scanner(System.in)
        int resultado = 0;
        boolean fallo = false;

            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("introduce el valor de op1");
                int op1 = scanner.nextInt();
                System.out.println("Introuce el valor de op2");
                int op2 = scanner.nextInt();
                if (op1 <0 || op2 <0){
                    throw new RuntimeException("Error en el ccodigo numerico");
                } else if (op1>100 || op2>100) {
                    throw new Exception("Fallos numeros muy grandes");
                }
                resultado = op1 / op2;
                System.out.println("El resultado es " + resultado);
            } catch (InputMismatchException e) {
                System.out.println("Error en la lectura de los operandos");
            fallo = true;
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        System.out.println("Procedemos a ejecutar errores de codigo");

        /*
        do {
            try {
                System.out.println("Introfduce el primer numero");
                int op1 = scanner.nextInt();
                System.out.println("Introduce el segundo numero");
                int op2 = scanner.nextInt();
                resultado = op1 / op2;
                fallo = false;
            }catch (InputMismatchException e){
                System.out.println("Algun dato de los introducidos no es correcto ");
                fallo = true;
            }catch (ArithmeticException e){
                fallo = true;
                System.out.println("El operando 2 no es valido, por favor introduce otro numero");
            }
        }while (fallo);
        scanner.close();
        System.out.println("El resultado de la division es " + resultado);
        */
        /*System.out.println("Ejecutamos el final del programa");
        int resultado = 100000000;
        String nombre = null;
        try {
            int op1 = 12;
            int op2 = 10;
            resultado = op1/op2;
            System.out.println("El resultado es "+resultado);
            if (nombre==null){
                nombre = "Luis";
                System.out.println(nombre.charAt(10));
            }
        }   catch (ArithmeticException e){
            System.out.println("El op2 ha producido un fallo");
            resultado = 0;
        } catch (NullPointerException e){
            System.out.println("Fallo en la variable nombre");
        } catch (Exception e){
            System.out.println("cualquier fallo que no sea de los anteriores");
        } finally {
            System.out.println("El resultado es "+resultado);
        }
        */

        System.out.println("Ejecutamos el final del programa");

    }
}
