package ejerciciosGenerales;

import java.util.Scanner;

public class Ejercicios {
    public void ejerciciosAdicinacion() {
        Scanner lector = new Scanner(System.in);
        String respuesta;
        int record = Integer.MAX_VALUE;
        do {
            int aleatorio = (int)(Math.random() * 21);
            System.out.println(aleatorio);
            int numero, intentos =0;
            do {
                intentos++;
                System.out.println("Introduce el numero para adivinar");
                numero = lector.nextInt();
            }while (aleatorio != numero);
            System.out.println("El numero lo has adivinado en %d intentos\n", intentos);
            if (intentos < record){
            }
            System.out.println("quieres volver a jugar (S/N");
            String resouesta = lector.next();
        }while (respuesta.equalsIgnoreCase("s"));
        System.out.println("El recor de intentos ");
    }
}
