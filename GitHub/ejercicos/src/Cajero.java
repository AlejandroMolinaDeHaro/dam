public class Cajero {
    private int saldo;

    public Cajero(){
        saldo = 1000;

    }

    public  void ingresarDinero(int dinero){
        saldo+=dinero;
    }
    public void sacarDinero(int dinero){
        saldo -= dinero;
    }
    public int getSaldo(){
        return saldo;
    }

    public void getSaldo(int saldo) {
        this.saldo = saldo;
    }
}
