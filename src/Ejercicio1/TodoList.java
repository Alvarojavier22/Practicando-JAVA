package Ejercicio1;

import java.util.LinkedList;

public class TodoList {
    private LinkedList<String> tareas;

    public TodoList(){
        tareas = new LinkedList<>();
    }
    public void agregarTarea(String tarea){
        tareas.add(tarea);
        System.out.println("Tarea agregada: " + tarea);
    }
    public void eliminarTarea(int index){
        if(tareas.isEmpty()){
            System.out.println("No hay tareas pendientes.");
        }else{
            System.out.println("Lista de tareas pendientes: ");
            for(int i = 0; i < tareas.size(); i++){
                System.out.println(i + ", " + tareas.get(i));
            }
        }
    }
    public void mostrarTareas(){
        if(tareas.isEmpty()){
            System.out.println("No hay tareas pendients.");
        }else{
            System.out.println("lista de tareas pendientes: ");
            for(int i = 0; i < tareas.size(); i++){
                System.out.println(i + ", " + tareas.get(i));
            }
        }
    }
}
