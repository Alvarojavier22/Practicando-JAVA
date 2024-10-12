package Ejercicio14;

import java.util.NavigableSet;
import java.util.TreeSet;

//<>
public class Main {
    public static void main(String[] args) {
        NavigableSet<String> ciudades = new TreeSet<>();

        ciudades.add("Montevideo");
        ciudades.add("Madrid");
        ciudades.add("Bogota");
        ciudades.add("Lima");
        ciudades.add("Melbourne");

        NavigableSet<String> ciudadesDescendientes = ciudades.descendingSet();
        System.out.println("Ciudades en orden descendiente: " + ciudadesDescendientes);
    }
}
