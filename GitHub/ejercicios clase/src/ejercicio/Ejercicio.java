package ejercicio;

import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica el numero que quieres evaluar");
        int numero = lector.nextInt();

        if (numero<100 || numero>999){
            System.out.println("No es numero valido, no tiene 3 digitos");
        } else{
            int centenas = numero/100;
            int decenas = (numero%100)/10;
            int unidades = numero%10;
            int suma = (int) (Math.pow(centenas,3) + Math.pow(decenas,3) + Math.pow(unidades,3));
            //(centenas*centenas*centenas)+(decenas*decenas*decenas)+(unidades*unidades*unidades);
            /*if (suma == numero){
                System.out.println("Es armstrom");
            }else {
                System.out.println("No es armstron");
             */
                String mensaje = suma == numero ? "Es armstrong" : "No es armstrong";
            System.out.println(suma == numero ? "Es armstrong" : "No es armstrong");
            }
        }
    }
