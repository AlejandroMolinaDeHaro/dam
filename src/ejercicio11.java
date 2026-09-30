import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Por favor intorduce un numero");
        int numeroAnalizar = lector.nextInt();
        lector.close();
        boolean esPar = numeroAnalizar%2 ==0;
        boolean esMayor = numeroAnalizar>50;
        System.out.println("es par"+esPar);
        System.out.println("es mayo que 50"+esMayor);
        System.out.println("es impar"+!esPar);
    }
}
