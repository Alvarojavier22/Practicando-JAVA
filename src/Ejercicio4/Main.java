package Ejercicio4;

import static Ejercicio4.CalculadoraRPN.evaluar;
public class Main {
    public static void main(String[] args) {
        String secuencia = "3 4 + 2 * 7 /";
        double result = evaluar(secuencia);
        System.out.println("El resultado es: " + result);
    }
}
