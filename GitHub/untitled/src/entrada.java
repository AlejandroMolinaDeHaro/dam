import java.util.Scanner;

public class entrada {


    public static void main(String[] args){
        System.out.println("proyecto operadores");
        Scanner lector = new Scanner(System.in);
        System.out.println("intoduce tu nombre");
        String nombre = lector.nextLine();
        System.out.println("introduce el ciclo donde estas matriculado");
        String ciclo = lector.nextLine();
        System.out.println("que nota crees que sacaras al dinal del curso");
        int nota = lector.nextInt();
        System.out.println("Nombre:"+nombre);
        System.out.println("Ciclo:"+ciclo);
    }

}
