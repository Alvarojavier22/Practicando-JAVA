package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        Scanner scanner = new Scanner(System.in);
        int option;
        do{
            System.out.println("\n--- Lista de tareas ---");
            System.out.println("1. Agregar tarea.");
            System.out.println("2. Eliminar tarea.");
            System.out.println("3. Mostrar todas las tareas.");
            System.out.println("4. Salir.");
            System.out.println("Elige una opción: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    System.out.println("Escriba la tarea a agregar: ");
                    String tarea = scanner.nextLine();
                    todoList.agregarTarea(tarea);
                    break;
                case 2:
                    System.out.println("Ingrese en índice de la tarea a eliminar: ");
                    int index = scanner.nextInt();
                    todoList.eliminarTarea(index);
                    break;
                case 3:
                    todoList.mostrarTareas();
                    break;
                case 4:
                    System.out.println("Saliendo .....");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }while(option != 4);
        scanner.close();
    }
}
