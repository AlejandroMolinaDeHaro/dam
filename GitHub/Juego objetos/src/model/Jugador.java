package model;

// importaciones
// molde del jugador
public class Jugador {
    // atributos -> variables que cualifican
    public String nombre,correo;
    public int numeroVidas, habilidad;
    public boolean estrella;

    // constructores -> hace realidad el objeto. 1 a n. Si no escribo nada tengo 1
    public  Jugador(){}

    public Jugador( String nombreParametro, int vidasParametro, int habilidadParametro, boolean estrellaParametro ){
        nombre = nombreParametro;
        numeroVidas = vidasParametro;
        habilidad = habilidadParametro;
        estrella = estrellaParametro;
    }

}
