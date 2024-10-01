package Ejercicio4;

import java.util.Stack;

public class CalculadoraRPN {

    public static double evaluar(String secuencia){
        Stack<Double> stack = new Stack<>();

        String[] tokens = secuencia.split(" ");

        for (String token : tokens){
            if(isNumeric(token)){
                stack.push(Double.parseDouble(token));
            }else{
                double operando2 = stack.pop();
                double operando1 = stack.pop();

                switch(token){
                    case "+":
                        stack.push(operando1 + operando2);
                        break;
                    case "-":
                        stack.push(operando1 - operando2);
                    case "*":
                        stack.push(operando1 * operando2);
                        break;
                    case "/":
                        if(operando2 == 0){
                            throw new ArithmeticException("División por cero no permitida.");
                        }
                        stack.push(operando1 / operando2);
                        break;
                    default:
                        throw new ArithmeticException("Operador no soportado: " + token);
                }
            }
        }
        return stack.pop();
    }
    private static boolean isNumeric(String str){
        try{
            Double.parseDouble(str);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
}
