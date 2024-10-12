package Ejercicio16;

import java.util.Stack;

public class VerificarParentesis {
    public static void main(String[] args) {
        String expression = "( [ { } ] )";
        if(estaBalanceada(expression)){
            System.out.println("La expresión está balanceada.");
        }else {
            System.out.println("La expresión no está balanceada.");
        }
    }
    public static boolean estaBalanceada(String expression){
        Stack<Character> pila = new Stack<>();

        for(int i = 0; i < expression.length(); i++){
            char caracter = expression.charAt(i);

            if(caracter == '(' || caracter == '{' || caracter == '['){
                pila.push(caracter);
            }
            if(caracter == ')' || caracter == '}' || caracter == ']'){
                if(pila.isEmpty()){
                    return false;
                }
                char ultimo = pila.pop();

                if ((caracter == ')') && (ultimo != '(') ||
                        (caracter == '}') && (ultimo != '{') ||
                        (caracter == ']') && (ultimo != '[')) {
                    return false;
                }

            }
        }
        return pila.isEmpty();
    }
}
