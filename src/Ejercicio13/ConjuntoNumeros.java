package Ejercicio13;

import java.util.NavigableSet;
import java.util.TreeSet;

public class ConjuntoNumeros {
    private NavigableSet<Integer> numeros;

    public ConjuntoNumeros() {
        numeros = new TreeSet<>();
    }
    public void agregarNumero(int numero) {
        numeros.add(numero);
    }
    public void mostrarInferioYSuperior(int numero){
        Integer inferior = numeros.lower(numero);
        Integer superior = numeros.higher(numero);
        if(inferior != null){
            System.out.println("El número inmediatamente inferior a " + numero + " es: " + inferior);
        }else {
            System.out.println("No hay ningún numero inferior a " + numero);
        }
        if(superior != null){
            System.out.println("El número inmediatamente superior a " + numero + " es: " + superior);
        }else {
            System.out.println("No hay numero superior a " + numero);
        }
    }
}
