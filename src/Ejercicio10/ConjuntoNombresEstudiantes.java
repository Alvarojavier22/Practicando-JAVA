package Ejercicio10;

import java.util.TreeSet;

public class ConjuntoNombresEstudiantes {
    public static void main(String[] args) {

        TreeSet<String> nombresEstudiantes = new TreeSet<>();

        nombresEstudiantes.add("Ana Pérez");
        nombresEstudiantes.add("Juan López");
        nombresEstudiantes.add("Carlos Sánchez");
        nombresEstudiantes.add("María García");
        nombresEstudiantes.add("Sofía Martínez");

        System.out.println("---Nombre de estudiantes en orden alfabetico---");
        for (String nombre : nombresEstudiantes) {
            System.out.println(nombre);
        }
    }
}
