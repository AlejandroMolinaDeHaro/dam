import model.CuentaCorriente;

public class mainBanco {

    public static void main(String[] args) {
        CuentaCorriente c1 = new CuentaCorriente("Alejadnro",1000,1111);
        CuentaCorriente c2 = new CuentaCorriente("Pepe",100,3333);
        CuentaCorriente c3 = new CuentaCorriente();
        CuentaCorriente c4 = new CuentaCorriente("Pepe");
        CuentaCorriente c5 = new CuentaCorriente("Pepe",10000);
    }
}
