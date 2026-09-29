import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica cuantos segundos quieres pasar");
        int segundosSistema = lector.nextInt(); //34567
        // 1 hora -> 3600 (60 *60)
        // 1 hora -> 60 minutos
        // 1 minuto ->60 segundoss
        int horas = segundosSistema / 3600; // 9,601
        System.out.println("Horas "+horas);
        int segundosRestantes = segundosSistema%3600; // 0.601 segundos -> 1890 segundos
        System.out.println(segundosRestantes%3600);
        int minutos = segundosRestantes/60; // 36,11
        System.out.println("Minutos"+minutos);
        int segundos =(segundosRestantes%3600)%60;
        System.out.println("segundos "+segundos);
        lector.close();
    }
}
