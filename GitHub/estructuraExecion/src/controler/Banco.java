package controler;

import model.CuentaCorriente;

public class Banco {
    private CuentaCorriente cuenta;
    private String nombre;

    public Banco(){}
    public Banco(String nombre){
        this.nombre = nombre;
    }

    public void darAltaCuenta(CuentaCorriente cuenta){
        this.cuenta = cuenta;
    }
    public void ingresarDinero(double saldoIngreso, int pin, String titular) throws NullPointerException {

            if (cuenta.getPin() == pin && cuenta.getTitular().equalsIgnoreCase(titular)) {

            } else {

            }

    }

    public CuentaCorriente getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaCorriente cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
