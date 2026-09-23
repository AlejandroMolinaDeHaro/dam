/**
 * @author Aljandro
 * @version 1.0
 */
public class Entrada {

    // aqui explicas brevemente para aclarar ideas
    // TODO esta tarea pendiente para el martes

    // mod_acceso retorno nombre (args){ funcionalidad }
    public static void main(String[] args){
       //ordenes a ejecutar
        // atajo es sout
        // para saltar linea es \n
        //segun el dato que guarda: String, char, byte/shot/int/long, double/float,
        //tipo nombre = valor

        String nombreLegal = new String("Alejandro");
        String nombre = "null";
        char letra = 'R';
        Character letraCompleta = 'a';
        int edad = 19;
        Integer numeroComplejo = 2;
        double altura = 1.70;
        Double alturaCompleta = 1.87;
        boolean acierto = false;
        Boolean aciertoCompleto = true;
        final String DNI = "123R";


        // segun la forma de contruirse: primitivos (solo guarda el valor) / complejos (ademas del valor se guarda una funcionalidad)
        // segun la mutabilidad del dato: mutables / no mutables (constante)
        // segun el scope de la variable: metodo (Bolque) / clase

        System.out.println("Mi DNI es " +DNI);
        System.out.println("Mi nombre es "+nombreLegal);
        System.out.println("La letra de mi DNI es "+letra);
        System.out.println("Mi edad es "+edad);
        System.out.println("Mi altura es "+altura);
        System.out.println("Funcion de moberse "+acierto);
        System.out.println("hola mundo");
        System.out.println(9*6);
        System.out.println(true);
        System.out.println(10.10);
        System.out.println("segunda linea");
        System.out.println(nombre.length());
        System.out.println("\tcuarta linea\n");
        //la suma de 9 y 6 es 15
        System.out.println("la suma de "+9+" y "+6+" tiene como resultado "+ (9+6));
    }


    /**
     * @param arg explica el parametro
     * @return explica el restart
     */
    public int metodo(String arg){ return 1;}
}
