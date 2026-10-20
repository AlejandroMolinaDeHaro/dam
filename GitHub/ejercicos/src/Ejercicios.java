import java.util.Locale;
import java.util.Scanner;

public class Ejercicios {
    public void ejerciciosAdivinacion(){
        Scanner lector = new Scanner(System.in);
        String respuesta;
        int record = Integer.MAX_VALUE;
        do {
            int aleatorio = (int) (Math.random()*21);
            System.out.println(aleatorio);
            int numero, intentos =0;
            do {
                intentos++;
                System.out.println("introduce el numero para adivinar");
                numero = lector.nextInt();
            }while (aleatorio != numero);
            System.out.printf("El numero lo has adivinado en %d\n" ,intentos);
            if (intentos<record){
                System.out.println("Record alcanzado, nuevo record");
                record = intentos;
            }
            System.out.println("Quieres volver a jugar (S/N)");
            respuesta = lector.next(); // S s N n
        }while (respuesta.equalsIgnoreCase("s"));
        System.out.println("El record de los intentos es de "+record);


    }
    public void ejercicioBanco(){
        Scanner lector = new Scanner(System.in);
        Cajero cajero = new Cajero();
        System.out.println("El saldo del cajero es de "+cajero.getSaldo());
        int opcion;
        do {
            System.out.println("1. Consultar saldo");
            System.out.println("2 Retirar saldo");
            System.out.println("3 Ingresar saldo");
            System.out.println("4 Salir");
            System.out.println("Que quires hacer");
            opcion = lector.nextInt();
            switch (opcion){
                case 1-> System.out.println("El saldo actual es de "+cajero.getSaldo());
                case 2->{
                    System.out.println("Cuanto dinero quieres retirar");
                    int dinero = lector.nextInt();
                    if (dinero < 1 || dinero > cajero.getSaldo()){
                        System.out.println("No se puede completar la operacion");
                    }else {
                        cajero.sacarDinero(dinero);
                    }
                }
                case 3->{
                    System.out.println("Cuanto dinero quieres ingresar");
                    int dinero = lector.nextInt();
                    if (dinero < 1){
                        System.out.println("No se puede completar la operacion");
                    }else {
                        cajero.ingresarDinero(dinero);
                    }
                }
                case 4-> System.out.println("Saaliendo...");
                default -> System.out.println("No se contempla");

            }
        }while (opcion!=4);
    }
    public void ejercicioSuelto(){
        Scanner lector = new Scanner(System.in);
        int sumatorio =0,mayores=0 ;
        for (int i = 0; i< 10; i++){
            int sueldo;
            do {
                System.out.println("Introduce un sueldo");
                sueldo = lector.nextInt();
            }while (sueldo<1);
            sumatorio +=sueldo;
            if (sueldo>1000) {
                mayores++;
            }

        }
        double media = (float)sumatorio/10;
        System.out.printf("El salario medo es de %.2f\n" ,media);
        System.out.printf("El numero de salarios mayores que mil es de %d\n" ,mayores);

    }
}
