package Ejercicio2;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ListaNumeros {
    private LinkedList<Integer> numeros;

    public ListaNumeros() {
        numeros = new LinkedList<>();
    }
    public void agregarNumero(int numero){
        numeros.add(numero);
    }
    public void ordenarNumeros(){
        Collections.sort(numeros);
    }
    public void mostrarNumeros(){
        if(numeros.isEmpty()){
            System.out.println("La lista está vacía.");
        }else{
            System.out.println("Numeros de la lista: ");
            for(int numero : numeros){
                System.out.println(numero);
            }
        }
    }
}
