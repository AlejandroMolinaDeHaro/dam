package model;

// importaciones
// molde del jugador
public class Jugador {
    // atributos -> variables que cualifican
    public String nombre,correo;
    public int Vidas, habilidad;
    public boolean estrella;

    // constructores -> hace realidad el objeto. 1 a n. Si no escribo nada tengo 1
    public  Jugador(){}



    //public Jugador( String nombreParametro, int vidasParametro, int habilidadParametro, boolean estrellaParametro ){
    //        nombre = nombreParametro;
    //        Vidas = vidasParametro;
    //        habilidad = habilidadParametro;
    //        estrella = estrellaParametro;
    // Esto tambien esta bien hecho pero es poco comun


        public Jugador(String nombre, int vidas, int habilidad, boolean estrella){
            this.nombre = nombre;
            this.Vidas = vidas;
            this.habilidad = habilidad;
            this.estrella = estrella;




    }

}
