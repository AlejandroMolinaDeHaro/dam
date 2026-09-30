import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("indica el precio de la compra (con IVA)");
        double precioCompra = lector.nextDouble();// por consola el decimal es la , por IDO el decimal es el .
        System.out.println("Que IVA se te aplica");
        double iva = 1+lector.nextInt()/100.0; // 25/100.0 1.25
        lector.close();
        //cuanto has pagado de iva
        double precioSinIVA = precioCompra/iva;
        double precioIVA = precioCompra-precioSinIVA;
        System.out.println("calculos de precios");
        System.out.printf("Has pagado un total de &.2f de IVA sobre %.2f\n",precioIVA,precioCompra);
        lector.close();
    }
}
