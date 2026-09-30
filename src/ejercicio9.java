import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("cuantas bebidas pides");
        int nBebidas = lector.nextInt();
        System.out.println("cuanto vale cada bebida");
        double bebibadaUnidad  = lector.nextDouble();
        System.out.println("cuantos bocas pides");
        int nBocatas = lector.nextInt();
        System.out.println("cuantp vale cada bocata");
        double bocataUnidad = lector.nextDouble();
        System.out.println("cuantos sois");
        int comensales = lector.nextInt();
        lector.close();
        double costeBebidas = nBebidas+bebibadaUnidad;
        double costeBocatas = nBocatas+bocataUnidad;
        double costeTotal = costeBebidas+costeBocatas;
        double costeIndividual = costeTotal / comensales;
        System.out.println("ARTICULO\t\t\t\tCANTIDAD\t\t\t\tCOSTE");
        System.out.printf("%s\t\t\t\t\t%d\t\t\t\t\t%.2f\t\t\t\t\t%.2f\n","Bebidas",nBebidas,bebibadaUnidad,costeBebidas);
        System.out.printf("%s\t\t\t\t\t%d\t\t\t\t\t%.2f\t\t\t\t\t%.2f\n","Bocatas",nBocatas,bocataUnidad,costeBocatas);
        System.out.printf("%s\t\t\t\t\t%d\t\t\t\t\t%.2f\t\t\t\t\t%.2f\n","Total",costeTotal,costeIndividual);
    }
}
