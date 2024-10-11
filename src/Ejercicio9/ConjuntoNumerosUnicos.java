package Ejercicio9;

import java.util.TreeSet;

public class ConjuntoNumerosUnicos {
    public static void main(String[] args) {
        TreeSet<Integer> numerosUnicos = new TreeSet<>();

        numerosUnicos.add(5);
        numerosUnicos.add(10);
        numerosUnicos.add(1);
        numerosUnicos.add(20);
        numerosUnicos.add(3);

        System.out.println("---Numeros en el conjunto ordenados---");
        for(Integer num : numerosUnicos){
            System.out.println(num);
        }
        boolean agregado = numerosUnicos.add(10);
        if(!agregado){
            System.out.println("\n El numero 10 ya se encuentra en el conjunto.");
        }
        boolean eliminado = numerosUnicos.remove(3);
        if(eliminado){
            System.out.println("\n El numero 3 se eliminado.");
        }else {
            System.out.println("\n El numero 3 no se encuentra en el conjunto.");
        }
        System.out.println("\n---Numeros en el conjunto ordenados despues de la eliminación---");
        for(Integer num : numerosUnicos){
            System.out.println(num);
        }
    }
}
