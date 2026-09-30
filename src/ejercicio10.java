import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("dmillar");
        int dmillar = lector.nextInt();
        System.out.println("umillar");
        int umillar = lector.nextInt();
        System.out.println("centenas");
        int centenas = lector.nextInt();
        System.out.println("decenas");
        int decenas = lector.nextInt();
        System.out.println("unidades");
        int unidades = lector.nextInt();
        System.out.println("El numero completo es"+dmillar+umillar+centenas+decenas+unidades);
        System.out.println(""+dmillar+umillar+centenas+decenas+unidades);
        System.out.println(dmillar+umillar+centenas+decenas+unidades);
        System.out.println("indicame el numero completo");
        int numeroComleto = lector.nextInt();
        dmillar = numeroComleto/10000;
        umillar = (numeroComleto % 10000)/100;
        centenas = ((numeroComleto % 10000) % 1000)/100;
        decenas = (((numeroComleto % 10000) % 1000) % 100)/10;
        unidades = (((numeroComleto % 10000) % 1000) % 100) % 10;
        System.out.println("la descomposicion es");
        System.out.println("d millar"+dmillar);
        System.out.println("u millar"+umillar);
        System.out.println("centenas"+centenas);
        System.out.println("decenas"+decenas);
        System.out.println("unidades"+unidades);
        lector.close();
    }
}
