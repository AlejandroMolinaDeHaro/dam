import model.Jugador;

public class Entrada {
    // metodo main

    // acceso static retorno main (argumentos){algoritmo}
    public static void main(String[] args) {
        System.out.println("iniciamos el juego de los objetos");
        String nombre = "Alejandro";


        Jugador jugador1 =new Jugador();
        // correo = null nombre = null numeroVidas = 0 habilidad = 0 estrella = false
        jugador1.nombre = "Marta";
        jugador1.numeroVidas = 10;
        jugador1.estrella = true;
        System.out.println(jugador1.nombre);
        System.out.println(jugador1.numeroVidas);
        System.out.println(jugador1.estrella);


        Jugador jugador2 = new Jugador("Maria",5,100,true);
        // correo = null nombre = null numeroVidas = 0 habilidad = 0 estrella = false
        System.out.println(jugador2.nombre);
        System.out.println(jugador2.numeroVidas);
        System.out.println(jugador2.habilidad);
        System.out.println(jugador2.estrella);


        Jugador jugador3 = new Jugador("pepe",10,1000,false);
        // correo = null nombre = null numeroVidas = 0 habilidad = 0 estrella = false
        System.out.println(jugador3.nombre);
        System.out.println(jugador3.numeroVidas);
        System.out.println(jugador3.habilidad);
        System.out.println(jugador3.estrella);

        Jugador jugador4 = new Jugador("SR.Tortuga",100,100000,true);
        // correo = null nombre = null numeroVidas = 0 habilidad = 0 estrella = false
        System.out.println(jugador4.nombre);
        System.out.println(jugador4.numeroVidas);
        System.out.println(jugador4.habilidad);
        System.out.println(jugador4.estrella);

        Jugador jugador5 = new Jugador("Alejandro",50,200,true);
        // correo = null nombre = null numeroVidas = 0 habilidad = 0 estrella = false
        System.out.println(jugador5.nombre);
        System.out.println(jugador5.numeroVidas);
        System.out.println(jugador5.habilidad);
        System.out.println(jugador5.estrella);
    }
}
