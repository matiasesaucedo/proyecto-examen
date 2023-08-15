package EjercicioIntegrador;
// Áca van los métodos suma, resta, multiplicación y división
public class Calculadora {

    public int numero1;
    public int numero2;
    public double resultado;

    public int sumar (int numero1,int numero2){
        int resultado = 0;
        resultado = numero1 + numero2;
        return resultado;
    }

    public int restar (int numero1,int numero2){
        int resultado = 0;
        resultado = numero1 - numero2;
        return resultado;
    }

    public int multiplicar (int numero1,int numero2){
        int resultado = 0;
        resultado = numero1 * numero2;
        return resultado;
    }

    public int dividir (int numero1,int numero2){
        int resultado = 0;
        resultado = numero1 / numero2;
        return resultado;
    }

}
