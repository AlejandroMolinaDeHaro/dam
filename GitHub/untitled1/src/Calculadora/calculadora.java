package Calculadora;

public class calculadora {
    // atributos
        //operador1,operador2,tipoOperacion, resultado
    private int operador1, operador2;
    private double resultado;
    private String tipo;

    // metodos
        //suma, resta, multiplicacion, divison, modulo
    public void sumar(int operador1, int operador2) {
        this.operador1 = operador1;
        this.operador2 = operador2;
        this.resultado = this.operador1 + this.operador2;
        this.tipo = "suma";
    }

    public void resta(int operador1, int operador2){
        this.operador1 = operador1;
        this.operador2 =operador2;
        this.resultado = this.operador1 - this.operador2;
        this.tipo = "resta";
        System.out.println("resta terminada");
    }

    public void multiplicacion(int operador1, int operador2){
        this.operador1 = operador1;
        this.operador2 =operador2;
        this.resultado = this.operador1 * this.operador2;
        this.tipo = "multilicacion";
        System.out.println("multiplicacion terminada");
    }

    public void division(int operador1, int operador2){
        this.operador1 = operador1;
        this.operador2 =operador2;
        this.resultado = (double) this.operador1 / this.operador2;
        this.tipo = "division";
        System.out.println("division terminada");
    }

    public double getResultado(){
        return resultado;
    }
    public String getTipo(){
        return tipo;
    }


}
