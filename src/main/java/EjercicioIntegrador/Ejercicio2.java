package EjercicioIntegrador;

// En esta clase se ejecutan las operaciones.

import java.util.Objects;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String args[]) {

        Calculadora calculos = new Calculadora();

        int numero1;
        int numero2;
        int resultado = 0;
        String operacion;

        Scanner unaCalculadora = new Scanner(System.in);
        do {
//Se pide ingresar un primer número
        System.out.println("Ingrese el primer valor: ");
        numero1 = unaCalculadora.nextInt();
//Se pide ingresar otro número
        System.out.println("Ingrese el siguiente valor: ");
        numero2 = unaCalculadora.nextInt();
//Se pide el ingreso de la operacion a realizar
        System.out.println("Ingrese la operacion a realizar (+, -, *, /): ");
        operacion = unaCalculadora.next();

// Condicionales switch e if
            switch (operacion) {
                case "+":
                    resultado = calculos.sumar(numero1, numero2);
                    System.out.println("El resultado es: " + resultado);
                    break;
                case "-":
                    resultado = calculos.restar(numero1, numero2);
                    System.out.println("El resultado es: " + resultado);
                    break;
                case "*":
                    resultado = calculos.multiplicar(numero1, numero2);
                    System.out.println("El resultado es: " + resultado);
                    break;
                case "/":
                    resultado = calculos.dividir(numero1, numero2);
                    System.out.println("El resultado es: " + resultado);
            }
            if (resultado < 0) {
                System.out.println("El resultado es negativo, tene cuidado!");
            }
            if (resultado > 1000) {
                System.out.println("El resultado es numero grande");
            }
        }         while ((Objects.equals(operacion, "+"))||(Objects.equals(operacion, "-"))||(Objects.equals(operacion, "*"))||(Objects.equals(operacion, "/")));
    }
    }