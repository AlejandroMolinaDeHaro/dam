package ejercicio7;

import java.util.Random;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Cuantas veces quieres lanzar el dado");
        int veces = lector.nextInt();
        if (veces<=0){
            veces = 100;
        }
        int vecesCara1=0,vecesCara2=0,vecesCara3=0,vecesCara4=0,vecesCara5=0,vecesCara6=0,vecesCara7=0;
        for (int i =0; i<veces; i++){
         //Random random = new Random ();
            //System.out.println(random.nextInt(7));
            //System.out.println((int)(Math.random()*6)+1);
            int aleatorio = (int)(Math.random()*6)+1;

            switch (aleatorio){
                case 1-> vecesCara1++;
                case 2-> vecesCara2++;
                case 3-> vecesCara3++;
                case 4-> vecesCara4++;
                case 5-> vecesCara5++;
                case 6-> vecesCara6++;
                case 7-> vecesCara7++;
            }
        }
        System.out.println("El numero de veces que ha salido el 1 es "+vecesCara1);
        System.out.println("El numero de veces que ha salido el 2 es "+vecesCara2);
        System.out.println("El numero de veces que ha salido el 3 es "+vecesCara3);
        System.out.println("El numero de veces que ha salido el 4 es "+vecesCara4);
        System.out.println("El numero de veces que ha salido el 5 es "+vecesCara5);
        System.out.println("El numero de veces que ha salido el 6 es "+vecesCara6);
        System.out.println("El numero de veces que ha salido el 7 es "+vecesCara7);
    }
}
