import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("cantidad de grados C a pasar");
        final double FACTOR_CORRECTOR =273.15
        double gradosC = lector.nextDouble();
        double gradosF = (9*gradosC)/5 +32;
        double gradosK = gradosC +FACTOR_CORRECTOR;
        System.out.println("las conversiones de C son");
        System.out.printf("%.2fºC son %.2fªF y %.2fºK\n",gradosC,gradosF,gradosK);
        System.out.println("cantidad de grados F a pasar");
        gradosF = lector.nextDouble();
        gradosC = (5*(gradosF-32))/9;
        gradosK = gradosC +FACTOR_CORRECTOR;
        System.out.println("las conversiones de C son");
        System.out.printf("%.2fºC son %.2fªF y %.2fºK\n",gradosF,gradosC,gradosK);
        System.out.println("cantidad de grados K a pasar");
        gradosK = lector.nextDouble();
        gradosC = gradosK-FACTOR_CORRECTOR;
        gradosF =(9*gradosC)/5+32;
        System.out.println("las conversiones de C son");
        System.out.printf("%.2fºC son %.2fªF y %.2fºK\n",gradosK,gradosC,gradosF);
        System.out.println("cantidad de grados K a pasar");
        lector.close();
    }
}
