package Ejercicio8;

import java.util.HashMap;

public class GestionEstudiantes {
    public static void main(String[] args) {
        HashMap<Integer, String> estudiantes = new HashMap<>();

        estudiantes.put(101, "Juan Perez");
        estudiantes.put(102, "Ana Lopez");
        estudiantes.put(103, "Maria García");
        estudiantes.put(104, "Carlos Sanchez");

        System.out.println("---Lista de estudiantes----");
        for(Integer id : estudiantes.keySet()){
            System.out.println("ID: " + id + ", Nombre: " + estudiantes.get(id));
        }
        int idBuscar = 102;
        if(estudiantes.containsKey(idBuscar)){
            System.out.println("\n Estudiante encntrado: ID " + idBuscar + "-> " + estudiantes.get(idBuscar));
        }else {
            System.out.println("\n El estudiante con ID " + idBuscar + " no existe");
        }

        int idEliminar = 103;
        if(estudiantes.containsKey(idEliminar)){
            estudiantes.remove(idEliminar);
            System.out.println("\n Estudiante con: ID " + idEliminar + " eliminado.");
        }else {
            System.out.println("\n El estudiante con ID " + idEliminar + " no existe");
        }
        System.out.println("\n---Lista de estudiantes actualizada----");
        for(Integer id : estudiantes.keySet()){
            System.out.println("ID: " + id + ", Nombre: " + estudiantes.get(id));
        }
    }
}
